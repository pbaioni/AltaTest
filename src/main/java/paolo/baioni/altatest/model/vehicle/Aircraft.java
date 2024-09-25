package paolo.baioni.altatest.model.vehicle;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.locomotion.PointType;

public class Aircraft extends AbstractVehicle {

	public Aircraft(String id, Point position) {
		super(id, position);
		this.locomotions.add(Locomotion.FLY);
		this.acceptableDestinations.addAll(Arrays.asList(PointType.AIRPORT, PointType.SKY));
	}
}
