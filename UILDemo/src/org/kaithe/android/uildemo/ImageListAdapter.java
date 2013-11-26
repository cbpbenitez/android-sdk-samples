/**
 * 
 */
package org.kaithe.android.uildemo;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * @author carlo
 *
 */
public class ImageListAdapter extends BaseAdapter {

	private String[] urls = {
			"http://tabletpcssource.com/wp-content/uploads/2011/05/android-logo.png",
			"http://simpozia.com/pages/images/stories/windows-icon.png",
			"https://si0.twimg.com/profile_images/1135218951/gmail_profile_icon3_normal.png",
			"http://www.krify.net/wp-content/uploads/2011/09/Macromedia_Flash_dock_icon.png",
			"http://radiotray.sourceforge.net/radio.png",
			"http://www.bandwidthblog.com/wp-content/uploads/2011/11/twitter-logo.png",
			"http://weloveicons.s3.amazonaws.com/icons/100907_itunes1.png",
			"http://weloveicons.s3.amazonaws.com/icons/100929_applications.png",
			"http://www.idyllicmusic.com/index_files/get_apple-iphone.png",
			"http://www.frenchrevolutionfood.com/wp-content/uploads/2009/04/Twitter-Bird.png",
			"http://3.bp.blogspot.com/-ka5MiRGJ_S4/TdD9OoF6bmI/AAAAAAAAE8k/7ydKtptUtSg/s1600/Google_Sky%2BMaps_Android.png",
			"http://www.desiredsoft.com/images/icon_webhosting.png",
			"http://goodereader.com/apps/wp-content/uploads/downloads/thumbnails/2012/01/hi-256-0-99dda8c730196ab93c67f0659d5b8489abdeb977.png",
			"http://1.bp.blogspot.com/-mlaJ4p_3rBU/TdD9OWxN8II/AAAAAAAAE8U/xyynWwr3_4Q/s1600/antivitus_free.png",
			"http://cdn3.iconfinder.com/data/icons/transformers/computer.png",
			"http://cdn.geekwire.com/wp-content/uploads/2011/04/firefox.png?7794fe",
			"https://ssl.gstatic.com/android/market/com.rovio.angrybirdsseasons/hi-256-9-347dae230614238a639d21508ae492302340b2ba",
			"http://androidblaze.com/wp-content/uploads/2011/12/tablet-pc-256x256.jpg",
			"http://www.theblaze.com/wp-content/uploads/2011/08/Apple.png",
			"http://1.bp.blogspot.com/-y-HQwQ4Kuu0/TdD9_iKIY7I/AAAAAAAAE88/3G4xiclDZD0/s1600/Twitter_Android.png",
			"http://3.bp.blogspot.com/-nAf4IMJGpc8/TdD9OGNUHHI/AAAAAAAAE8E/VM9yU_lIgZ4/s1600/Adobe%2BReader_Android.png",
			"http://cdn.geekwire.com/wp-content/uploads/2011/05/oovoo-android.png?7794fe",
			"http://icons.iconarchive.com/icons/kocco/ndroid/128/android-market-2-icon.png",
			"http://thecustomizewindows.com/wp-content/uploads/2011/11/Nicest-Android-Live-Wallpapers.png",
			"http://c.wrzuta.pl/wm16596/a32f1a47002ab3a949afeb4f",
			"http://macprovid.vo.llnwd.net/o43/hub/media/1090/6882/01_headline_Muse.jpg"
	};
	
	private Context context;
	private ImageLoader imageLoader;
	
	public ImageListAdapter(Context context) {
		this.context = context;
		imageLoader = ImageLoader.getInstance();
	}
	
	@Override
	public int getCount() {
		return urls.length;
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup viewGroup) {
		View v = convertView;
		
		ViewHolder vh = null;
		if (v == null) {
			v = View.inflate(context, R.layout.list_item, null);
			
			vh = new ViewHolder();
			vh.imageView = (ImageView) v.findViewById(R.id.imageView);
			
			v.setTag(vh);
		}
		else {
			vh = (ViewHolder)v.getTag();
		}
		
		DisplayImageOptions options = new DisplayImageOptions.Builder()
		.cacheOnDisc()
		.build();
		
		imageLoader.displayImage(urls[position], vh.imageView, options);
		
		return v;
	}
	
	private class ViewHolder {
		ImageView imageView;
	}

}
