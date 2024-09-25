package paolo.baioni.altatest.model.vehicle;

import paolo.baioni.altatest.model.property.Volant;

public class Helicopter extends AbstractVehicule implements Volant {

	@Override
	public void vole(Point origine, Point destination) {
		seDeplace(origine, destination);
	}
}
