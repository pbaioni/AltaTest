package paolo.baioni.altatest.model.animal;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;

public class Duck extends AbstractAnimal{
	
	public Duck() {
		this.locomotions.addAll(Arrays.asList(Locomotion.FLY, Locomotion.NAVIGATE, Locomotion.ON_GROUND));
	}

}
