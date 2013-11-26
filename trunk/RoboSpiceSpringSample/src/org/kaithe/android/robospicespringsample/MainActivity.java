package org.kaithe.android.robospicespringsample;

import java.util.List;

import com.octo.android.robospice.JacksonSpringAndroidSpiceService;
import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class MainActivity extends Activity {

	private SpiceManager spiceManager = new SpiceManager(JacksonSpringAndroidSpiceService.class);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ForecastListRequest request = new ForecastListRequest();
		spiceManager.execute(request, new RequestListener<ForecastList>() {

			@Override
			public void onRequestFailure(SpiceException arg0) {
				Log.i("ForecastListRequest", "failed");
			}

			@Override
			public void onRequestSuccess(ForecastList arg0) {
				Log.i("ForecastListRequest", "success!");
				
				List<Forecast> list = arg0.getList();
				for (Forecast forecast : list) {
					Log.i("ForecastListRequest", "dt=" + forecast.getDt());
				}
			}
			
		});
	}

	@Override
	protected void onStart() {
		super.onStart();
		spiceManager.start(this);
	}

	@Override
	protected void onStop() {
		spiceManager.shouldStop();
		super.onStop();
	}

}
