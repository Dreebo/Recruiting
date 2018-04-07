package web.services;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class xmlParser {
    public NodeList parseXml (String role) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("./src/test/java/resources/resources.xml");

            XPathFactory pathFactory = XPathFactory.newInstance();
            XPath xpath = pathFactory.newXPath();
            XPathExpression pathExpression = xpath.compile("users/user[@role='" + role + "']");
            NodeList nodes = (NodeList) pathExpression.evaluate(document, XPathConstants.NODESET);

            return nodes;
        } catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException ex){
            ex.printStackTrace(System.out);
        }

        return null;
    }
}
