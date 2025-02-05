package model;

public class CentraleReservation <E extends EntiteReservable<F>,F extends Formulaire> {
	private int nbentites;
	private E tableau[];
	
	
	
	public CentraleReservation(int nbentites, E[] tableau) {
		this.tableau = tableau;
		this.nbentites = nbentites;
	}

	public int ajouterEntite(E entite) {
		tableau[++nbentites] = entite;
		return nbentites;
		
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int tabint[] = new int[nbentites];
		for(int i = 0; i>nbentites;i++) {
			if(tableau[i].compatible(formulaire)) tabint[i] = nbentites;
			else tabint[i] = 0;
		}
		return tabint;
	}
	
	public Reservation reserver(int i, F formulaire) {
		formulaire.setIdentificationEntite(i);
		return tableau[i].reserver(formulaire);
	}
}