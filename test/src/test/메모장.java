package test;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 메모장 {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\file\\it기능반1.txt"));
			String str = "오늘 날씨는 아주 좋습니다.";
			bs.write(str.getBytes()); // Byte형으로만 넣을 수 있음

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close();
		}
	}
}