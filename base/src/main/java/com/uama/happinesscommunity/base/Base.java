package com.uama.happinesscommunity.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Jin on 2017/11/16.
 * Description
 */
public abstract class Base<T> extends Activity {
	
	@Inject
	public T test;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i("msg", test.toString());
	}
}
