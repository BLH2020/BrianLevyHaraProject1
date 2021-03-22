/**
 * 
 */
package edu.fiu.leaf;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author brian
 *
 */
public abstract class Nissan_Leaf implements SelfCheckCapable {

	 String brand;
	 String five_seats;
	 String ten_airbags;
	 
	 
	 

	/**
	 *  manual_movement methods is when a human being is controlling the car's
	 *   movements
	 */
	
	void manual_movement() {
		
	}	
	
	/**
	 * pro_pilot_drive method is semi-autonomous driving where the car get inputs 
	 * from sensors, motors, brakes, and steering in order to keep the car on the 
	 * lane and up to desired speed. 
	 */
		void pro_pilot_drive() {
			
		}	
	
	/**
		 * trasmits_energy method is the action that converts the car into a generator.
		 */
			void transmits_energy() {
				
			}			
					
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nissan_Leaf  myLeaf = new Nissan_Leaf();
		myLeaf.runSelfCheck();
		Motor  myMotor = new Motor();
		myMotor.runSelfCheck();
	}

}
