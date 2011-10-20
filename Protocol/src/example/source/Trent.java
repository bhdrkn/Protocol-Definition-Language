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

import java.util.Hashtable;

import protocol.cipher.BaseCipher;
import example.message.Message;
import source.Arbitrator;

public class Trent<Cipher extends BaseCipher> extends
		Arbitrator<Message, Cipher> {

	public Trent(Alice<Cipher> alice, Bob<Cipher> bob) {
		super(new Hashtable<String, Cipher>());
		super.addCipher(Alice.class.getSimpleName(), alice.getCipher());
		super.addCipher(Bob.class.getSimpleName(), bob.getCipher());
	}

	public Trent(Hashtable<String, Cipher> cipherTable) {
		super(cipherTable);
	}

	@Override
	public void sendMessage(Message msg) {
		setChanged();
		notifyObservers(msg);
	}

}
