package com.uama.happinesscommunity.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.uama.happinesscommunity.base.Middle;

import javax.inject.Inject;

/**
 * Created by Jin on 2017/11/16.
 * Description
 */
public class Mine extends Middle<MineP> {
	
	@Inject
	MineP p;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		DaggerMineComponent.create().build().inject();
	}
}
