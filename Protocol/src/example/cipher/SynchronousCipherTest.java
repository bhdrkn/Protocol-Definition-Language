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

import java.security.InvalidKeyException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

import protocol.cipher.HexConverter;
import protocol.cipher.SynchronousCipher;

/**
 * It is a test class for {@link SynchronousCipher}. It has a main method which call
 * myCipher and print the result.
 * 
 * The key using in example is "KeyOfAlice" The msg using in example is
 * "Alice Says: Hi!" THe expected output is: "FB8ABBC4B9373E7D68439595EB7E0022"
 * "[B@5e3974" "Alice Says: Hi!"
 * 
 * @author Bahadir Akin
 * 
 */
public class SynchronousCipherTest {
	public static void main(String[] args) throws InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException {
		String key = "KeyOfAlice";
		String msg = "Alice Says: Hi!";

		SynchronousCipher cipher = new SynchronousCipher(key);
		byte[] encrypt = cipher.encrypt(msg.getBytes());

		System.out.println(HexConverter.bytesToHex(encrypt));

		byte[] decrypt = cipher.decrypt(encrypt);
		System.out.println(decrypt);
		System.out.println(new String(decrypt));
	}

}
