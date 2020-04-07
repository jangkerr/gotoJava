package com.hellohava.koreanpoker;
//객체
public class kpokerDeck {

	 String month ;  // 덱의 속성(멤버변수)
	boolean power;
	int channel;
	
	private int[] deck1 = {1,2,3,4,5,6,7,8,9,10, 1,2,3,4,5,6,7,8,9,10 };
	
	// 기능 (메서드)
	public int[] randonDeck()
	{  
		int[] ranDack = new int[1] ;
		
		for(int x=0; x<deck1.length; x++){
			int i = (int)(Math.random()*deck1.length);
			int j = (int)(Math.random()*deck1.length);
	    
			int tmp = deck1[i];
		    deck1[i] = deck1[j];
		    deck1[j] = tmp;
			
		}
		System.out.println(deck1[0]);
		System.out.println(deck1[2]);
		/*for(int x=0; x<2; x++){
			deck1[x] = ranDack[x];
			
		}*/
		int a = deck1[0];
		int b = deck1[1];
		
		ranDack[0] = a; 
		ranDack[1] = b;
		
		return ranDack;
    

	};

	void channelUp()	{	++channel;}
	void channelDown()	{	--channel;}
}



///1.3.8의 경우 j가 있는지 확인한다.
// 형변환 사용해서 진행
// 12번째 static 안되는 이유 확인할것
//배열 안됐던 이유 기술