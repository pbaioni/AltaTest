package paolo.baioni.altatest.model.property;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import paolo.baioni.altatest.model.locomotion.Navigant;
import paolo.baioni.altatest.model.locomotion.Roulant;
import paolo.baioni.altatest.model.locomotion.Volant;
import paolo.baioni.altatest.model.vehicle.Vehicule;

public class Hangar {
	private final Collection<Vehicule> vehiculeCollection = new ArrayList<>();

	public void entre(Vehicule vehicule) {
		vehiculeCollection.add(vehicule);
	}

	public int nombreDeVehiculesDansAeroport() {
		return vehiculeCollection.stream()
				.filter(v -> v instanceof Volant)
				.collect(Collectors.toSet())
				.size();
	}

	public int nombreDeVehiculesDansGarage() {
		return vehiculeCollection.stream()
				.filter(v -> v instanceof Roulant)
				.collect(Collectors.toSet())
				.size();
	}

	public int nombreDeVehiculeDansPort() {
		return vehiculeCollection.stream()
				.filter(v -> v instanceof Navigant)
				.collect(Collectors.toSet())
				.size();
	}

	public int nombreDeVehiculeDansHangar() {
		return vehiculeCollection.size();
	}

	private void imprimer(Vehicule vehicule, PrintStream printStream) {
		printStream.println("Vehicule de type "  + vehicule.getClass().getSimpleName());
		printStream.println(vehicule);
	}

	public void imprimerHangarDansConsole() {
		vehiculeCollection.forEach(v -> imprimer(v, System.out));
	}

	public void imprimerHangarDansFichier(File file) throws FileNotFoundException {
		PrintStream printStream = new PrintStream(new FileOutputStream(file));
		vehiculeCollection.forEach(v -> imprimer(v, printStream));
	}
}
