package com.uama.happinesscommunity.user;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.uama.happinesscommunity.base.Middle;

import javax.inject.Inject;

/**
 * Created by Jin on 2017/11/16.
 * Description
 */
public class User extends Middle<UserP> {
	
	@Inject
	UserP p;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		DaggerUserComponent.create().build().inject();
	}
}
