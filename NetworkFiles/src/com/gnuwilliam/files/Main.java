package com.gnuwilliam.files;

import com.gnuwilliam.files.handlers.GetNetworkFile;


public class Main {

	public static void main(String[] args) {
		GetNetworkFile file = new GetNetworkFile();
		file.getContent("http://feeds.bbci.co.uk/news/rss.xml?edition=int");
		System.out.println(file);
	}

}
