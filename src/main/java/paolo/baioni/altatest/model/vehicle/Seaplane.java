package paolo.baioni.altatest.model.vehicle;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.locomotion.PointType;

public class Seaplane extends AbstractVehicle{

	public Seaplane(String id, Point position) {
		super(id, position);
		this.locomotions.addAll(Arrays.asList(Locomotion.NAVIGATE, Locomotion.FLY));
		this.acceptableDestinations.addAll(Arrays.asList(PointType.HARBOUR, PointType.WATER));
	}
}
