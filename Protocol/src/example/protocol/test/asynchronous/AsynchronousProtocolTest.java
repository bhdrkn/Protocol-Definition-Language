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
package example.protocol.test.asynchronous;

import protocol.cipher.AsynchronousCipher;
import example.protocol.MyProtocol;
import example.protocol.message.Message;
import example.protocol.message.MessageSource;
import example.protocol.message.ProtocolType;
import example.protocol.source.Alice;
import example.protocol.source.Bob;
import example.protocol.source.Trent;

@SuppressWarnings( { "unused", "deprecation" })
public class AsynchronousProtocolTest implements Runnable{

	private Alice<AsynchronousCipher> alice;
	private Bob<AsynchronousCipher> bob;
	private Trent<AsynchronousCipher> trent;
	private MyProtocol<Message, AsynchronousCipher> myProtocol;

	public AsynchronousProtocolTest() {
		alice = new Alice<AsynchronousCipher>(new AsynchronousCipher("asd"));
		bob = new Bob<AsynchronousCipher>(new AsynchronousCipher("asd"));
		trent = new Trent<AsynchronousCipher>(alice, bob);
		myProtocol = new MyProtocol<Message, AsynchronousCipher>(alice, bob,trent);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new AsynchronousProtocolTest());
		thread.start();
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
