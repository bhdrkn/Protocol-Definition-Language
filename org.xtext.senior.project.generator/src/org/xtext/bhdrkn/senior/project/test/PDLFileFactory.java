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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.senior.project.ProtocolStandaloneSetup;
import org.xtext.senior.project.protocol.PDLFile;

public class PDLFileFactory {
	
	public static PDLFile getPDLFile(String fileName){
		ProtocolStandaloneSetup.doSetup();
		ResourceSet resourceSet = new XtextResourceSet();
		Resource resource = resourceSet.getResource(URI.createFileURI(fileName), true);
		return (PDLFile)resource.getContents().get(0);
	}
}
