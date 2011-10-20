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
package protocol.cipher;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * This Cipher subclass of {@link BaseCipher} It uses DES algorithm from JCA. It
 * uses padding
 * 
 * @author Bahadir Akin
 * 
 */
public class SynchronousCipher extends BaseCipher {

	private SecretKey secretKey = null;
	private Cipher cipher = null;

	public SynchronousCipher(String key) {
		try {
			KeySpec keySpec = new DESKeySpec(key.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			secretKey = keyFactory.generateSecret(keySpec);
			generateCipher();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void generateCipher() {
		try {
			cipher = Cipher.getInstance("DES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		}
	}

	public byte[] encrypt(byte[] message) throws InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException {
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		return cipher.doFinal(message);
	}

	public byte[] decrypt(byte[] crypt) throws InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException {
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		return cipher.doFinal(crypt);

	}
}
