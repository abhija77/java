
import java.util.ArrayList;
import java.util.List;

public class Joueur {

	private String name;
	private int points;
	private List<Carte> cartes = new ArrayList<>();
	
	public Carte tirerCarte() {
		Carte carteTire = this.cartes.iterator().next();
		// System.out.println("carte tire " + carteTire);
		System.out.println(this.name + " pose la " + carteTire);
		return carteTire;
	}
	public void ajouterCarte(Carte carte){
		this.cartes.add(carte);
		// System.out.println("Premier element apres ajout " + this.cartes.get(0));
	}
	public void retirerCarte(Carte carte) {
		this.cartes.remove(carte);
	}
	Joueur(String name){
		this.name = name;
		this.points = 0;
	}
	Joueur(){
		
	}
	
	public List<Carte> getCartes() {
		return cartes;
	}
	public String getName() {
		return name;
	}
	public int getPoints() {
		return points;
	}
	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String toString() {
		return this.name;
	}
	
	
}
