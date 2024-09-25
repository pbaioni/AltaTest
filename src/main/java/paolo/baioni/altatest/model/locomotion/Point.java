package paolo.baioni.altatest.model.locomotion;

import java.util.Objects;

public class Point {
	private final int x;
	private final int y;
	private final PointType pointType;

	public Point(PointType type, int x, int y) {
		this.pointType = type;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public PointType getPointType() {
		return pointType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointType, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return pointType == other.pointType && x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", type=" + pointType;
	}


}
