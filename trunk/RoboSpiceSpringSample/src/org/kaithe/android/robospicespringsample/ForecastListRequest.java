/**
 * 
 */
package org.kaithe.android.robospicespringsample;

import android.net.Uri;

import com.octo.android.robospice.request.springandroid.SpringAndroidSpiceRequest;

/**
 * @author carlo
 *
 */
public class ForecastListRequest extends SpringAndroidSpiceRequest<ForecastList> {

	public ForecastListRequest() {
		super(ForecastList.class);
	}

	@Override
	public ForecastList loadDataFromNetwork() throws Exception {
		Uri.Builder builder = Uri.parse("http://api.openweathermap.org/data/2.5/forecast/daily?lat=35&lon=139&cnt=7&mode=json").buildUpon();
		return getRestTemplate().getForObject(builder.build().toString(), ForecastList.class);
	}

}
