/**
 * 
 */
package org.kaithe.android.robospicespringsample;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author carlo
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Temp {

	private String day;
	private String min;
	private String max;
	private String night;
	private String eve;
	private String morn;
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getNight() {
		return night;
	}
	public void setNight(String night) {
		this.night = night;
	}
	public String getEve() {
		return eve;
	}
	public void setEve(String eve) {
		this.eve = eve;
	}
	public String getMorn() {
		return morn;
	}
	public void setMorn(String morn) {
		this.morn = morn;
	}
	
}
