package tr.edu.medipol.yazilimaraclari.barancivak;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		System.out.println(ucretHesapla(30, 25));
		
	
	}
	private static class Hesaplama {
		int calisilanSaatSayi;
		int saatlikUcretSayi;
		int toplamSonuc;
		
		public Hesaplama(int calisilanSaatSayi, int saatlikUcretSayi) {
			
			this.calisilanSaatSayi= calisilanSaatSayi;
			this.saatlikUcretSayi=saatlikUcretSayi;
			this.toplamSonuc=calisilanSaatSayi*saatlikUcretSayi;
			
		}
	}
		
		
	
	public static String ucretHesapla(int calisilanSaatSayi, int saatlikUcretSayi) {
		return "" + calisilanSaatSayi + " * " + saatlikUcretSayi + " = " + calisilanSaatSayi*saatlikUcretSayi + "";
	}
	
	
		
}



