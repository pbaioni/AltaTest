package paolo.baioni.altatest.service.impl;

import org.springframework.stereotype.Service;

import paolo.baioni.altatest.model.animal.AbstractAnimal;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.vehicle.AbstractVehicle;
import paolo.baioni.altatest.model.vehicle.VehicleType;
import paolo.baioni.altatest.repository.Farm;
import paolo.baioni.altatest.repository.Hangar;
import paolo.baioni.altatest.service.PropertyService;
import paolo.baioni.altatest.service.exception.WrongDestinationException;

@Service
public class PropertyServiceImpl implements PropertyService{
	
	private Hangar hangar;
	private Farm farm;
	
	public PropertyServiceImpl(Hangar hangar, Farm farm) {
		super();
		this.hangar = hangar;
		this.farm = farm;
	}

	@Override
	public AbstractVehicle addVehicle(String id, VehicleType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractAnimal addAnimal(AbstractAnimal animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeVehicle(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAnimal(String className) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer countHangarVehicles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer countVehiclesBySection(String sectionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printHangarVehiclesToConsole() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printHangarVehiclesToFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getFlyingItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getRollingItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNavigatingItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point move(String id, Point destination) throws WrongDestinationException {
		// TODO Auto-generated method stub
		return null;
	}



}
