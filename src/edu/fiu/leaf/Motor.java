package edu.fiu.leaf;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Motor implements SelfCheckCapable {
	
	Integer motor_right;
	Integer motor_left;
	String electric_power;
	private String MyMotor;
	
	/**
	 * accelerate() method propels the car forward
	 */
	void accelerate() {
		
	}
	
	/**
	 * regenerate_energy the motor can regenerate energy with kinetic energy from braking
	 */
	
	void regenerate_energy() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return MyMotor;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.25);
	}

}
