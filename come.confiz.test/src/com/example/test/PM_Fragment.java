package com.example.test;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

import com.example.entities.ObjectItem;
import com.example.entities.OnItemClickListenerListViewItem;
import com.example.test.adapters.ArrayAdapterItem;

public class PM_Fragment extends Fragment {
	Context mContext;
	SearchView mSearchView;
	ListView listView;
	ArrayAdapterItem adapter;
	private com.actionbarsherlock.app.ActionBar actionBar;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		/**
		 * Inflate the layout for this fragment
		 */
		mContext = getActivity();
		setHasOptionsMenu(true);
		LinearLayout rootView = (LinearLayout) inflater.inflate(
				R.layout.pm_fragment, container, false);
		listView = (ListView) rootView.findViewById(R.id.listview);
		ObjectItem[] ObjectItemData = populateData();
		adapter = new ArrayAdapterItem(getActivity(), R.layout.list_item,
				ObjectItemData);

		// create a new ListView, set the adapter and item click listener

		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListenerListViewItem());
		listView.setTextFilterEnabled(true);

		return rootView;
	}

	@Override
	public void onPrepareOptionsMenu(Menu menu) {
		menu.findItem(R.id.action_settings).setVisible(false);
		super.onPrepareOptionsMenu(menu);
	}

	public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
		inflater.inflate(R.menu.main, menu);

		SearchView searchView = (SearchView) menu.findItem(R.id.serach)
				.getActionView();

		searchView.setOnQueryTextListener(new OnQueryTextListener() {
			@Override
			public boolean onQueryTextSubmit(String arg0) {
				return false;
			}

			@Override
			public boolean onQueryTextChange(String newText) {
				 if (TextUtils.isEmpty(newText)) {					
			        } else {
			        	listView.setFilterText(newText.toString());
			        }
			        return true;
			}
		});

		super.onCreateOptionsMenu(menu, inflater);
	}

	public ObjectItem[] populateData() {

		// add your items, this can be done programatically
		// your items can be from a database
		ObjectItem[] ObjectItemData = new ObjectItem[40];
		ObjectItemData[0] = new ObjectItem(91, "Mercury");
		ObjectItemData[1] = new ObjectItem(92, "Watson");
		ObjectItemData[2] = new ObjectItem(93, "Nissan");
		ObjectItemData[3] = new ObjectItem(94, "Puregold");
		ObjectItemData[4] = new ObjectItem(95, "SM");
		ObjectItemData[5] = new ObjectItem(96, "7 Eleven");
		ObjectItemData[6] = new ObjectItem(97, "Ministop");
		ObjectItemData[7] = new ObjectItem(98, "Fat Chicken");
		ObjectItemData[8] = new ObjectItem(99, "Master Siomai");
		ObjectItemData[9] = new ObjectItem(100, "Mang Inasal");
		ObjectItemData[10] = new ObjectItem(101, "Mercury 2");
		ObjectItemData[11] = new ObjectItem(102, "Watson 2");
		ObjectItemData[12] = new ObjectItem(103, "Nissan 2");
		ObjectItemData[13] = new ObjectItem(104, "Puregold 2");
		ObjectItemData[14] = new ObjectItem(105, "SM 2");
		ObjectItemData[15] = new ObjectItem(106, "7 Eleven 2");
		ObjectItemData[16] = new ObjectItem(107, "Ministop 2");
		ObjectItemData[17] = new ObjectItem(108, "Fat Chicken 2");
		ObjectItemData[18] = new ObjectItem(109, "Master Siomai 2");
		ObjectItemData[19] = new ObjectItem(110, "Mang Inasal 2");

		ObjectItemData[20] = new ObjectItem(111, "Mercury 3");
		ObjectItemData[21] = new ObjectItem(112, "Watson 3");
		ObjectItemData[22] = new ObjectItem(113, "Nissan 3");
		ObjectItemData[23] = new ObjectItem(114, "Puregold 3");
		ObjectItemData[24] = new ObjectItem(115, "SM 3");
		ObjectItemData[25] = new ObjectItem(116, "7 Eleven 3");
		ObjectItemData[26] = new ObjectItem(117, "Ministop 3");
		ObjectItemData[27] = new ObjectItem(118, "Fat Chicken 3");
		ObjectItemData[28] = new ObjectItem(119, "Master Siomai 3");
		ObjectItemData[29] = new ObjectItem(120, "Mang Inasal 3");
		ObjectItemData[30] = new ObjectItem(121, "Mercury 4");
		ObjectItemData[31] = new ObjectItem(122, "Watson 4");
		ObjectItemData[32] = new ObjectItem(123, "Nissan 4");
		ObjectItemData[33] = new ObjectItem(124, "Puregold 4");
		ObjectItemData[34] = new ObjectItem(125, "SM 4");
		ObjectItemData[35] = new ObjectItem(126, "7 Eleven 4");
		ObjectItemData[36] = new ObjectItem(127, "Ministop 4");
		ObjectItemData[37] = new ObjectItem(128, "Fat Chicken 4");
		ObjectItemData[38] = new ObjectItem(129, "Master Siomai 4");
		ObjectItemData[39] = new ObjectItem(130, "Mang Inasal 4");

		return ObjectItemData;
	}

}
