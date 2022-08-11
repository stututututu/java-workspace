package test;

import java.util.Scanner;

public class 알림시계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		if (M < 45) {
			H--;
			M = M + 60 - 45;
			
			H = H == -1 ? 23 : H;
			
			System.out.println(H + " " + M);
		} 
		
		
	}

}