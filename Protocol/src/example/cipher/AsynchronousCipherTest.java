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
package example.cipher;

import protocol.cipher.AsynchronousCipher;
import protocol.cipher.HexConverter;

public class AsynchronousCipherTest {
	public static void main(String[] args) throws Exception {
		String key = "12345678";
		String msg = "Alice says: Hi!";
		
		AsynchronousCipher cipher = new AsynchronousCipher(key);
		byte[] encrypt = cipher.encrypt(msg.getBytes());

		System.out.println(HexConverter.bytesToHex(encrypt));
		
		byte[] decrypt = cipher.decrypt(encrypt);
		System.out.println(decrypt);
		System.out.println(new String(decrypt));
	}
}
