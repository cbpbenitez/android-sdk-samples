/**
 * 
 */
package org.kaithe.java.enumsetdemo;

/**
 * @author carlo
 *
 */
public enum ProcessFlag {

	FLAG_1(new IStringProcessor(){

		@Override
		public String processString(String input) {
			return input + "process1";
		}
		
	}),
	FLAG_2(new IStringProcessor(){

		@Override
		public String processString(String input) {
			return input + "process2";
		}
		
	}),
	FLAG_3(new IStringProcessor(){

		@Override
		public String processString(String input) {
			return input + "process3";
		}
		
	});
	
	private IStringProcessor processor;
	
	ProcessFlag(IStringProcessor processor) {
		this.processor = processor;
	}
	
	public String applyMethod(String input) {
		return processor.processString(input);
	}
	
}
