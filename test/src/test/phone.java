package test;

public class phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int allcnt = 0;
		String[] people = { "a", "b", "c", "d", "e" };
		String[] phone = { "g", "i", "g", "i", "g" };
for (int i = 0; i < phone.length; i++) {
	if (phone[i]=="i") {
		System.out.println(people[i]);
		cnt++;
		
			}allcnt++;
		}
System.out.println("아이폰인 인원"+cnt+'명');	
System.out.println("갤럭시인 인원"+(phone.length-cnt)+"명");
System.out.println(allcnt+"명");
	}

}


