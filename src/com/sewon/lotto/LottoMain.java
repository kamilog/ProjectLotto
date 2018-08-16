package com.sewon.lotto;

public class LottoMain {

	//2018-03-13 주석을 추가했습니다
	
	public static void main(String[] args) {

		/*만들기
		 *class Lotto
		 *public int[] generate (){
		 *
		 *}
		 *
		 *사용하기 
		 *Lotto lotto = new Lotto();
		 * int numbers[] = lotto.generate();
		 * 
		 */
		
		Lotto lotto = new Lotto();
		int numbers[]=lotto.generate();
		
		for(int num:numbers) {
			System.out.print(num+", ");
		
		}
		
	}

}








