package paolo.baioni.altatest.model.animal;

import java.util.Arrays;

import paolo.baioni.altatest.model.locomotion.Locomotion;

public class Eagle extends AbstractAnimal{
	
	public Eagle() {
		this.locomotions.addAll(Arrays.asList(Locomotion.FLY));
	}

}
