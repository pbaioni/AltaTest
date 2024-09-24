package paolo.baioni.altatest.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import paolo.baioni.altatest.model.PropertyItem;
import paolo.baioni.altatest.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{
	
	public PropertyServiceImpl() {
		System.out.println("service instanciated");
	}

	@Override
	public void addVehicle() {

		
	}

	@Override
	public void addAnimal() {

		
	}

	@Override
	public List<PropertyItem> getPropertyItems() {

		return null;
	}

}
