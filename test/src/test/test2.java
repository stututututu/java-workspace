package test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int cnt = 0;
//		
//		String[] people = { "a", "b", "c", "d", "e" };
//		String[] phone = { "g", "i", "i", "i", "g" };
//
//		for (int i = 0; i < phone.length; i++) {
//			
//			if (phone[i] == "i") {
//				System.out.println(people[i]);
//				cnt++; // cnt = cnt + 1;
//				System.out.println();
//			}
//		}
//		
//		System.out.println("I 개수 : " + cnt);

		
		int cnt = 0;
		
		String[] people = { "a", "b", "c", "d", "e" };
		String[] phone = { "g", "i", "i", "i", "g" };

		for (int i = 0; i < phone.length; i++) {
			
			if (phone[i] == "i") {
				System.out.println(people[i]);
				cnt++; // cnt = cnt + 1;
				System.out.println();
			
			}
			
		}
		
//		System.out.println("전체 인원" + allCnt + " I 개수 : " + cnt + "g 개수 " + (allCnt - cnt));
		System.out.println("전체 인원" + phone.length + " I 개수 : " + cnt + "g 개수 " + (phone.length - cnt));

		
	}

}
