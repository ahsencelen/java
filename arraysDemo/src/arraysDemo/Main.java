package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ahsen";
		ogrenciler[1] = "Erva";
		ogrenciler[2] = "Ali";
		ogrenciler[3] = "Ayşe";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
