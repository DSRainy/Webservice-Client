/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.training.webservice.client;

import javax.xml.ws.WebServiceRef;
import th.co.geniustree.training.wsclient.MyDTO;
import th.co.geniustree.training.wsclient.TestWebService;
import th.co.geniustree.training.wsclient.TestWebService_Service;

/**
 *
 * @author Rain
 */
public class App {
    public static void main(String[] args) {
        
        try { // Call Web Service Operation
            TestWebService_Service service =new TestWebService_Service();
            TestWebService port = service.getTestWebServicePort();
            java.lang.String name = "";
            java.util.List<MyDTO> result = port.hello(name);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
