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

	public class Sensor implements SelfCheckCapable {
				
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
		void measure_distance() {
			
		}

		/**
		 * visualize_lanes method identifies the street lane with the input of rear_view_camera_sensors. 
		 *
		 */
		
		void visualize_lanes() {
			
		}
		
		/** identify_objects method helps pro_pilot identify different objects in the road to stop the car or its tracks.
		 * 
		 */
		
		void identify_objects() {
			
		}
		
		@Override
		public String getComponentName() {
			// TODO Auto-generated method stub
			return "Sensor";
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
