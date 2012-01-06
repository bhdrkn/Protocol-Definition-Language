package com.generated.java.source;

import protocol.cipher.BaseCipher;
import example.protocol.message.Message;
import source.Participant;

public class First<Cipher extends BaseCipher>
		extends
			Participant<Message, Cipher> {

	public First(Cipher cipher) {
		super(cipher);
	}
	/*
	@Override
	public void sendMessage(Message msg) {
	    setChanged();
	    notifyObservers(msg);
	}
	 */

}
