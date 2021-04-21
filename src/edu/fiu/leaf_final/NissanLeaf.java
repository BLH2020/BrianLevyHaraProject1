/**
 * 
 */
package edu.fiu.leaf_final;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author brian
 *
 */
public class NissanLeaf implements SelfCheckCapable {

	WiFi_router myrouter;
	Server myserver;
	LED myLED;
	User myUser;
	System_check mysyschk;
	private Object string;

	public NissanLeaf() {
		myrouter = new WiFi_router();
		myserver = new Server();
		myLED = new LED();
		myUser = new User();

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "NissanLeaf";

	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, myrouter, myserver);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NissanLeaf myleaf = new NissanLeaf();

		myleaf.carON();
		myleaf.runSelfCheck();
		myleaf.restart_CPU();

	}

	private void carON() {
		// TODO Auto-generated method stub
		myrouter.connectWiFi();
		myserver.secureconnection();
		myserver.checkUpdate();
		myUser.update_available();
		myserver.download_update();
		myLED.flash_status();

	}

	private void restart_CPU() {
		// TODO Auto-generated method stub
		readytouse(string);

	}

	private void readytouse(Object string2) {
		// TODO Auto-generated method stub
		System.out.print("Ready To Use Leaf");
	}
}
