package com.hellohava.koreanpoker;

//인스턴스
public class kpokerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kpokerDeck p = new kpokerDeck();  // 섰다 덱 속성의 'p' 를 참조변수로 선언
		
		int[] deckaa = p.randonDeck();
		
		System.out.println(deckaa[0]);
		System.out.println(deckaa[1]);

	}

}
