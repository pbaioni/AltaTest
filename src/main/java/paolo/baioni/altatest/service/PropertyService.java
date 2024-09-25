package paolo.baioni.altatest.service;

import paolo.baioni.altatest.model.animal.AbstractAnimal;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.vehicle.AbstractVehicle;
import paolo.baioni.altatest.model.vehicle.VehicleType;
import paolo.baioni.altatest.service.exception.WrongDestinationException;

public interface PropertyService {
	
	public AbstractVehicle addVehicle(String id, VehicleType type);
	public AbstractAnimal addAnimal(AbstractAnimal animal);
	
	public void removeVehicle(String id);
	public void removeAnimal(String className);
	
	public Integer countHangarVehicles();
	public Integer countVehiclesBySection(String sectionName);
	public void printHangarVehiclesToConsole();
	public void printHangarVehiclesToFile(String fileName);
	
	public Integer getFlyingItems();
	public Integer getRollingItems();
	public Integer getNavigatingItems();
	
	public Point move(String id, Point destination) throws WrongDestinationException;

}
