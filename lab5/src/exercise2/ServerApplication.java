package exercise2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApplication {
	
public static void main(String[] args) {
		
		try {
			
			// Port to receive and respond to request
			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			System.out.println("Ready for request");
			
			// Server need to be alive forever thus the while(true)
			while (true) {
				
				// Accept client request for connection
				Socket socket = serverSocket.accept();
				
				// Create input stream to read object
				ObjectInputStream objectIS = new ObjectInputStream(socket.getInputStream());
				
				// Read object from stream and cast to Location
				itemProduct product = (itemProduct) objectIS.readObject();
				
				//Check the string contain only alphanumeric and spaces
				String str = product.getName();;
		        if (str.matches("^[a-zA-Z0-9\\s]+$")) {
		        	product.setResult("contain only alphanumeric and spaces");
		        } else {
		        	product.setResult("does not contain only alphanumeric and spaces");
		        }
				
				// Process object
				product.setItemProductId(1);
				
				// Create output stream to send object
				ObjectOutputStream objectOS = new ObjectOutputStream(socket.getOutputStream());
				objectOS.writeObject(product);
				
				
				System.out.println("Ready for next request");
				
				// Close all streams
				objectIS.close();
				objectOS.close();
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
