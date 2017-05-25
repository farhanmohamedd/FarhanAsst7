package taos.sonidosanimalesfree.proyecto;

import taos.sonidosanimalesfree.proyecto.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.gms.ads.*;

public class MainMenu extends Activity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);

		// AdView


		// Intersetial.



	public void onUnoClick(View view) {
		Intent intent = new Intent(this, Uno.class);
		startActivity(intent);
		this.finish();
	}

	public void onDosClick(View view) {
		Intent intent = new Intent(this, Dos.class);
		startActivity(intent);
		this.finish();
	}

	public void onAboutClick(View view) {
		Intent intent = new Intent(this, About.class);
		startActivity(intent);
		this.finish();
	}

	public void onExitClick(View view) {
		displayInterstitial();
		this.finish();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			displayInterstitial();
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
