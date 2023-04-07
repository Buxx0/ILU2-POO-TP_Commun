package model;

public class FormulaireRestaurant extends Formulaire{
	private int nombrePersonne;
	private int numeroService;
	
	public FormulaireRestaurant(int jour, int mois, int nombrePersonne, int numeroService) {
		super(jour,mois);
		this.numeroService = numeroService;
		this.nombrePersonne = nombrePersonne;
	}

	public int getNombrePersonnes() {
		return nombrePersonne;
	}

	public int getNumService() {
		return numeroService;
	}

}