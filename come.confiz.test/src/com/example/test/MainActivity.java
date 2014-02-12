package com.example.test;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.example.test.R;

public class MainActivity extends SherlockActivity {
	public static int THEME = R.style.Sherlock___Theme;
	private com.actionbarsherlock.app.ActionBar actionBar;
	Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		Configuration config = getResources().getConfiguration();

		android.app.FragmentManager fragmentManager = getFragmentManager();
		android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		 if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
	         /**
	         * Landscape mode of the device
	         */
	         LM_Fragment ls_fragment = new LM_Fragment();	      
	         fragmentTransaction.replace(android.R.id.content, ls_fragment);
	      }else{
	         /**
	         * Portrait mode of the device
	         */
	         PM_Fragment pm_fragment = new PM_Fragment();
	         fragmentTransaction.replace(android.R.id.content, pm_fragment);
	         
	      }
	      fragmentTransaction.commit();

		actionBar = getSupportActionBar();
		mContext = this;
		actionBar.show();
	}

//	@Override
//	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
//		MenuInflater inflator = getSupportMenuInflater();
//		inflator.inflate(R.menu.main, menu);
//		// SearchManager searchManager = (SearchManager)
//		// getSystemService(Context.SEARCH_SERVICE);
//		// SearchView searchView = (SearchView) menu.findItem(R.id.serach)
//		// .getActionView();
//		// searchView.setSearchableInfo(searchManager
//		// .getSearchableInfo(getComponentName()));
//
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		switch (item.getItemId()) {
//		case R.id.action_settings:
//			Toast.makeText(mContext, "ahahah", Toast.LENGTH_LONG).show();
//			return true;
//		case R.id.serach:
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}

}
