/**
 * 
 */
package org.kaithe.java.enumsetdemo;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author carlo
 *
 */
public class SampleUtil {
	
	public static List<String> processInput(String input, EnumSet<ProcessFlag> flags){
		List<String> output = new ArrayList<String>();
		
		Iterator<ProcessFlag> iterator = flags.iterator();
		while (iterator.hasNext()) {
			ProcessFlag pFlag = iterator.next();
			output.add(pFlag.applyMethod(input));
		}
		
		return output;
	}
	
}
