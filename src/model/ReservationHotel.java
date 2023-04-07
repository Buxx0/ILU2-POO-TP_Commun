package model;

public class ReservationHotel extends Reservation {
	private int nbLitSimple;
	private int nbLitDouble;
	private int numeroChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numeroChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numeroChambre = numeroChambre;
	}
	
	
	@Override
	public String toString() {
		return "Le " + this.getJour() + "/" + this.getMois() +
				" : chambre numero " + this.numeroChambre + " avec " + 
				this.nbLitSimple + " lits simples et " + this.nbLitDouble + " lits doubles.\n";
	}
}
