/*
*   Copyright 2011 Bahadýr AKIN
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/
package protocol;

import java.util.Observable;
import java.util.Observer;

import protocol.cipher.BaseCipher;
import protocol.message.AbstractMessage;

import source.Arbitrator;
import source.Participant;

/**
 * MyProtocol runs like a listener. When a {@link Participant} sends a Message
 * Protocol cheks and decides where the message will be send.
 * 
 * In This protocol there are two {@link Participant} and one {@link Arbitrator}
 * 
 * In MyProtocol every Message first goes to {@link Arbitrator}
 * {@link Arbitrator} first decrypt the message according to who sends it. After
 * decryption, {@link Arbitrator} encrypt it according to destination. All of
 * the process is doing by this class. Because all of these processes are part
 * of the protocol.
 * 
 * IMPORTANT: Protocol, {@link Arbitrator} and {@link Participant} must use same
 * Cipher class.
 * 
 * @author BahadÄ±r AKIN
 * 
 * @param <Message>
 *            Every protocol has its own Message Class. The Message Class must
 *            be subclass of {@link AbstractMessage}
 * @param <Cipher>
 *            Every protocol hast its own Cipher Class. The Cipher Class must be
 *            subclass of {@link BaseCipher}.
 */
@SuppressWarnings("unchecked")
public class MyProtocol<Message extends AbstractMessage, Cipher extends BaseCipher>
		implements Observer {

	private Participant<Message, Cipher> first = null;
	private Participant<Message, Cipher> second = null;
	private Arbitrator<Message, Cipher> arbitrator = null;

	/**
	 * 
	 * @param first
	 *            First {@link Participant} of the Protocol
	 * @param second
	 *            Second {@link Participant} of the Protocol
	 * @param arbitrator
	 *            {@link Arbitrator} of the Protocol
	 * @see {@link Participant} {@link Arbitrator}
	 */
	public MyProtocol(Participant<Message, Cipher> first,
			Participant<Message, Cipher> second,
			Arbitrator<Message, Cipher> arbitrator) {
		this.first = first;
		this.second = second;
		this.arbitrator = arbitrator;

		this.first.addObserver(this);
		this.second.addObserver(this);
		this.arbitrator.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		Message msg = (Message) arg;

		if (o instanceof Participant) {
			if (msg.getTo().compareTo(this.second.getClass().getSimpleName()) == 0) {
				sendArbitrary(o, msg);
			} else if (msg.getTo().compareTo(
					this.first.getClass().getSimpleName()) == 0) {
				sendArbitrary(o, msg);
			}
		} else if (o instanceof Arbitrator) {
			if (msg.getTo().compareTo(this.first.getClass().getSimpleName()) == 0) {
				toFirst(o, msg);
			} else if (msg.getTo().compareTo(
					this.second.getClass().getSimpleName()) == 0) {
				toSecond(o, msg);
			}
		}
	}

	/**
	 * If {@link Arbitrator} wants to send the Message to Second
	 * {@link Participant} he uses this function
	 * 
	 * @param o
	 *            Source object
	 * @param msg
	 *            Message that send from a {@link Participant}
	 */
	private void toSecond(Observable o, Message msg) {
		try {
			byte[] secondCrypt = msg.getMessage();
			byte[] realMsg = second.getCipher().decrypt(secondCrypt);
			msg.setMessage(realMsg);
			second.setMessage(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * If {@link Arbitrator} wants to send the Message to First
	 * {@link Participant} he uses this function
	 * 
	 * @param o
	 *            Source object
	 * @param msg
	 *            Message that send from a {@link Participant}
	 */
	private void toFirst(Observable o, Message msg) {
		try {
			byte[] firstCrypt = msg.getMessage();
			byte[] realMsg = first.getCipher().decrypt(firstCrypt);
			msg.setMessage(realMsg);
			first.setMessage(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * If A message came from a {@link Participant} it directly goes to
	 * {@link Arbitrator} to rearrange message by using right cipher
	 * 
	 * @param o
	 *            Object that sends the msg
	 * @param msg
	 *            Message from the source
	 * 
	 * @see {@link Participant} {@link Arbitrator}
	 */
	private void sendArbitrary(Observable o, Message msg) {
		if (msg.getFrom().compareTo(first.getClass().getSimpleName()) == 0) {
			try {
				byte[] firstCrypt = msg.getMessage();
				byte[] realMsg = arbitrator.getCipher(
						first.getClass().getSimpleName()).decrypt(firstCrypt);
				byte[] secondCrypt = arbitrator.getCipher(
						second.getClass().getSimpleName()).encrypt(realMsg);
				msg.setMessage(secondCrypt);
				arbitrator.sendMessage(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (msg.getFrom().compareTo(second.getClass().getSimpleName()) == 0) {
			try {
				byte[] secondCrypt = msg.getMessage();
				byte[] realMsg = arbitrator.getCipher(
						second.getClass().getSimpleName()).decrypt(secondCrypt);
				byte[] firstCrypt = arbitrator.getCipher(
						first.getClass().getSimpleName()).encrypt(realMsg);
				msg.setMessage(firstCrypt);
				arbitrator.sendMessage(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
