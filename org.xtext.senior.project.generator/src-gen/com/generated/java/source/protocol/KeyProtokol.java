package com.generated.java.source.protocol;

import com.generated.java.source.*;

import java.util.Observable;
import java.util.Observer;

import protocol.cipher.BaseCipher;

import example.protocol.message.Message;

public class KeyProtokol<Cipher extends BaseCipher> implements Observer {

	private First<Cipher> first = null;

	private Second<Cipher> second = null;

	public KeyProtokol(

	First first

	,

	Second second

	) {

		this.first = first;
		this.first.addObserver(this);

		this.second = second;
		this.second.addObserver(this);

		init();
	}

	public void init() {

	}

	@Override
	public void update(Observable o, Object arg) {

		Message msg = (Message) arg;

		// GET EVENT
		if (msg.getTo().compareTo("First") == 0) {

			// CALL    
			FirstGetTransaction(msg);

		}

		else

		// GET EVENT
		if (msg.getTo().compareTo("Second") == 0) {

			// CALL    
			SecondGetTransaction(msg);

		}

	}

	private void FirstGetTransaction(

	Message Msg

	) {
		System.out.println("TRANSACION: FirstGetTransaction");

		// DECRYPT
		try {
			byte[] cryptedMessage = Msg.getMessage();
			byte[] realMsg = second.getCipher().decrypt(cryptedMessage);
			Msg.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// PRINT
		System.out.println(Msg.toString());

	}

	private void SecondGetTransaction(

	Message Msg

	) {
		System.out.println("TRANSACION: SecondGetTransaction");

		// DECRYPT
		try {
			byte[] cryptedMessage = Msg.getMessage();
			byte[] realMsg = first.getCipher().decrypt(cryptedMessage);
			Msg.setMessage(realMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// PRINT
		System.out.println(Msg.toString());

		// SEND
		Msg.setFrom(second.getClass().getSimpleName());
		Msg.setTo(first.getClass().getSimpleName());
		second.sendMessage(Msg);

	}

}
