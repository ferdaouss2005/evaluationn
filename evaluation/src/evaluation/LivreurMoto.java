package evaluation;

  class LivreurMoto extends Livreur{
	  int anciennete;
	  @Override
	  public Double calculerFrais(double distance){
		  if (anciennete < 3) {
			  return tarifkm*distance;
		  }
		  else {
			  return (tarifkm+2)*distance;
			  
		  }
		  
	  }

}
