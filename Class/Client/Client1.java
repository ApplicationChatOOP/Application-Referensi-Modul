/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.net.*;
import java.io.*;

/**
 *
 * @author Said Al - Fakhri
 */
public class Client1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",2002);
            System.out.println("Komunikasi terhubung");
            System.out.println("Client pada port = " +
                    s.getLocalAddress().getHostAddress()+":"+
                    s.getLocalPort());
            System.out.println("Server pada port="+
                    s.getInetAddress().getHostAddress()+":"+
                    s.getPort());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Menunggu pesan...");
            
            String greeting = "";
            while((greeting=br.readLine())!=null){System.out.println(greeting);}
            System.out.println("Selesai");
            br.close();
            s.close();
                    
        } catch(Exception e){e.printStackTrace();}
    }
}
