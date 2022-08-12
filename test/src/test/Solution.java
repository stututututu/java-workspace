package test;

import java.util.Iterator;

public class Solution {
	public static double solution(int[] arr) {
  	    double answer = 0;

  	    for (int val : arr) {
        	answer += val;
		}
  	    

  	    answer /= arr.length;
        return answer;
    
        
    }
	
	private void abc() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4};
		
		System.out.println(solution(arr));
	
	}
}
