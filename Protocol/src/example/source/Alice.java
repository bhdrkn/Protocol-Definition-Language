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
package example.source;

import protocol.cipher.BaseCipher;
import example.message.Message;
import source.Participant;

public class Alice<Cipher extends BaseCipher> extends Participant<Message, Cipher>{

	public Alice(Cipher cipher) {
		super(cipher);
	}

	@Override
	public void sendMessage(Message msg) {
		msg.setFrom(this.getClass().getSimpleName());
		if (msg.getFrom().compareTo(msg.getTo()) != 0) {
			String message = msg.getStringMessage();
			try {
				byte[] crypt = getCipher().encrypt(message.getBytes());
				msg.setMessage(crypt);
				this.setMessage(new Message(msg.getProtocolType()));
				this.getMessage().setMessage(msg.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			setChanged();
			notifyObservers(msg);
		}
	}

}
