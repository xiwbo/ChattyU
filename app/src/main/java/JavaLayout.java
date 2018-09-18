package com.xiwbo.chattyu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class JavaLayout extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RelativeLayout root = new RelativeLayout(getApplicationContext());
		TextView textView = new TextView(getApplicationContext());
		ViewGroup.LayoutParams root_LayoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
		root_LayoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
		root_LayoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
		root.setPadding((int) getResources().getDimension(R.dimen.activity_horizontal_margin), (int) getResources().getDimension(R.dimen.activity_vertical_margin), 0, (int) getResources().getDimension(R.dimen.activity_vertical_margin));
		root.setLayoutParams(root_LayoutParams);
		textView.setText("Hello World!");
		textView.setLayoutParams(root_LayoutParams);
		root.addView(textView);
		setContentView(root);
	}
}
