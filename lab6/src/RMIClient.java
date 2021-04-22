import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;

import ftmk.rmi.sensor.TemperatureSensor;

public class RMIClient {
	
	public static void main(String[] args) {
		
		
		try {
			
			// Get registry
			Registry registry = LocateRegistry.getRegistry();
			
			// Look-up for the remote object
			TemperatureSensor remoteSensorAyerKeroh = (TemperatureSensor) registry.lookup("SensorAyerKeroh");
		    
			// Invoke method from the remote object
			int currentTemperature = remoteSensorAyerKeroh.getTemperature();
			
			HashMap<String, Integer> specificTemperature = remoteSensorAyerKeroh.getSpecificTemperature();
			
			System.out.println("Current temperature in Ayer Keroh is " + currentTemperature + " Celcius");
			
			System.out.println("A week temperature in Melaka: " + specificTemperature);
			
			float sum = 0.0f;
			float average = 0.0f;
			for (float f : specificTemperature.values()) {
			    sum += f;
			    average = sum / specificTemperature.size();
			}
			
			System.out.println("Average temperature for a week: " + average);

			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
