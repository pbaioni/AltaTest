package paolo.baioni.altatest.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import paolo.baioni.altatest.model.vehicle.AbstractVehicle;

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

	public boolean addAirportVehicle(AbstractVehicle airportVehicle) {
		return this.airportVehicles.add(airportVehicle);
	}

	public boolean addHarbourVehicle(AbstractVehicle harbourVehicle) {
		return this.harbourVehicles.add(harbourVehicle);
	}

	public boolean addGarageVehicle(AbstractVehicle garageVehicle) {
		return this.garageVehicles.add(garageVehicle);
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
}
