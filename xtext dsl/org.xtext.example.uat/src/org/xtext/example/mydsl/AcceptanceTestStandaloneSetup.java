/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AcceptanceTestStandaloneSetup extends AcceptanceTestStandaloneSetupGenerated {

	public static void doSetup() {
		new AcceptanceTestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
