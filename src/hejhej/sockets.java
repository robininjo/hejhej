package hejhej;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author robin
 */
public class sockets {
    public DataOutputStream out;
    public sockets(String ip) {
        String serverName = ip;
        System.out.println("Hej");
        int port = 8080;
        try{
            System.out.println("Connecting to " + serverName
                             + " on port " + port);
            Socket client = new Socket("10.0.1.9", port);
            System.out.println("Just connected to "
                      + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            out = new DataOutputStream(outToServer);

         out.writeUTF("Hello from "
                      + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in =
                        new DataInputStream(inFromServer);
         System.out.println("Server says " + in.readUTF());
         //client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
         System.out.println("No connection");
      }
        System.out.println("Hej");
        // TODO code application logic here
    }

 
}
