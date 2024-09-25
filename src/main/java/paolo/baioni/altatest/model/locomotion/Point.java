package paolo.baioni.altatest.model.locomotion;

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

	public String toString () {
		return "(" + x + "," + y + ")";
	}
}
