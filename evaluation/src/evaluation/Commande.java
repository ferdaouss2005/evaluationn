package evaluation;

public class Commande {
	private String numero,destination;
	
	Commande(String numero, String destination){
		this.numero=numero;
		this.destination=destination;
	}

	public String toString(){
		return "numero:" + numero "destination:" + destination ;
	}
}
