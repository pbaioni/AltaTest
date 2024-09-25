package paolo.baioni.altatest.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import paolo.baioni.altatest.model.animal.AbstractAnimal;

@Repository
public class Farm {

	private Collection<AbstractAnimal> animals;

	public Farm() {
		super();
		this.animals = new ArrayList<AbstractAnimal>();
	}

	public boolean addAnimal(AbstractAnimal animal) {
		return this.animals.add(animal);
	}

	public boolean removeAnimalByClassName(String className) {
		boolean rval = false;
			Optional<AbstractAnimal> optionalAnimalToRemove = animals.stream().filter(a -> a.getClass().getSimpleName().toLowerCase().equals(className.toLowerCase())).findFirst();
			if(optionalAnimalToRemove.isPresent()) {
				rval =  animals.remove(optionalAnimalToRemove.get());
			}
		return rval;
	}
}
