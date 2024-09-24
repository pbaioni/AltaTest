package paolo.baioni.altatest.controller;

import org.springframework.web.bind.annotation.RestController;

import paolo.baioni.altatest.service.PropertyService;

@RestController
public class PropertyController {

	private PropertyService propertyService;
	
	public PropertyController(PropertyService propertyService) {
		this.propertyService = propertyService;
		System.out.println("Controller instanciated");
	}
}
