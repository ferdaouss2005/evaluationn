package evaluation;

public class Livraison {
	
	Livraison(Livreur livreur, Commande commande, double distance)
	{
		this.livreur=livreur;
		this.commande=commande;
		this.distance=distance;
	}
	public Double calculerMontant() {
		return Livreur.calculerFrais(double distance);
	}
	void afficherRecapitulatif() {
		System.out.println( "le nom est :"+ Livreur.getNom);
		System.out.println("identifiant est:"+ Livreur.getIdentifiant);
	
	}
	
	}

