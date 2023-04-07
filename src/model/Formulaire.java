package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	protected int numeroEntiteReservee;
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return numeroEntiteReservee;
	}

	public void setIdentificationEntite(int numeroEntiteReservee) {
		this.numeroEntiteReservee = numeroEntiteReservee;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
}
