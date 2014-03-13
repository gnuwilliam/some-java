package com.gnuwilliam.files.handlers;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GetNetworkFile {
	StringBuilder externalContent;
	
	public StringBuilder getContent(String contentUrl) {
		try {
			URL url = new URL(contentUrl);
			InputStream stream = url.openStream();
			BufferedInputStream buf = new BufferedInputStream(stream);
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				int data = buf.read();
				
				if (data == -1) {
					break;
				} else {
					sb.append((char)data);
				}
			}
			externalContent = sb;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(externalContent);
		return externalContent;
	}
}
