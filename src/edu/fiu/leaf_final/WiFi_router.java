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
public class WiFi_router implements SelfCheckCapable {

	NissanLeaf myleaf;

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wifi_router";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, myleaf);
	}

	void connectWiFi() {
		// TODO Auto-generated method stub

	}
}
