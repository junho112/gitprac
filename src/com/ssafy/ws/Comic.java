package com.ssafy.ws;

import org.springframework.stereotype.Component;

public class Comic implements Movie {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "코믹영화를 관람합니다.";
	}

}
