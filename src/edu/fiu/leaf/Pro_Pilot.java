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
public class Pro_Pilot implements SelfCheckCapable {
	
	String front_left_sensor;
	String front_right_sensor;
	String front_center_sensor;
	String back_left_sensor;
	String back_right_sensor;
	String back_center_sensor;
	String rear_view_camera_sensor;
	
	/** 
	 * measure_distance method measures distance between road objects and car
	 * 	 */

}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Leaf is Groovy";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
