package paolo.baioni.altatest.model.locomotion;

public enum Locomotion {
	FLY("fly"),
	NAVIGATE("navigate"),
	ON_GROUND("on_ground");
	
    private String label;

    private Locomotion(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static Locomotion valueOfLabel(String label) {
        for (Locomotion e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
