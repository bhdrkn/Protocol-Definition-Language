package com.generated.java.source.protocol.test;

import com.generated.java.source.*;
import com.generated.java.source.protocol.*;

import protocol.cipher.*;

import example.protocol.message.Message;
import example.protocol.message.ProtocolType;

public class KeyProtokolTest implements Runnable {

	private First<SynchronousCipher> first = new First<SynchronousCipher>(
			new SynchronousCipher("KeyOfFirst"));

	private Second<SynchronousCipher> second = new Second<SynchronousCipher>(
			new SynchronousCipher("KeyOfSecond"));

	private KeyProtokol<SynchronousCipher> myBigProtocol = new KeyProtokol<SynchronousCipher>(

	first,

	second

	);

	public KeyProtokolTest() {

	}

	@Override
	public void run() {
		Message Msg = new Message(ProtocolType.None);
		Msg.setMessage("Bahadir Akin ITU");

		// SEND
		Msg.setFrom(first.getClass().getSimpleName());
		Msg.setTo(second.getClass().getSimpleName());
		first.sendMessage(Msg);

	}

	public static void main(String[] args) {
		Thread thread = new Thread(new KeyProtokolTest());
		thread.start();
	}
}
