
package org.xtext.senior.project;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProtocolStandaloneSetup extends ProtocolStandaloneSetupGenerated{

	public static void doSetup() {
		new ProtocolStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

