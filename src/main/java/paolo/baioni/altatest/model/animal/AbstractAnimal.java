package paolo.baioni.altatest.model.animal;

import java.util.ArrayList;
import java.util.Collection;

import paolo.baioni.altatest.model.locomotion.Locomotion;

public class AbstractAnimal {
	
	protected Collection<Locomotion> locomotions;
	
	public AbstractAnimal() {
		this.locomotions = new ArrayList<Locomotion>();
	}

	public Collection<Locomotion> getLocomotions() {
		return locomotions;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
