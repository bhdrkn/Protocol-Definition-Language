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


/**
 * Base cipher class. If a cipher will be used with any protocol it must be
 * subclass of this class
 * 
 * @author Bahadir Akin
 * 
 */
public abstract class BaseCipher {	

	public abstract byte[] encrypt(byte[] msg) throws Exception;

	public abstract byte[] decrypt(byte[] msg) throws Exception;
	

}
