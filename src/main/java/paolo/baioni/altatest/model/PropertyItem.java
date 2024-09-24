package paolo.baioni.altatest.model;

public abstract class PropertyItem {
	
	protected String name;
	
	public PropertyItem(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
