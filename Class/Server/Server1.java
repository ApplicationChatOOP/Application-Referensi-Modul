/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.net.*;
import java.io.*;
/**
 *
 * @author SAID AL FAKHRI
 */
public class Server1 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            ServerSocket ss = new ServerSocket(2002);
            System.out.println("Menunggu Klien...");
            Socket s = ss.accept();
            System.out.println("Klien Telah Masuk");
            System.out.println("Server pada port = "+
                    s.getLocalAddress().getHostAddress()+
                    ":"+s.getLocalPort());
            System.out.println("Client pada port -" +
                    s.getInetAddress().getHostAddress()+
                    ":"+s.getPort());
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String greeting = "";
            while(!(greeting=br.readLine()).equals("")); {pw.println(greeting);}
            
            pw.close(); s.close(); ss.close();
        }catch(Exception e){ e.printStackTrace(); }
    }
}
