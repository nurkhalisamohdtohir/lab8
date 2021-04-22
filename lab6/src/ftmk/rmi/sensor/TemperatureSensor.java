package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * This interface represents temperature sensor
 * 
 * @author emalianakasmuri
 *
 */
public interface TemperatureSensor extends Remote {
	
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;
	
	/**
	 * This method gets specified temperature
	 * 
	 * @return specified temperature
	 * 
	 * @throws RemoteException
	 */
	public HashMap<String, Integer> getSpecificTemperature() throws RemoteException;

}
