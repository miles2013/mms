/*
 * Autor: Maik Allgoewer <maik.allgoewer@uni-ulm.de>
 * 
 * Beschreibung: ConfigReader liest Konfigurationsdateien aus dem Verzeichnis ./config und
 * stellt diese der Anwendung zur Verfuegung.
 * 
 * 
 * Fehlerbehebungen:
 */

package de.uulm.mms.config;


public class ConfigReader {

	private static ConfigReader singleton = null;
	
	
	/*
	 * ConfigReader ist ein Singleton, daher private
	 */
	private ConfigReader() {
		
	}
	
	public static ConfigReader getConfigReader() {
		
		if( null == singleton ) {
			singleton = new ConfigReader();
		}
		
		return singleton;
	}
}
