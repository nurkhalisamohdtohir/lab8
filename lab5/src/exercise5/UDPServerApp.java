package exercise5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.StringTokenizer;

public class UDPServerApp {
	
	public static void main(String[] args) throws IOException
    {
        // Create a socket to listen at port 1234
        DatagramSocket datagramSocket = new DatagramSocket(1234);
        byte[] buf = null;
        DatagramPacket DpReceive = null;
        DatagramPacket DpSend = null;
        while (true)
        {
            buf = new byte[65535];
  
            // create a DatgramPacket to receive the data.
            DpReceive = new DatagramPacket(buf, buf.length);
  
            // receive the data in byte buffer.
            datagramSocket.receive(DpReceive);
  
            String input = new String(buf, 0, buf.length);
  
            //To show client's input
            System.out.println("Text Received: " + input);
            
            // perform the required operation.
            int word = input.split("\\s+").length;
  
            // Exit the server if the client sends "bye"
            if (input.equals("bye"))
            {
                System.out.println("Client sent bye.....EXITING");
                break;
            }
  
  
            System.out.println("Sending the result...");
            String result = Integer.toString(word);
            System.out.println("Total words: " + result);
            System.out.println(" ");
  
            // Clear the buffer after every message.
            buf = result.getBytes();
  
            // get the port of client.
            int port = DpReceive.getPort();
  
            DpSend = new DatagramPacket(buf, buf.length,
                          InetAddress.getLocalHost(), port);
            datagramSocket.send(DpSend);
        }
    }

}
