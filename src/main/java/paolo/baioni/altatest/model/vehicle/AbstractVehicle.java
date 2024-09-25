package paolo.baioni.altatest.model.vehicle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.locomotion.PointType;
import paolo.baioni.altatest.service.exception.WrongDestinationException;

public abstract class AbstractVehicle {

	protected String id;
	protected Point position;
	protected Collection<Locomotion> locomotions;
	protected Collection<PointType> acceptableDestinations;

	public AbstractVehicle(String id, Point position) {
		super();
		this.id = id;
		this.position = position;
		this.locomotions = new ArrayList<Locomotion>();
		this.acceptableDestinations = new ArrayList<PointType>();
	}

	public Point move(Point destination) throws WrongDestinationException {
		if (this.acceptableDestinations.contains(destination.getPointType())) {
			this.position = destination;
			return destination;
		}else {
			throw new WrongDestinationException(this.getClass().getSimpleName(), destination.getPointType().name());
		}
	}

	public String getId() {
		return id;
	}

	public Collection<Locomotion> getLocomotions() {
		return locomotions;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " id=" + id + ", position=" + position.toString();
	}


}
