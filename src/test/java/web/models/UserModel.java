package web.models;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import web.services.xmlParser;

public class UserModel {
    private String login = "";
    private String password = "";

    public void setAdminCredantial() {
        xmlParser xmlParser = new xmlParser();
        NodeList nodes = xmlParser.parseXml("admin");

        for(int i = 0; i < nodes.getLength(); i++){
            System.out.println(nodes.item(i).getTextContent());
        }

        setUserCredential(nodes.item(0).getChildNodes().item(1).getTextContent(),
                nodes.item(0).getChildNodes().item(3).getTextContent());
    }

    public void setDirectorCredential() {
        xmlParser xmlParser = new xmlParser();
        NodeList nodes = xmlParser.parseXml("director");

        setUserCredential(nodes.item(0).getChildNodes().item(1).getTextContent(),
                nodes.item(0).getChildNodes().item(3).getTextContent());
    }

    private void setUserCredential(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }
}
