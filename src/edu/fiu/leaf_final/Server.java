package edu.fiu.leaf_final;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author brian
 *
 */
public class Server implements SelfCheckCapable {

	NissanLeaf myleaf;

	public Object download_update;

	public Server() {
	//	myleaf = new NissanLeaf();

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Server";
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

	public void secureconnection() {
			// TODO Auto-generated method stub
			System.out.println("Secure Connection Estbalished");
		}

	public void checkUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Checking Update");

		System.out.println("Update Available");
	}

	public void download_update() {
		// TODO Auto-generated method stub
		System.out.println("Downloading Update");

	}

}
