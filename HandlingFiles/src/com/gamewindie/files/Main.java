package com.gamewindie.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File("lorem.txt");
			File newFile = new File("target.txt");
			
			InputStream in = new FileInputStream(file);
			OutputStream out = new FileOutputStream(newFile);
			
			byte[] buf = new byte[1024];
			int len;
			
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			
			in.close();
			out.close();
			
			System.out.println("File copied!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
