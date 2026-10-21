package evaluation;

class LivreurCamion extends Livreur{
	Double tauxMajoration;
	
@Override
  public Double calculerFrais(double distance) {
	return tarifkm*distance*(1+tauxMajoration);
}
	

}
