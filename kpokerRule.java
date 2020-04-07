package com.hellohava.koreanpoker;

public class kpokerRule {
	
	String jookBo = "";
	int sumDeck = 0;
	
	String to = Integer.toString(sumDeck);


	
	 void jookBo(int a, int b){
		if(a == b){
			System.out.println( a + "땡");
		}else{
			sumDeck = a + b;
			String cddd = substring(to.length()-3, to.length());
		}
	}

	private String substring(int i, int length) {
		// TODO Auto-generated method stub
		return null;
	}
}

/*
 * 
 * String 0> int
int from = 123;

String to = Integer.toString(from);


int > string
String from = "123";

int to = Integer.parseInt(from);*/

/*

String.substring(int beginIndex) : 시작 위치(맨 처음은 0)로부터 String 마지막까지 잘라서 리턴.

String.substring(int beginIndex, int lastIndex) : 시작위치 부터 마지막 위치까지 잘라서 리턴*/

/*String a = "문자열"; 
char last = a.charAt(a.length() - 1)*/