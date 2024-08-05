package com.kh.chap00_intro.util;

import java.lang.reflect.Array;
import java.util.ArrayList;

// 마치 배열처럼 여러개의 데이터를 타입에 상관 없이 저장할 수 있게끔 구현
public class MyList {

	// 필드
	
	private Object[] arr; // 자료형에 상관없이 아무 데이터나 다 담을 수 있는 배열
	// 모든타입을 넣을수 있는 배열 boolean도 가능
	private int size; // arr 배열에 실제 담겨있는 데이터의 갯수
	
	// 생성자부
	// 기본생성자 - arr 배열을 10만 짜리로 할당, size 값도 0으로 셋팅
	public MyList() {
	size = 0;	
	arr = new Object[10];	
	}
	// 매개변수 생성자 - 전달받은 크기만큼 arr 배열을 length칸짜리로 할당, size 값도 0으로 셋팅
	public MyList(int length) {
		arr= new Object[length];
		size= 0;
		
	}

	// 메소드부
	// add 메소드 1 - 전달받은 item 을 arr 배열의 마지막 인덱스에 저장
	// 				단, 배열이 이미 다 차있다면 기존 arr배열을 깊은복사하되,
	// 				 기존의 2배 사이즈로 복사 후 마지막 인덱스에 저장
	public void add(Object item) {
		size = 10;
		if(arr.length == size) {
			Object [] copy = new Object[size*2];
			arr[arr.length-1] = item; 
			for(int i = 0; i<arr.length-1;i++) {
				copy[i] = arr[i];
				
			}
			
		}else {
			arr[arr.length-1] = item;
		}
			
				
	}
	
	// add 메소드 2 - 전달받은 item 을 arr 배열의 index 번째 칸에 저장
	//				단, 배열이 이미 다 차있다면 기존 arr 배열을 깊은 복사화되,
	// 				 기존의 2배 사이즈로 복사 후 해당 인덱스에 저장
	// * 해당 인덱스의 값부터 마지막 값까지 뒤로 한칸씩 밀어주는 작업 후 진행!!
	public void add(int index, Object item) {
		size = 10;
		if(arr.length == size) {
			Object [] copy2 = new Object[size*2];
			arr[index] = item;
			for(int i = index; i<arr.length;i++) {
				copy2[i+1] = arr[i];
				
			}
			
		}else {
			arr[index]  = item;
		}
		
		
	}
	
	
	// set 메소드 - 전달 받은 index 번째 칸의 데이터를 전달받은 item 으로 변경
	//   		   단, inedx는 현재 값이 있는 인덱스로 제시해야함!!
	
	public void set(int index, Object item) {
		
		if(arr[index] == null) {
		arr[index] = item; //전달 받은 index 번째 칸의 데이터를 전달받은 item 으로 변경 
		}
		
	}
	
	// get 메소드 - arr 배열로부터 전달받은 index 번쨰 데이터를 리턴
	public Object get(int index) {
		return  arr[index];
	}
	
	// remove 메소드 - arr 배열로부터 전달받은 index 번째 데이터를 삭제
	// * 해당 데이터 삭제 후 뒤의 데이터를앞으로 한칸씩 땡겨오는 작업까지 진행!!
	public void remove(int index) {
		for(int i = index; i <arr.length; i++) {
			arr[i]=arr[i+1];
			
		}
	}
	
	// size 메소드 - arr 배열에 실제 담겨있는 데이터의 갯수를 리턴
	public int size() {
		return arr.length;
	}
	// isEmpty 메소드 -arr배열에 담겨있는 데이터가 하나도 없다면 true 리턴
	//										하라도 있다면 false 리턴
	public boolean isEmpty() {
		 if(arr == null) {
			 return true;
		}else {
			return false;
		}
	}
	
	// toString 메소드 오버라이딩 - arr 배열의 내용물을 [값, 값, ....] 형식으로 문자열 리턴
	
	@Override
	public String toString() {
		
		return arr.toString();
		
	}
	
	
	
}
