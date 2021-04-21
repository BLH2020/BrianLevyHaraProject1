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
public class System_check implements SelfCheckCapable {

	NissanLeaf myleaf;

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "system Check";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.05);}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

}
