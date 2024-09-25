package paolo.baioni.altatest.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import paolo.baioni.altatest.model.locomotion.Locomotion;
import paolo.baioni.altatest.model.locomotion.Point;
import paolo.baioni.altatest.model.locomotion.PointType;
import paolo.baioni.altatest.model.vehicle.VehicleType;
import paolo.baioni.altatest.service.PropertyService;
import paolo.baioni.altatest.service.exception.WrongDestinationException;
import paolo.baioni.altatest.utils.MapUtils;

@RestController("/property")
public class PropertyController {

	private PropertyService propertyService;
	
	public PropertyController(PropertyService propertyService) {
		this.propertyService = propertyService;
		System.out.println(String.format("You cannot move a %s to a %s point",
                "jetski", "ground"));
	}
	
	//two different approaches for addVehicle (uses enum) and addAnimal (uses plain String)
	//for a simple case like this app, I would prefer the plain String
	
	@PostMapping("/addVehicle")
	public ResponseEntity<Boolean> addVehicle(@RequestParam String id, @RequestParam String vehicleType){
		return new ResponseEntity<Boolean>(propertyService.addVehicle(id, VehicleType.valueOf(vehicleType.toLowerCase())), HttpStatus.OK);
	}
	
	@PostMapping("/addAnimal")
	public ResponseEntity<Boolean> addAnimal(@RequestParam String animalType){
		return new ResponseEntity<Boolean>(propertyService.addAnimal(animalType), HttpStatus.OK);
	}
	
	@DeleteMapping("/removeVehicle")
	public ResponseEntity<Boolean> removeVehicle(@RequestParam String id){
		return new ResponseEntity<Boolean>(propertyService.removeVehicle(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/removeAnimal")
	public ResponseEntity<Boolean> removeAnimal(@RequestParam String className){
		return new ResponseEntity<Boolean>(propertyService.removeAnimal(className), HttpStatus.OK);
	}

	@GetMapping("/countAllVehicles")
	public ResponseEntity<Integer> countAllVehicles(){
		return new ResponseEntity<Integer>(propertyService.countHangarVehicles(), HttpStatus.OK);
	}
	
	@GetMapping("/countSectionVehicles")
	public ResponseEntity<Integer> countSectionVehicles(@RequestParam String sectionName){
		return new ResponseEntity<Integer>(propertyService.countVehiclesBySection(sectionName), HttpStatus.OK);
	}
	
	@PostMapping("/printConsole")
	public void printConsole(){
		propertyService.printHangarVehiclesToConsole();
	}
	
	@PostMapping("/printToFile")
	public void printToFile(@RequestParam String fileName) throws IOException{
		propertyService.printHangarVehiclesToFile(fileName);
	}
	
	@PostMapping("/printByLocomotion")
	public void printFlying(@RequestParam String locomotion){
		propertyService.printItemsByLocomotion(Locomotion.valueOfLabel(locomotion.toLowerCase()));
	}
	
	@PostMapping("/move")
	public void printFlying(@RequestParam String id, @RequestParam Integer x, @RequestParam Integer y) throws WrongDestinationException{
		propertyService.move(id, MapUtils.getPointType(x, x));
	}
}
