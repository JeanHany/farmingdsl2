package fr.esir.lsi.aspect;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ParserCSV {
	
	public static ArrayList<Donneejour> parse() throws IOException{
		ArrayList<Donneejour> djarray = new ArrayList<Donneejour>();
		File csvData = new File("/home/jean/Documents/git/farmingmodeling/materials/farmManagement_2_INRA_STATION_31035002.csv");
		CSVParser parser = CSVParser.parse(csvData, Charset.defaultCharset() , CSVFormat.DEFAULT.withHeader());
		for (CSVRecord csvRecord : parser) {
			  Donneejour dj= new Donneejour(Integer.parseInt(csvRecord.get("JOUR")), Integer.parseInt(csvRecord.get("MOIS")), Double.parseDouble(csvRecord.get("RR"))
					  , Double.parseDouble(csvRecord.get("TM")), Double.parseDouble(csvRecord.get("PAR")));
			  djarray.add(dj);
			  
			}
		return djarray;		
	}
	
	public static class Donneejour{
		int jour;
		int mois;
		double precipitation;
		double temp;
		double rayonnement;
		
		
		
		public Donneejour(int jour, int mois, double precipitation, double temp,
				double rayonnement) {
			super();
			this.jour = jour;
			this.mois = mois;
			this.precipitation = precipitation;
			this.temp = temp;
			this.rayonnement = rayonnement;
		}
		public int getJour() {
			return jour;
		}
		public void setJour(int jour) {
			this.jour = jour;
		}
		public int getMois() {
			return mois;
		}
		public void setMois(int mois) {
			this.mois = mois;
		}
		public double getPrecipitation() {
			return precipitation;
		}
		public void setPrecipitation(double precipitation) {
			this.precipitation = precipitation;
		}
		public double getTemp() {
			return temp;
		}
		public void setTemp(double temp) {
			this.temp = temp;
		}
		public double getRayonnement() {
			return rayonnement;
		}
		public void setRayonnement(double rayonnement) {
			this.rayonnement = rayonnement;
		}		
		
	}
}


