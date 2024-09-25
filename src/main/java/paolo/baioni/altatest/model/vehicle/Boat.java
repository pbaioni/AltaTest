package paolo.baioni.altatest.model.vehicle;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.locomotion.PointType;

public class Boat extends AbstractVehicle {

	public Boat(String id, Point position) {
		super(id, position);
		this.locomotions.add(Locomotion.NAVIGATE);
		this.acceptableDestinations.addAll(Arrays.asList(PointType.HARBOUR, PointType.WATER));
	}
}
