/**
 * 
 */
package edu.fiu.leaf;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author brian
 * 
 *  
 */
public class Pro_Pilot implements SelfCheckCapable {

	String CPU;
	String antenna;
    int IPaddress;
    
    /**
     * Autonomous driving, car drives by itself from input of the;
     * steering, sensors, motor, and brakes.
     */
    
    void Autonomous_driving () {
    	
    }
    
	/** 
	 * software_update
	 */
    
    void software_update () {
    	
    }
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Car";
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

	
	

