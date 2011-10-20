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
package example.synchronous;

import protocol.MyProtocol;

import protocol.cipher.SynchronousCipher;
import example.message.Message;
import example.message.MessageSource;
import example.message.ProtocolType;
import example.source.Alice;
import example.source.Bob;
import example.source.Trent;

/**
 * Test object. That uses MyProtocol. Has two Participant One is Alice, Other is
 * Bob Has one Arbitrator which is Trent Participants sends {@link Message} one
 * by one. Than recive them and print them to the screen
 * 
 * This class implements {@link Runnable} and has a Main method that run it
 * 
 * @author Bahadir Akin
 * 
 */
@SuppressWarnings( { "unused", "deprecation" })
public class MyProtocolTest implements Runnable {

	private Alice<SynchronousCipher> alice = null;
	private Bob<SynchronousCipher> bob = null;
	private Trent<SynchronousCipher> trent = null;
	private MyProtocol<Message, SynchronousCipher> myProtocol = null;

	public MyProtocolTest() {
		alice = new Alice<SynchronousCipher>(new SynchronousCipher("KeyOfAlice"));
		bob = new Bob<SynchronousCipher>(new SynchronousCipher("KeyOfBob"));
		trent = new Trent<SynchronousCipher>(alice,bob);
		myProtocol = new MyProtocol<Message, SynchronousCipher>(alice, bob, trent);
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new MyProtocolTest());
		thread.start();
		Thread.sleep(5000);
		thread.stop();
	}

	@Override
	public void run() {
		System.out.println("======== DEMO 1 ========");
		Message msg = new Message(ProtocolType.MyProtocol);
		msg.setTo(MessageSource.Bob);
		msg.setMessage("Bahadir Akin ITU");
		alice.sendMessage(msg);
		System.out.println(alice);
		System.out.println(bob);

		System.out.println();
		System.out.println("======== DEMO 2 ========");
		Message msg2 = new Message(ProtocolType.MyProtocol);
		msg2.setTo(MessageSource.Alice);
		msg2.setMessage("ITU Bahadir Akin");
		bob.sendMessage(msg2);
		System.out.println(bob);
		System.out.println(alice);
	}

}
