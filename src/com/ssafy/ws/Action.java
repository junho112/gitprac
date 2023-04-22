package com.ssafy.ws;

import org.springframework.stereotype.Component;

@Component
public class Action implements Movie {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "액션영화를 관람합니다.";
	}

}
