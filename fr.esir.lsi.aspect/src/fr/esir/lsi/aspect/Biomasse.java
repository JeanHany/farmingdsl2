package fr.esir.lsi.aspect;

public class Biomasse {

	private double Eb =1.85;
	private double Eimax = 0.94;
	private double K = 0.5;
	private double Lmaxmais = 5;
	private double Lmaxble = 6.5;
	private double Lmaxsorgho = 4.5;
	private double TI = 900;
	private double A = 0.0065;
	private double B = 0.00205; 
	private double aacien = 0;
	private double uancien = 0;
	
	// U(t) = 0, LAI(t) = 0 et ST(t) = 0 jusqu au semis
	//TODO more than 1 lai for sorgho and ble
	
	public double biomasse(double rayonMoyen, double tempMoyen){
		double newb = uancien + Eb*Eimax*(1-Math.exp(-K*lai(tempMoyen)))*rayonMoyen;
		uancien = newb;
		return newb;
	}
	
	//For first passage
	public double biomasse(double rayonMoyen, double tempMoyen, int first){
		double newb = uancien + Eb*Eimax*rayonMoyen;
		uancien = newb;
		return newb;
	}
	
	public double lai(double tempMoyen){
		double lai = Lmaxmais*(1/(1+Math.exp(-A*( st(aacien, tempMoyen) - TI )) - Math.exp(B*( st(aacien, tempMoyen) - tr()) )));
		return lai;
	}
	
	public double st(double ancien, double tempMoyen){
		double aacien = ancien + tempMoyen;
		return aacien;
	}
	
	public double tr(){
		return (1/B)*Math.log(1 + Math.exp(A*TI));
	}

}
