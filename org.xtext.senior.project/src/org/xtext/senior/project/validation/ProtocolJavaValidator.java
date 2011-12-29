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
package org.xtext.senior.project.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.senior.project.protocol.Argument;
import org.xtext.senior.project.protocol.Call;
import org.xtext.senior.project.protocol.Define;
import org.xtext.senior.project.protocol.ProtocolPackage;
import org.xtext.senior.project.protocol.Transaction;
 

public class ProtocolJavaValidator extends AbstractProtocolJavaValidator {
	
	@Check
	public void checkCallArguments(Call call){
		Transaction transaction = call.getTransactionName();
		EList<Argument> argsTransaction = transaction.getArguments();
		EList<Define> argsCall = call.getArgs();
		if(argsTransaction.size() != argsCall.size()){
			error("There is no Transaction which takes " + argsCall.size() + " number of arguments!", ProtocolPackage.CALL__ARGS);
		}else
		{
			for (int i = 0; i < argsCall.size(); i++) {
				if(argsCall.get(i).getKeyword().compareTo(argsTransaction.get(i).getKeyword())!=0){
					error(" Trasaction with name " + transaction.getName()  +" does not take such arguments",ProtocolPackage.CALL__ARGS);
					break;
				}
			}
		}
		
	}
}

