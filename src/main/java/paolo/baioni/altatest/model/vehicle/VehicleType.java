package paolo.baioni.altatest.model.vehicle;

public enum VehicleType {
	Aircraft("aircraft"),
	Boat("boat"),
	Car("car"),
	Helicopter("helicopter"),
	Jetski("jetski"),
	MotorBike("motorbike"),
	Seaplane("seaplane");

    private String label;

    private VehicleType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static VehicleType valueOfLabel(String label) {
        for (VehicleType e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
