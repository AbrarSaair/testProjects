package com.example.test;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.test.R;
public class LM_Fragment extends Fragment {
	@Override
	 public View onCreateView(LayoutInflater inflater,
		      ViewGroup container, Bundle savedInstanceState) {
		      /**
		       * Inflate the layout for this fragment
		       */
		      return inflater.inflate(R.layout.lm_fragement, container, false);
		   }

}
