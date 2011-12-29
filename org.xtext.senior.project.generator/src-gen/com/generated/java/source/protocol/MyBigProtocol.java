package com.generated.java.source.protocol;

import com.generated.java.source.*;

import java.util.Observable;
import java.util.Observer;

import protocol.cipher.BaseCipher;

import example.protocol.message.Message;

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

		init();
	}

	public void init() {

		// EXCHANGE
		trent.addCipher(alice.getClass().getSimpleName(), alice.getCipher());

		// EXCHANGE
		trent.addCipher(bob.getClass().getSimpleName(), bob.getCipher());

	}

	@Override
	public void update(Observable o, Object arg) {

		Message msg = (Message) arg;

		// SENDS EVENT
		if (o instanceof Alice) {

			// REDIRECT
			msg.setTo(trent.getClass().getSimpleName());

		}

		else

		// SENDS EVENT
		if (o instanceof Bob) {

			// REDIRECT
			msg.setTo(trent.getClass().getSimpleName());

		}

		// GET EVENT
		if (msg.getTo().compareTo("Trent") == 0) {

			if (

			msg.getFrom().compareTo("Alice") == 0

			) {

				// CALL    
				trentFromAliceAction(msg);

			}

			if (

			msg.getFrom().compareTo("Bob") == 0

			) {

				// CALL    
				trentFromBobAction(msg);

			}

		}

		else

		// GET EVENT
		if (msg.getTo().compareTo("Alice") == 0) {

			// CALL    
			AliceAction(msg);

		}

		else

		// GET EVENT
		if (msg.getTo().compareTo("Bob") == 0) {

			// CALL    
			BobAction(msg);

		}

	}

	private void trentFromAliceAction(

	Message m

	) {
		System.out.println("TRANSACION: trentFromAliceAction");

		// DECRYPT
		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = alice.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ENCRYPT
		try {
			byte[] realMsg = m.getMessage();
			byte[] cryptedMessage = bob.getCipher().encrypt(realMsg);
			m.setMessage(cryptedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// SEND
		m.setFrom(trent.getClass().getSimpleName());
		m.setTo(bob.getClass().getSimpleName());
		trent.sendMessage(m);

	}

	private void trentFromBobAction(

	Message m

	) {
		System.out.println("TRANSACION: trentFromBobAction");

		// DECRYPT
		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = bob.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ENCRYPT
		try {
			byte[] realMsg = m.getMessage();
			byte[] cryptedMessage = alice.getCipher().encrypt(realMsg);
			m.setMessage(cryptedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// SEND
		m.setFrom(trent.getClass().getSimpleName());
		m.setTo(alice.getClass().getSimpleName());
		trent.sendMessage(m);

	}

	private void AliceAction(

	Message m

	) {
		System.out.println("TRANSACION: AliceAction");

		// DECRYPT
		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = alice.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// PRINT
		System.out.println(m.toString());

	}

	private void BobAction(

	Message m

	) {
		System.out.println("TRANSACION: BobAction");

		// DECRYPT
		try {
			byte[] cryptedMessage = m.getMessage();
			byte[] realMsg = bob.getCipher().decrypt(cryptedMessage);
			m.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// PRINT
		System.out.println(m.toString());

	}

}
