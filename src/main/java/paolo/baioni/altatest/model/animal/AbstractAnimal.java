package paolo.baioni.altatest.model.animal;

import java.util.ArrayList;
import java.util.Collection;

import paolo.baioni.altatest.model.locomotion.Locomotion;

public class AbstractAnimal {
	
	protected Collection<Locomotion> locomotions;
	
	public AbstractAnimal() {
		this.locomotions = new ArrayList<Locomotion>();
	}

}
