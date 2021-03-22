/**
 * 
 */
package edu.fiu.leaf;

import edu.fiu.sysdesign.Pro_Pilot;
import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author brian
 * @param <Steering>
 *
 */
public class Steering<Steering> implements SelfCheckCapable {


    private static final Pro_Pilot Steering = null;
	String power_steering;
	
    /**
     * rotate wheels left
     */
    void rotate_wheels_left() {
    	
    }
    
    /**
     * rotates wheels right
     */
	void rotate_wheels_right() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Leaf_steering";
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
