package test;
public int sum(int k) {
    int sum = 0;
    for (int i = 1; i <= k; i++) {
        sum += i;
    }
    return sum;
public class Main {

	
	
	}
	
	public void swap(int[] a, int i, int j) {
	    int t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	}
	
	
	public static void main(String[] args) {
		 
        int s10 = sum(10);
        int s100 = sum(100);
        int s1000 = sum(10000);
 
        System.out.println(s10);
        System.out.println(s100);
        System.out.println(s1000);
 
        int a[] = { 1, 2, 3, 4};
        swap(a, 0,1);
        swap(a 2,3);
    }
}
