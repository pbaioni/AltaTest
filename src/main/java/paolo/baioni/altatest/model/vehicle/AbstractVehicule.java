package paolo.baioni.altatest.model.vehicle;

public abstract class AbstractVehicule implements Vehicule{
	private static Integer idIndex = 0;
	private Integer id = null;

	public final Integer getId() {
		if (null == id) {
			id = ++idIndex;
		}

		return id;
	}

	public void seDeplace(Point origine, Point destination) {
		System.out.printf("Vehicule de type %s et d'identifiant %d se déplace de %s à %s\n", getClass().getSimpleName(), getId(), origine, destination);
	}

}
