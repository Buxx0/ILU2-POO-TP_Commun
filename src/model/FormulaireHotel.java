package model;

public class FormulaireHotel extends Formulaire{
	private int litSimple;
	private int litDouble;
	
	public FormulaireHotel(int jour, int mois, int litSimple, int litDouble) {
		super(jour,mois);
		this.litDouble = litDouble;
		this.litSimple = litSimple;
	}

	public int getLitSimple() {
		return litSimple;
	}

	public int getLitDouble() {
		return litDouble;
	}
	
}
