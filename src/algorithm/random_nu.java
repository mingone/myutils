package algorithm;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;

public class random_nu {
	// ����1000��8���λ�����ļ�resultFile
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int rs = 0;
		String rst = "";
		DecimalFormat f = new DecimalFormat("00000000"); // ��λ����
		File resultFile = new File("D:\\ming\\resultFile.txt");
		FileOutputStream resultOut = new FileOutputStream(resultFile);
		for (int i = 0; i < 1000; i++) {
			Random r = new Random(); // ���������
			rs = r.nextInt(100000000); // �������С��9λ����
			rst = f.format(rs);
			System.out.println(rst);
			resultOut.write(rst.getBytes()); // д��Byte���е��ļ�
			resultOut.write('\n');
		}
	}
}

