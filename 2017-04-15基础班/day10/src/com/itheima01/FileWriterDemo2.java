package com.itheima01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 相对路径和绝对路径
 * flush(): 刷新该流的缓冲。 
 * close(): 关闭此流，但要先刷新它。在关闭该流之后，再调用 write() 或 flush() 将导致抛出 IOException。关闭以前关闭的流无效。 
 */

public class FileWriterDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fWriter = new FileWriter(".\\src\\test.txt");// 前面要加一点

		fWriter.write("HelloWorld");
//		fWriter.flush();

		fWriter.close();

	}

}
