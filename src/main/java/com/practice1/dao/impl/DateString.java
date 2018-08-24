package com.practice1.dao.impl;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateString {
	public static String method1(Timestamp time){
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			return simpleDateFormat.format(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public static Timestamp method1(String time){
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = simpleDateFormat.parse(time);
			Timestamp timestamp = new Timestamp(date.getTime());
			return timestamp;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
