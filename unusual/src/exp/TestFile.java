package exp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFile {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("D:\\123456\\123.txt");
			fos=new FileOutputStream("E:\\000\\456.txt");
			byte[] words=new byte[1024];
			while(fis.read() != -1) {
				fis.read();
				fos.write(words,0,words.length);
			}
			System.out.println("文件创建成功");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//关闭输入输出流
			if(fis != null) 
				fis.close();
			if(fos != null)	
			fos.close();
		}
	}

}
