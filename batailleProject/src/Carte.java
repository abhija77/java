
public class Carte {
	private Couleur couleur;
	private static String[] valeurName = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"};
	private short valeur;
	
	public Carte(Couleur couleur, short valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}
	public Couleur getCouleur() {
		return couleur;
	}
	public short getValeur() {
		return valeur;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	public void setValeur(short valeur) {
		this.valeur = valeur;
	}
	
	public String toString() {
		return valeurName[this.getValeur()] + " de " + this.couleur;
	}
	
	public boolean isGreatThan(Carte carteToCompare) {
		if (this.valeur  > carteToCompare.getValeur()  ) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
