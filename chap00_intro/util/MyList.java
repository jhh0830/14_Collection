package com.kh.chap00_intro.util;

import java.lang.reflect.Array;
import java.util.ArrayList;

// ��ġ �迭ó�� �������� �����͸� Ÿ�Կ� ��� ���� ������ �� �ְԲ� ����
public class MyList {

	// �ʵ�
	
	private Object[] arr; // �ڷ����� ������� �ƹ� �����ͳ� �� ���� �� �ִ� �迭
	// ���Ÿ���� ������ �ִ� �迭 boolean�� ����
	private int size; // arr �迭�� ���� ����ִ� �������� ����
	
	// �����ں�
	// �⺻������ - arr �迭�� 10�� ¥���� �Ҵ�, size ���� 0���� ����
	public MyList() {
	size = 0;	
	arr = new Object[10];	
	}
	// �Ű����� ������ - ���޹��� ũ�⸸ŭ arr �迭�� lengthĭ¥���� �Ҵ�, size ���� 0���� ����
	public MyList(int length) {
		arr= new Object[length];
		size= 0;
		
	}

	// �޼ҵ��
	// add �޼ҵ� 1 - ���޹��� item �� arr �迭�� ������ �ε����� ����
	// 				��, �迭�� �̹� �� ���ִٸ� ���� arr�迭�� ���������ϵ�,
	// 				 ������ 2�� ������� ���� �� ������ �ε����� ����
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
	
	// add �޼ҵ� 2 - ���޹��� item �� arr �迭�� index ��° ĭ�� ����
	//				��, �迭�� �̹� �� ���ִٸ� ���� arr �迭�� ���� ����ȭ��,
	// 				 ������ 2�� ������� ���� �� �ش� �ε����� ����
	// * �ش� �ε����� ������ ������ ������ �ڷ� ��ĭ�� �о��ִ� �۾� �� ����!!
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
	
	
	// set �޼ҵ� - ���� ���� index ��° ĭ�� �����͸� ���޹��� item ���� ����
	//   		   ��, inedx�� ���� ���� �ִ� �ε����� �����ؾ���!!
	
	public void set(int index, Object item) {
		
		if(arr[index] == null) {
		arr[index] = item; //���� ���� index ��° ĭ�� �����͸� ���޹��� item ���� ���� 
		}
		
	}
	
	// get �޼ҵ� - arr �迭�κ��� ���޹��� index ���� �����͸� ����
	public Object get(int index) {
		return  arr[index];
	}
	
	// remove �޼ҵ� - arr �迭�κ��� ���޹��� index ��° �����͸� ����
	// * �ش� ������ ���� �� ���� �����͸������� ��ĭ�� ���ܿ��� �۾����� ����!!
	public void remove(int index) {
		for(int i = index; i <arr.length; i++) {
			arr[i]=arr[i+1];
			
		}
	}
	
	// size �޼ҵ� - arr �迭�� ���� ����ִ� �������� ������ ����
	public int size() {
		return arr.length;
	}
	// isEmpty �޼ҵ� -arr�迭�� ����ִ� �����Ͱ� �ϳ��� ���ٸ� true ����
	//										�϶� �ִٸ� false ����
	public boolean isEmpty() {
		 if(arr == null) {
			 return true;
		}else {
			return false;
		}
	}
	
	// toString �޼ҵ� �������̵� - arr �迭�� ���빰�� [��, ��, ....] �������� ���ڿ� ����
	
	@Override
	public String toString() {
		
		return arr.toString();
		
	}
	
	
	
}
