
public class Main {

	public static void main(String[] args) {
        
		Egitmen egitmen1= new Egitmen();
		egitmen1.setFirstName("Engin");
		egitmen1.setLastName("Demiroð");
		egitmen1.setEmail();
		egitmen1.setId(1234);
		
		EgitmenManager manager=new EgitmenManager();
		manager.create(egitmen1);
		manager.update(egitmen1);
		
		
		Ogrenci ogrenci1=new Ogrenci() ;
		ogrenci1.setFirstName("Esma");
		ogrenci1.setLastName("Ýyigünler");
		ogrenci1.setEmail();
		ogrenci1.setId(4567);
		
		OgrenciManager manager1= new OgrenciManager();
		manager1.complete(ogrenci1);
		
			
		
	
	}

}
