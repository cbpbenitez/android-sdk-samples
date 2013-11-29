package org.kaithe.android.audiorecordersample;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static final int RECORD_SOUND = 1000; 
	
	private TextView txt1;
	private TextView txt2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt1 = (TextView)findViewById(R.id.textView1);
		txt2 = (TextView)findViewById(R.id.textView2);
		
		findViewById(R.id.button).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
				startActivityForResult(intent, RECORD_SOUND);
			}
			
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch(requestCode) {
			case RECORD_SOUND:
				if (resultCode == Activity.RESULT_OK) {
					txt1.setText("data.getData().getPath() = " + data.getData().getPath());
					txt2.setText("getAudioFileRealPath(data) = " + getAudioFileRealPath(data));
				}
				break;
			default:
				super.onActivityResult(requestCode, resultCode, data);
				break;
		}
	}

	private String getAudioFileRealPath(Intent data) {
		String realPath = "";
		String[] filePathColumn = { MediaStore.Images.Media.DATA };
		Cursor cursor = getContentResolver().query(data.getData(), filePathColumn, null, null, null); 
		if(cursor.moveToFirst()){
		   int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
		   realPath = cursor.getString(columnIndex);
		}
		cursor.close();
		
		return realPath;
	}

}
