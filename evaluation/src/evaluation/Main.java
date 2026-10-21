package evaluation;

import tp.Employe;
import tp.Projet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivreurMoto l1 = new LivreurMoto("a","Hamid","10");
		LivreurMoto l2 = new LivreurMoto("b","Said","15");
		LivreurCamion l3 = new LivreurCamion("c","hmed","30");
		LivreurCamion l4 = new LivreurCamion("d","yde","35");
		

		Livreur[] livreurs = {l1, l2, l3, l4};
		
	}
	 System.out.println("LISTE DES LiVREURS ");

     for (int i = 0; i < livreurs.length; i++) {
         livreurs[i].afficherDetails();

         if (livreurs[i].getNom() != null) {
             System.out.println("non ");
                     + livreurs[i].getIdentifiant().getNom());
         } else {
             System.out.println(" no one");
         }
     }
     l2.setLivreur(l1);
     l4.setLivreur(l1);
     l4.setLivreur(l1);
}
Commande c1 = new Commande("c1", "a");
Commande c2 = new Commande("c2", "b");

Livreur[] livreurss = {
        new Livreur(l1, c1, 3),
        new Livreur(l2, c1, 2),
        new Livreur(l3, c2, 4),
        new Livreur(l4, c2, 2)
    };

}

