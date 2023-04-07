package model;

public class FormulaireSpectacle extends Formulaire{
	private int numeroZone;
	
	public FormulaireSpectacle(int jour, int mois, int numeroZone) {
		super(jour,mois);
		this.numeroZone = numeroZone;
	}

	public int getNumZone() {
		return numeroZone;
	}

}
