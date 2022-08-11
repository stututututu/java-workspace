package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class baekjoon {

	public static void main(String[] args) throws IOException {
	BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	int t = Integer.parseInt(bu.readLine());
	for (int i = 1; i <= t; i++) {
		st = new StringTokenizer(bu.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
		
		}

	bw.close();
	}
}
