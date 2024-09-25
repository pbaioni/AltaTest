package paolo.baioni.altatest.utils;

import java.util.Random;

import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.locomotion.PointType;

public class MapUtils {
	
	public static final Point airportPoint = new Point(PointType.AIRPORT, 20, 25);
	public static final Point harbourPoint = new Point(PointType.HARBOUR, 30, 35);
	public static final Point garagePoint = new Point(PointType.GARAGE, 40, 45);
	
	public static Point getPointType(int x, int y) {
		Random random = new Random();
		PointType[] types = PointType.values();
        PointType randomType = types[random.nextInt(types.length)];
        return new Point(randomType, x, y);
	}

}
