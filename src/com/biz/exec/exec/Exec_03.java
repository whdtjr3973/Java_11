package com.biz.exec.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exec_03 {

	public static void main(String[] args) {

		List<String> strList= new LinkedList<String>();
		
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라");
		view(strList);
	}

	public static void view(List<String> sList) {
		for(String s : sList) {
			System.out.println(s);
		}
	}
}
