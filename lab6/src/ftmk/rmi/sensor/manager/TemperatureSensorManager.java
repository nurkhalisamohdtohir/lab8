package ftmk.rmi.sensor.manager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

import ftmk.rmi.sensor.TemperatureSensor;

/**
 * This class manage the value of temperature from the sensor.
 * 
 * @author emalianakasmuri
 *
 */
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor {

	public TemperatureSensorManager() throws RemoteException {
		super();
	}

	@Override
	public int getTemperature() throws RemoteException {
		
		return 35;
	}
	
	private HashMap<String, Integer> temperatures = new HashMap<String, Integer>();

    public HashMap<String, Integer> getSpecificTemperature() {
    	
    	// add elements to hashmap
        temperatures.put("Monday", 32);
        temperatures.put("Tuesday", 31);
        temperatures.put("Wednesday", 33);
        temperatures.put("Thursday", 35);
        temperatures.put("Friday", 36);
        temperatures.put("Saturday", 33);
        temperatures.put("Sunday", 33);
        
         return temperatures;
    }

}
