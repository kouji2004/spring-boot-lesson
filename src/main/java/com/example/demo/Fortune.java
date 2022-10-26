package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {

	@RequestMapping("/lesson")
	 public String start() {
		double fn = Math.random();//0.0~1.0の乱数
		if(fn>=0.7) {//大吉
			return "lesson.html";
		}else if(fn>=0.4) {//中吉
			return "lesson2.html";
		}else if(fn>=0.1) {//小吉
			return "lesson3.html";
		}else {//吉
			return "lesson4.html";
		}
     }
}