package br.com.casadocodigo.twittersearch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TwitterSearchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_twitter_search);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_twitter_search, menu);
		return true;
	}

}
