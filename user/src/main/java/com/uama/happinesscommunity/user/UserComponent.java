package com.uama.happinesscommunity.user;

import dagger.Component;

/**
 * Created by Jin on 2017/11/16.
 * Description
 */
@Component
public interface UserComponent {
	
	void inject(User mine);
}
