package taos.sonidosanimalesfree.proyecto;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import taos.sonidosanimalesfree.proyecto.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class About extends Activity {



	public void onMainClick(View view) {
		Intent intent = new Intent(this, MainMenu.class);
		startActivity(intent);
		this.finish();
	}

	public void onFrom(View view) {
		Toast toast = Toast.makeText(getApplicationContext(),
				"Farhan (United States)", Toast.LENGTH_SHORT);
		toast.show();
	}

	public void onEmail(View view) {
		Toast toast = Toast.makeText(getApplicationContext(),
				"farhanmohamedd@gmail.com", Toast.LENGTH_SHORT);
		toast.show();
	}

	public void onStudy(View view) {
		Toast toast = Toast
				.makeText(
						getApplicationContext(),
						"Android App developer.",
						Toast.LENGTH_SHORT);
		toast.show();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent();
			intent.setClass(this, MainMenu.class);
			startActivity(intent);
			this.finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}
}