package edu.wustl.honeyrj.lowinteraction;

import java.util.Vector;

public class LIHelper {
	
	/**
	 * Given a single String, return a Vector<String> containing that String
	 * @param str String to put into a Vector
	 * @return Given str, return a Vector<String> containing str
	 */
	public static Vector<String> vectorFromString(String str){
		Vector<String> v = new Vector<String>();
		v.add(str);
		return v;
	}
}
