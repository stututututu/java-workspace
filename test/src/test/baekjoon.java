package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class baekjoon {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {

			
			int f1 = Integer.parseInt(st2.nextToken());
			arr[i] = f1;
			if (arr[i] < X) {
				bw.write(f1 + " ");
			}

		}

		bw.close();
	}
}