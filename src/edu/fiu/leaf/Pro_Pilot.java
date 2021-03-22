/**
 * 
 */
package edu.fiu.leaf;

/**
 * @author brian
 *
 */
public class Nissan_Leaf implements SelfCheckCapable {
	
	string front_left_sensor;
	string front_right_sensor;
	string front_center_sensor;
	string back_left_sensor;
	string back_center_sensor;
	string back_center_sensor;
	string rear_view_camera_sensor;
	
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
