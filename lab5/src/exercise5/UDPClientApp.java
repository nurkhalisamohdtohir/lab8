package exercise5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientApp {
	
	public static void main(String args[]) throws IOException
    {
		System.out.println("ClientSideApp: sending request\n");
		
        Scanner sc = new Scanner(System.in);
  
        // Create the socket object for carrying the data
        DatagramSocket datagramSocket = new DatagramSocket();
  
        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;
  
        // loop while user not enters "bye"
        while (true)
        {
            System.out.print("Enter text:");
            String input = sc.nextLine();
            buf = new byte[65535];
  
            // convert the String input into the byte array.
            buf = input.getBytes();
  
            // Create the datagramPacket for sending the data.
            DatagramPacket DpSend =
                      new DatagramPacket(buf, buf.length, ip, 1234);
  
            // invoke the send method to send the data.
            datagramSocket.send(DpSend);
  
            // break the loop if user enters "bye"
            if (input.equals("bye"))
                break;
  
            buf = new byte[65535];
            DatagramPacket DpReceive =
                                 new DatagramPacket(buf, buf.length);
            datagramSocket.receive(DpReceive);
  
            System.out.println("Total words = " +
                                new String(buf,0,buf.length));
            System.out.println(" ");
        }
    }

}
