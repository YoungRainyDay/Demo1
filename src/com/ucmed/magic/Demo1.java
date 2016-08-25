package com.ucmed.magic;

import java.util.Calendar;

public class Demo1 {

	public static void main(String[] args) {
		String s = "";
		Integer i = Calendar.WEEK_OF_MONTH;
		if (i < 6) {
			s = "工作日";
		} else {
			s = "休息";
		}
		System.out.println(s);
	}

}
