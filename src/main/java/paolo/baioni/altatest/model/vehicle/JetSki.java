package paolo.baioni.altatest.model.vehicle;

import paolo.baioni.altatest.model.property.Navigant;

public class JetSki extends AbstractVehicule implements Navigant {
	@Override
	public void navigue(Point origine, Point destination) {
		seDeplace(origine, destination);
	}
}
