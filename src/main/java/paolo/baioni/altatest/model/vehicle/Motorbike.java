package paolo.baioni.altatest.model.vehicle;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.locomotion.PointType;

public class Motorbike extends AbstractVehicle {
	public Motorbike(String id, Point position) {
		super(id, position);
		this.locomotions.add(Locomotion.ON_GROUND);
		this.acceptableDestinations.addAll(Arrays.asList(PointType.GARAGE, PointType.GROUND));
	}
}
