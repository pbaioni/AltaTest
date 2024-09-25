package paolo.baioni.altatest.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import paolo.baioni.altatest.model.vehicle.AbstractVehicle;
import paolo.baioni.altatest.service.exception.DuplicateIdException;

@Repository
public class Hangar {

	private Collection<AbstractVehicle> airportVehicles;
	private Collection<AbstractVehicle> harbourVehicles;
	private Collection<AbstractVehicle> garageVehicles;

	public Hangar() {
		this.airportVehicles = new ArrayList<AbstractVehicle>();
		this.harbourVehicles = new ArrayList<AbstractVehicle>();
		this.garageVehicles = new ArrayList<AbstractVehicle>();
	}

	public boolean addAirportVehicle(AbstractVehicle airportVehicle) throws DuplicateIdException {
		if(checkNotDoubleId(airportVehicle.getId())) {
		return this.airportVehicles.add(airportVehicle);
		}else {
			throw new DuplicateIdException();
		}
	}

	public boolean addHarbourVehicle(AbstractVehicle harbourVehicle) throws DuplicateIdException {
		return this.harbourVehicles.add(harbourVehicle);
	}

	public boolean addGarageVehicle(AbstractVehicle garageVehicle) throws DuplicateIdException {
		return this.garageVehicles.add(garageVehicle);
	}

	private boolean checkNotDoubleId(String id) {
		boolean rval = true;
		for(AbstractVehicle vehicle : getAllVehicles()) {
			if(vehicle.getId().equals(id)) {
				rval = false;
				continue;
			}
		}
		return rval;
	}
	
	public boolean removeVehicleById(String id) {
		boolean rval = true;
		if (!airportVehicles.removeIf(v -> v.getId().equals(id))) {
			if (!harbourVehicles.removeIf(v -> v.getId().equals(id))) {
				rval = garageVehicles.removeIf(v -> v.getId().equals(id));
			}
		}
		return rval;
	}

	public Collection<AbstractVehicle> getAirportVehicles() {
		return airportVehicles;
	}

	public Collection<AbstractVehicle> getHarbourVehicles() {
		return harbourVehicles;
	}

	public Collection<AbstractVehicle> getGarageVehicles() {
		return garageVehicles;
	}

	public Collection<AbstractVehicle> getAllVehicles() {
		Collection<AbstractVehicle> rval = new ArrayList<AbstractVehicle>();
		rval.addAll(airportVehicles);
		rval.addAll(harbourVehicles);
		rval.addAll(garageVehicles);
		return rval;
	}
}
