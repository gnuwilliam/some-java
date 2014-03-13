package com.gnuwilliam.parsexml.handler;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseXMLHandler {
	ArrayList<String> content;
	
	public ArrayList<String> parseXML(String url) {
		content = new ArrayList<String>();
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(url);
			NodeList list = doc.getElementsByTagName("title");
			
			Node node1 = list.item(0);
			node1.getParentNode().removeChild(node1);
			Node node2 = list.item(0);
			node2.getParentNode().removeChild(node2);
			
			for (int i = 0; i < list.getLength(); i++) {
				Element item = (Element)list.item(i);
				String strItem = item.getFirstChild().getNodeValue().toString();
				content.add(strItem);
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return content;
	}
}
