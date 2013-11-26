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
public class ForecastList {

	private List<Forecast> list;

	public List<Forecast> getList() {
		return list;
	}

	public void setList(List<Forecast> list) {
		this.list = list;
	}
	
}
