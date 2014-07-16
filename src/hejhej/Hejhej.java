/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hejhej;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author robin
 */
public class Hejhej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        boolean status = true;
        if(status){
            sockets sock = new sockets(ip);
        }else{
            GreetingServer serv = new GreetingServer();
        }
        
        System.out.println("Hejsan");
        // TODO code application logic here
    }
    
}
