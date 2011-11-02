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
package source;

import java.util.Hashtable;

import protocol.cipher.BaseCipher;
import protocol.message.AbstractMessage;

/**
 * It holds {@link Participant} list in a {@link Hashtable}. Now it only holds
 * one Cipher for all same {@link Participant}. For example if you use two
 * {@link Alice}, both Alice objects must have same Cipher and key.
 * 
 * IMPORTANT: Protocol, {@link Arbitrator} and {@link Participant} must use same
 * Cipher class.
 * 
 * @author Bahadir Akin
 * 
 * @param <Message>
 *            Every protocol has its own message so does Arbitrator and
 *            {@link Participant}
 * @param <Cipher>
 *            Every protocol has its own Cipher so does Arbitrator and
 *            {@link Participant}.
 * 
 */
public abstract class Arbitrator<Message extends AbstractMessage, Cipher extends BaseCipher>
		extends EventSource<Message> {
	private Hashtable<String, Cipher> cipherTable;

	/**
	 * Gets a HassTable with Participant class name and cipher that uses.
	 * 
	 * @param cipherTable
	 */
	public Arbitrator(Hashtable<String, Cipher> cipherTable) {
		this.cipherTable = cipherTable;
	}

	public Cipher getCipher(String className) {
		return cipherTable.get(className);
	}

	public void setCipher(String className, Cipher cipher) {
		this.cipherTable.remove(className);
		this.cipherTable.put(className, cipher);
	}

	public void addCipher(String className, Cipher cipher) {
		this.cipherTable.put(className, cipher);
	}
	
	public abstract void sendMessage(Message msg);
}
