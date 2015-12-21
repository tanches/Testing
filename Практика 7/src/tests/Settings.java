package tests;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Settings {

	public static String file = "set.xml";
	
/*	private static String baseUrl;
	private static String link;
	private static String type;
	private static String activityType;
	private static String region;
	private static String resortBase;*/
	
	
	public static HashMap<String, HashMap> settings() throws SAXException, IOException {
		HashMap<String, HashMap> listHashMap = new HashMap<>();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			NodeList list = doc.getElementsByTagName("Settings");
			for (int temp = 0; temp < list.getLength(); temp++) {
				Node node = list.item(0);
				HashMap<String, String> map = new HashMap<>();
				Element element = (Element) node;
				//map.put("BaseUrl", element.getElementsByTagName("BaseUrl").item(0).getTextContent());
				map.put("Link", element.getElementsByTagName("Link").item(0).getTextContent());
				map.put("Type", element.getElementsByTagName("Type").item(0).getTextContent());
				map.put("ActivityType", element.getElementsByTagName("ActivityType").item(0).getTextContent());
				map.put("Region", element.getElementsByTagName("Region").item(0).getTextContent());
				//map.put("ResortBase", element.getElementsByTagName("ResortBase").item(0).getTextContent());
				listHashMap.put(element.getAttribute("id"), map);
				
			}
		} catch (ParserConfigurationException e) {
		}
		return listHashMap;
	}
	
}
