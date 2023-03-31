package model;

public class ReservationRestaurant extends Reservation{
	private int numeroService;
	private int numeroTableReservee;
	
	public ReservationRestaurant(int jour, int mois,int numeroService, int numeroTableReservee) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTableReservee = numeroTableReservee;
	}
	
	@Override
	public String toString() {
		StringBuilder reservationRestaurant = new StringBuilder();
		reservationRestaurant.append("Le " + this.getJour() + "/" + this.getMois() +
				" : table numero " + this.numeroTableReservee);
		if (numeroService == 1) {
			reservationRestaurant.append( " pour le premier service.\n");
		} else if (numeroService == 2) {
			reservationRestaurant.append( " pour le deuxieme service.\n");
		}
		return reservationRestaurant.toString();
	}
}
