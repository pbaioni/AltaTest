package paolo.baioni.altatest.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import org.springframework.stereotype.Service;

import paolo.baioni.altatest.model.animal.Dog;
import paolo.baioni.altatest.model.animal.Duck;
import paolo.baioni.altatest.model.animal.Eagle;
import paolo.baioni.altatest.model.animal.WaterAnimal;
import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.vehicle.AbstractVehicle;
import paolo.baioni.altatest.model.vehicle.Aircraft;
import paolo.baioni.altatest.model.vehicle.Boat;
import paolo.baioni.altatest.model.vehicle.Car;
import paolo.baioni.altatest.model.vehicle.Helicopter;
import paolo.baioni.altatest.model.vehicle.JetSki;
import paolo.baioni.altatest.model.vehicle.Motorbike;
import paolo.baioni.altatest.model.vehicle.Seaplane;
import paolo.baioni.altatest.model.vehicle.VehicleType;
import paolo.baioni.altatest.repository.Farm;
import paolo.baioni.altatest.repository.Hangar;
import paolo.baioni.altatest.service.PropertyService;
import paolo.baioni.altatest.service.exception.DuplicateIdException;
import paolo.baioni.altatest.service.exception.WrongDestinationException;
import paolo.baioni.altatest.utils.MapUtils;

@Service
public class PropertyServiceImpl implements PropertyService {

	private Hangar hangar;
	private Farm farm;

	public PropertyServiceImpl(Hangar hangar, Farm farm) {
		super();
		this.hangar = hangar;
		this.farm = farm;
	}

	@Override
	public boolean addVehicle(String id, VehicleType type) throws DuplicateIdException {
		switch (type) {
		case Aircraft:
			return hangar.addAirportVehicle(new Aircraft(id, MapUtils.airportPoint));
		case Helicopter:
			return hangar.addAirportVehicle(new Helicopter(id, MapUtils.airportPoint));
		case Car:
			return hangar.addGarageVehicle(new Car(id, MapUtils.garagePoint));
		case MotorBike:
			return hangar.addGarageVehicle(new Motorbike(id, MapUtils.garagePoint));
		case Boat:
			return hangar.addHarbourVehicle(new Boat(id, MapUtils.harbourPoint));
		case Jetski:
			return hangar.addHarbourVehicle(new JetSki(id, MapUtils.harbourPoint));
		case Seaplane:
			return hangar.addHarbourVehicle(new Seaplane(id, MapUtils.harbourPoint));
		default:
			return false;
		}

	}

	@Override
	public boolean addAnimal(String animalType) {
		switch (animalType) {
		case "dog":
			return farm.addAnimal(new Dog());
		case "duck":
			return farm.addAnimal(new Duck());
		case "eagle":
			return farm.addAnimal(new Eagle());
		case "wateranimal":
			return farm.addAnimal(new WaterAnimal());
		default:
			return false; // it would be better to throw an exception here
		}

	}

	@Override
	public boolean removeVehicle(String id) {
		return hangar.removeVehicleById(id);

	}

	@Override
	public boolean removeAnimal(String className) {
		return farm.removeAnimalByClassName(className);
	}

	@Override
	public Integer countHangarVehicles() {
		return hangar.getAllVehicles().size();
	}

	@Override
	public Integer countVehiclesBySection(String sectionName) {
		switch (sectionName) {
		case "airport":
			return hangar.getAirportVehicles().size();
		case "harbour":
			return hangar.getHarbourVehicles().size();
		case "garage":
			return hangar.getGarageVehicles().size();
		default:
			return 0;
		}
	}

	@Override
	public void printHangarVehiclesToConsole() {
		System.out.println();
		System.out.println(listAllVehicles());
		System.out.println();
	}

	@Override
	public void printHangarVehiclesToFile(String fileName) throws IOException {
		FileWriter hangarVehicles = new FileWriter("output/"+fileName+".txt");
		hangarVehicles.write(listAllVehicles());
		hangarVehicles.close();

	}
	
	private String listAllVehicles() {
		Collection<AbstractVehicle> allVehicles = hangar.getAllVehicles();
		StringBuilder sb = new StringBuilder("Here follows the list of all hangar vehicles:\n");
		for (AbstractVehicle vehicle : allVehicles) {
			sb.append(vehicle.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	@Override
	public void printItemsByLocomotion(Locomotion locomotion) {
		// TODO Auto-generated method stub
	}

	@Override
	public Point move(String id, Point destination) throws WrongDestinationException {
		// TODO Auto-generated method stub
		return null;
	}

}
