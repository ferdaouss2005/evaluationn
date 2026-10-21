package evaluation;

import tp.Mission;

abstract class Livreur {
	protected String identifiant,nom;
	protected Double tarifkm;
	
	Livreur(String identifiant, String nom, double tarifKm){
		this.identifiant=identifiant;
		this.nom=nom;
		this.tarifkm=tarifkm;
		
	}
	
	String getNom() {
		return nom;
	}
	String getIdentifiant() {
		return identifiant;
		
	}
	public abstract Double calculerFrais(double distance) ;
		
	public void afficherDetails() {
		System.out.println("nom est"+nom);
		System.out.println("identifiant est"+identifiant);
		System.out.println("tarifkm est "+ tarifkm);
		
	}
	 

}
