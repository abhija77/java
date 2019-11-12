
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Bataille {

	public static void main(String[] args) {
		Joueur j1 = new Joueur("Joueur 1");
		Joueur j2 = new Joueur("Joueur 2");
		
		List<Carte> paquet = new ArrayList<>();
		
		for(Couleur couleur : Couleur.values()) {
			for(short i = 0; i < 13; i++) {
				paquet.add(new Carte(couleur, i));
			}
		}
		System.out.println(paquet.size());
		
		System.out.println("Le jeu est composé de 52 cartes");
		System.out.println("*****************************************************************************");
		System.out.println("Le premier qui aura l'intégralité du paquet en sa pocession aura gagné !");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("******************************************************************************");
		Collections.shuffle(paquet);
		
		System.out.println("Distribution des cartes");
		List<Carte> paquetJoueur1 = paquet.subList(0, 26).stream().collect(Collectors.toList());
		List<Carte> paquetJoueur2 = paquet.subList(26, paquet.size()).stream().collect(Collectors.toList());
		
		Collections.shuffle(paquetJoueur1);
		Collections.shuffle(paquetJoueur2);
		
		j1.setCartes(paquetJoueur1);
		j2.setCartes(paquetJoueur2);
			
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("JEUX DE LA BATAILLE");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		
		while(j1.getCartes().size() > 0 && j2.getCartes().size() > 0) {
			System.out.println("nombre de cartes de  " + j1 + " : " + j1.getCartes().size());
			System.out.println("nombre de cartes de  " + j2 + " : " + j2.getCartes().size());
			
			List<Carte> cartesBataille = new ArrayList<>();
			Carte carteJ1 = j1.tirerCarte();
			Carte carteJ2 = j2.tirerCarte();
			Joueur joueurBatailleGagnant = new Joueur();
			
			boolean isNotEquivalent = false;
			
			while(!isNotEquivalent && j1.getCartes().size() > 0 && j2.getCartes().size() > 0) {
				if(carteJ1.isGreatThan(carteJ2)) {
					joueurBatailleGagnant = j1;
					j1.ajouterCarte(carteJ2);
					System.out.println("La carte de joueur 1 est plus importante il remporte la carte de joueur 2");
					j2.retirerCarte(carteJ2);
					j1.retirerCarte(carteJ1);
					j1.ajouterCarte(carteJ1);
					isNotEquivalent = true;
				} 
				else if(carteJ2.isGreatThan(carteJ1)) {
					joueurBatailleGagnant = j2;
					j2.ajouterCarte(carteJ1);
					System.out.println("La carte de joueur 2 est plus importante il remporte la carte de joueur 1");
					j1.retirerCarte(carteJ1);
					j2.retirerCarte(carteJ2);
					j2.ajouterCarte(carteJ2);
					isNotEquivalent = true;
				}
				else{
					isNotEquivalent = false;
					cartesBataille.add(carteJ1);
					cartesBataille.add(carteJ2);
					j1.retirerCarte(carteJ1);
					j2.retirerCarte(carteJ2);
					carteJ1 = j1.tirerCarte();
					carteJ2 = j2.tirerCarte();
					System.out.println("Les deux cartes sont équivalentes");
				}				
			}
			if(!cartesBataille.isEmpty() && joueurBatailleGagnant != null) {
				for(Carte carte : cartesBataille) {
					joueurBatailleGagnant.ajouterCarte(carte);
				}		
				
			}
			
		}
		
		System.out.println("Fin Du jeu");
		Joueur joueurVainqueur = j1.getCartes().isEmpty() ? j2 : j1;
		System.out.println("LE VAINQUEUR EST " + joueurVainqueur);
		
			
	}
	   
}
