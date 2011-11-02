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
package example.protocol.message;

import protocol.message.AbstractMessage;
import example.protocol.test.synchronous.SynchronousProtocolTest;

/**
 * This is a example of custom message which is subclass of
 * {@link AbstractMessage}. If you want to use custom messages your messages
 * must be subclass of {@link AbstractMessage}
 * 
 * This message is using in {@link SynchronousProtocolTest} example.
 * 
 * @author Bahadir Akin
 * 
 */
public class Message extends AbstractMessage {

	public Message(ProtocolType protocolType) {
		super(protocolType.toString());
	}

	public MessageSource getFromSource() {
		return Enum.valueOf(MessageSource.class, this.getFrom());
	}

	public void setFrom(MessageSource from) {
		this.setFrom(from.toString());
	}

	public MessageSource getToSource() {
		return Enum.valueOf(MessageSource.class, this.getTo());
	}

	public void setTo(MessageSource to) {
		this.setTo(to.toString());
	}

	public String getStringMessage() {
		return new String(this.getMessage());
	}

	public void setMessage(String message) {
		this.setMessage(message.getBytes());
	}

	public ProtocolType getProtocolType() {
		return Enum.valueOf(ProtocolType.class, this.getProtocol());
	}

	public void setProtocolType(ProtocolType protocolType) {
		this.setProtocol(protocolType.toString());
	}
}
