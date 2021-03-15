	
	class PierwszyObiekt {
		public static void main (String [] args){
			//Zdefiniowanie i stworzenie obiektu
			ObiektPudelko op = new ObiektPudelko();
			Osoba op = new Osoba();
			System.out.println(op.Imie);
			System.out.println(op.Nazwisko);
			System.out.println("Domysla wartosc: " +op.wysokosc);
			
			op.wysokosc = 100;
			System.out.println("Po zmodyfikowaniu: " +op.wysokosc);
		}
	}
	
	
	//nasz obiekt
	class ObiektPudelko{
		//public - dostep wszedzie
		//private - dostep w obrebie danej klasy
		public int wysokosc = 10;
		public int szerokosc = 20;
		public int glebokosc = 30;
		//private String Sekret - "Sekret"
	}
	
	class Osoba{
		public int Imie = Dominik;
		public int nazwisko = Dabrowski;	
	}