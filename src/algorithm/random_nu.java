package algorithm;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;

public class random_nu {
	// 生成1000个8随机位数到文件resultFile
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int rs = 0;
		String rst = "";
		DecimalFormat f = new DecimalFormat("00000000"); // 高位补零
		File resultFile = new File("D:\\ming\\resultFile.txt");
		FileOutputStream resultOut = new FileOutputStream(resultFile);
		for (int i = 0; i < 1000; i++) {
			Random r = new Random(); // 随机生成器
			rs = r.nextInt(100000000); // 随机生成小于9位的数
			rst = f.format(rs);
			System.out.println(rst);
			resultOut.write(rst.getBytes()); // 写出Byte序列到文件
			resultOut.write('\n');
		}
	}
}

