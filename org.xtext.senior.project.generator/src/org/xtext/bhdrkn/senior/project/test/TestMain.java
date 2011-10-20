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
package org.xtext.bhdrkn.senior.project.test;

import org.xtext.senior.project.protocol.PDLFile;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String fileName = "bhdrkn.pdl";
			PDLFile pdlFile = PDLFileFactory.getPDLFile(fileName);
			System.out.println(pdlFile.getDefinition().getDefinitions().size());
			System.out.println(pdlFile.getTransaction().getTransactions()
					.size());
			System.out.println(pdlFile.getState().getStates().size());
		} catch (Exception ex) {
			System.out
					.println("An Exception Occure while reading bhdrkn.pdl M: "
							+ ex.getMessage() + " C:" + ex.getCause());
		}
	}

}
