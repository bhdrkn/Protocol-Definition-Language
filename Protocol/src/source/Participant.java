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

/**
 * The Source and the destination part of the protocols communication. It holds
 * Cipher and Message information of the {@link Participant}. If you want to
 * make encryption it is right place to do. Every {@link Participant} must be
 * subclass of this class.
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
 */
public abstract class Participant<Message, Cipher> extends EventSource<Message> {
	private Message message = null;
	private Cipher cipher = null;

	public Participant(Cipher cipher) {
		this.cipher = cipher;
	}

	public abstract void sendMessage(Message message);

	public void setMessage(Message msg) {
		this.message = msg;
	}

	public Message getMessage() {
		return this.message;
	}

	public void setCipher(Cipher cipher) {
		this.cipher = cipher;
	}

	public Cipher getCipher() {
		return this.cipher;
	}

	@Override
	public String toString() {
		if (this.message == null) {
			return "This is " + this.getClass().getSimpleName()
					+ " and there is no message";
		} else {
			return "This is " + this.getClass().getSimpleName()
					+ " and message is: " + this.message + " ";
		}
	}
}
