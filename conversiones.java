Public class conversiones{
	
	public double dollarTopesos(double pesos){
		double dollars = pesos * 18.90;
		return dollars;
	}
	
	public double dollarTopesos(double pesos, double vc){
		double dollars = pesos * vc;
		return dollars;
	}
	
	public double dollarTopesos(double pesos, double vc, boolean isCompra){
		double dollars = pesos * vc;
		if(isCompra){
			dollars = dollars * .90;
		}else{
			dollars = dollars * 1.10;
		}
		return dollars;
	}
}