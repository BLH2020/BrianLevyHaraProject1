/**
 * 
 */
package edu.fiu.leaf;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author brian
 *
 */
public class Battery implements SelfCheckCapable {

	String lithium;
	String sixty_six_kWh_power_voltage;
	
	/** 
	 * power method provides energy to the motors and 
	 * the Nissan_leaf electronics
	 */
	void power () {
		
	}
	
	/**
	 * stores_electricty method stores energy in battery
	 * for later use
	 */
	
	void stores_electricity() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Leaf Battery";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
