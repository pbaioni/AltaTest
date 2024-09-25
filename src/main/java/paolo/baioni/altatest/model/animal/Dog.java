package paolo.baioni.altatest.model.animal;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;

public class Dog extends AbstractAnimal{
	
	public Dog() {
		this.locomotions.addAll(Arrays.asList(Locomotion.NAVIGATE, Locomotion.ON_GROUND));
	}

}
