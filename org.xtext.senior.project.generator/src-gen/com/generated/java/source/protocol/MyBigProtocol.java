package com.generated.java.source.protocol;

import com.generated.java.source.*;

import java.util.Observable;
import java.util.Observer;

import protocol.cipher.BaseCipher;

import example.message.Message;

public class MyBigProtocol<Cipher extends BaseCipher> implements Observer {

	private Alice<Cipher> alice = null;

	private Bob<Cipher> bob = null;

	private Trent<Cipher> trent = null;

	public MyBigProtocol(

	Alice alice,

	Bob bob,

	Trent trent

	) {

		this.alice = alice;
		this.alice.addObserver(this);

		this.bob = bob;
		this.bob.addObserver(this);

		this.trent = trent;
		this.trent.addObserver(this);

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO - This part must be generated from States
		Message msg = (Message) arg;

		if (o instanceof Trent) {

			if (

			msg.getFrom().compareTo("alice") == 0

			) {
				// Expand to Operation what about arg....
			}

			if (

			msg.getFrom().compareTo("bob") == 0

			) {
				// Expand to Operation what about arg....
			}

		}

		if (o instanceof Alice) {

			// Expand to Operation what about arg....

		}

		if (o instanceof Bob) {

			// Expand to Operation what about arg....

		}

	}

	private void trentFromAliceAction(

	Message m

	) {

		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = alice.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			byte[] realMsg = m.getMessage();
			byte[] cryptedMessage = bob.getCipher().encrypt(realMsg);
			m.setMessage(cryptedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

		m.setFrom(trent.getClass().getSimpleName());
		m.setTo(bob.getClass().getSimpleName());
		trent.sendMessage(m);

	}

	private void trentFromBobAction(

	Message m

	) {

		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = bob.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			byte[] realMsg = m.getMessage();
			byte[] cryptedMessage = alice.getCipher().encrypt(realMsg);
			m.setMessage(cryptedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

		m.setFrom(trent.getClass().getSimpleName());
		m.setTo(alice.getClass().getSimpleName());
		trent.sendMessage(m);

	}

	private void AliceAction(

	Message m

	) {

		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = alice.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(m.toString());

	}

	private void BobAction(

	Message m

	) {

		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = bob.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(m.toString());

	}

}
