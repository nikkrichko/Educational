package XML;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:/github/educational/src/main/java/XML/testxml.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            org.w3c.dom.Document document = documentBuilder.parse(file);


             NodeList nodeList = document.getElementsByTagName("element");

            for (int i = 0; i < nodeList.getLength(); i++){
                System.out.println(nodeList.item(i).getTextContent());
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
