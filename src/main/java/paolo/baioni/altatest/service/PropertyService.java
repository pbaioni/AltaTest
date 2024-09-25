package paolo.baioni.altatest.service;

import java.io.IOException;

import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.vehicle.VehicleType;
import paolo.baioni.altatest.service.exception.WrongDestinationException;

public interface PropertyService {
	
	public boolean addVehicle(String id, VehicleType vehicleType);
	public boolean addAnimal(String animalType);
	
	public boolean removeVehicle(String id);
	public boolean removeAnimal(String className);
	
	public Integer countHangarVehicles();
	public Integer countVehiclesBySection(String sectionName);
	public void printHangarVehiclesToConsole();
	public void printHangarVehiclesToFile(String fileName) throws IOException;
	
	public void printItemsByLocomotion(Locomotion locomotion);
	
	public Point move(String id, Point destination) throws WrongDestinationException;

}
