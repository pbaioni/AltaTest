package paolo.baioni.altatest.model.vehicle;

import paolo.baioni.altatest.model.property.Roulant;

public class Moto extends AbstractVehicule implements Roulant {
	@Override
	public void roule(Point origine, Point destination) {
		seDeplace(origine, destination);
	}
}
