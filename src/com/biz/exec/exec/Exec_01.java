package com.biz.exec.exec;

import com.biz.exec.service.JavaService;
import com.biz.exec.service.JavaServiceImp_02;
public class Exec_01 {

	public static void main(String[] args) {
		// JavaService 클래스에 선언된 여러 메서드들을
		// 호출하여 일을 시키기 위해서
		// js라는 클래스로 선언하고 초기화
		JavaService js = new JavaServiceImp_02();
		js.call();
		js.call(100);
		js.call(100, 200);
		
		/*
		 * 클래스(객체)의 메서드를 호출한다는 개념
		 * 클래스를 생성할때 정의한 메서드에게
		 * 어떤 일인가를 시키는 것
		 * 우리는 그 메서드가 하는일을 이미 알고 있어야 한다.
		 */
	}
}
