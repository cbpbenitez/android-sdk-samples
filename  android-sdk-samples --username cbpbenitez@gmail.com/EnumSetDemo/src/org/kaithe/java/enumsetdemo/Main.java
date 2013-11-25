/**
 * 
 */
package org.kaithe.java.enumsetdemo;

import java.util.EnumSet;
import java.util.List;

/**
 * @author carlo
 *
 */
public class Main {

	public static void main(String[] args) {
		EnumSet<ProcessFlag> flags = EnumSet.of(ProcessFlag.FLAG_1, ProcessFlag.FLAG_2);
		List<String> strings = SampleUtil.processInput("Hello", flags);
		
		for (String s : strings) {
			System.out.println(s);
		}
	}
	
}
