package paolo.baioni.alta_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import paolo.baioni.altatest.AltaTestApplication;
import paolo.baioni.altatest.model.vehicle.VehicleType;
import paolo.baioni.altatest.service.PropertyService;
import paolo.baioni.altatest.service.exception.DuplicateIdException;


@SpringBootTest(classes = AltaTestApplication.class)
@TestInstance(Lifecycle.PER_CLASS)
public class PropertyTest {

	@Autowired
	private PropertyService propertyService;
	
	@BeforeAll
	public void init()  throws DuplicateIdException {
		propertyService.addAnimal("dog");
		propertyService.addAnimal("dog");
		propertyService.addAnimal("duck");
		propertyService.addAnimal("duck");
		propertyService.addAnimal("eagle");
		propertyService.addAnimal("wateranimal");
		propertyService.addAnimal("wateranimal");
		propertyService.addAnimal("wateranimal");
		propertyService .addVehicle("airForceOne", VehicleType.Aircraft);
		propertyService .addVehicle("airForceTwo", VehicleType.Aircraft);
		propertyService .addVehicle("helicopter1", VehicleType.Helicopter);
		propertyService .addVehicle("helicopter2", VehicleType.Helicopter);
		propertyService .addVehicle("motorbike1", VehicleType.MotorBike);
		propertyService .addVehicle("motorbike2", VehicleType.MotorBike);
		propertyService .addVehicle("car1", VehicleType.Car);
		propertyService .addVehicle("car2", VehicleType.Car);
		propertyService .addVehicle("boat1", VehicleType.Boat);
		propertyService .addVehicle("boat2", VehicleType.Boat);
		propertyService .addVehicle("jetski1", VehicleType.Jetski);
		propertyService .addVehicle("jetski2", VehicleType.Jetski);
		propertyService .addVehicle("seaplane1", VehicleType.Seaplane);
		propertyService .addVehicle("seaplane2", VehicleType.Seaplane);
	}
	
	@Test
	public void testPrintAllVehiclesToConsole() {
		propertyService.printHangarVehiclesToConsole();
	}
	
	@Test
	public void testPrintAllVehiclesToFile() throws IOException {
		propertyService.printHangarVehiclesToFile("allVehicles");
	}
	
	@Test
	public void testAddAndRemoveAnimal() {
		assertTrue(propertyService.addAnimal("dog"));
		assertTrue(propertyService.removeAnimal("dog"));
	}
	
	@Test
	public void testAddAndRemoveVehicle() throws DuplicateIdException {
		assertTrue(propertyService.addVehicle("seaplane1234", VehicleType.Seaplane));
		assertTrue(propertyService.removeVehicle("seaplane1234"));
	}
	
	@Test
	public void testCountHangarVehicles() throws IOException {
		assertTrue(propertyService.countHangarVehicles().equals(14));

	}
	
	@Test
	public void testCountVehiclesBySection() throws IOException {
		assertTrue(propertyService.countVehiclesBySection("airport").equals(4));
		assertTrue(propertyService.countVehiclesBySection("harbour").equals(6));
		assertTrue(propertyService.countVehiclesBySection("garage").equals(4));

	}
	
	@Test
	public void testDuplicatedId() throws DuplicateIdException{
		assertThrows(DuplicateIdException.class, () -> propertyService.addVehicle("airForceOne", VehicleType.Aircraft));

	}
	
}
