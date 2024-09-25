package paolo.baioni.altatest.model.animal;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;

public class WaterAnimal extends AbstractAnimal{
	
	public WaterAnimal() {
		this.locomotions.addAll(Arrays.asList(Locomotion.NAVIGATE));
	}

}
