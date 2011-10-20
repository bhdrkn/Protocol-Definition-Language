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
package protocol.message;

/**
 * If you want to use custom messages in your protocol, your custom messages
 * must be subclass of {@link AbstractMessage}
 * 
 * @author Bahadir Akin
 * 
 */
public abstract class AbstractMessage {

	private String from;
	private String to;
	private byte[] message;
	private String protocol;

	public AbstractMessage(String protocol) {
		this.protocol = protocol;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public byte[] getMessage() {
		return message;
	}

	public void setMessage(byte[] message) {
		this.message = message;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public String toString() {
		return " FROM: " + this.from + " TO: " + this.to + " PROTOCOL: "
				+ this.protocol + " BODY: " + new String(this.message);
	}

}
