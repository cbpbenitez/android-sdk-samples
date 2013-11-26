/**
 * 
 */
package org.kaithe.android.robospicespringsample;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author carlo
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

	private String dt;
	private Temp temp;
	private String pressure;
	private String humidity;
	private String speed;
	private String deg;
	private String clouds;
	private List<Weather> weather;
	
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public Temp getTemp() {
		return temp;
	}
	public void setTemp(Temp temp) {
		this.temp = temp;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public String getClouds() {
		return clouds;
	}
	public void setClouds(String clouds) {
		this.clouds = clouds;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	
}
