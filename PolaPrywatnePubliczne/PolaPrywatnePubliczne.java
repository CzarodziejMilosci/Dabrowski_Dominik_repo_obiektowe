
class PolaPrywatnePubliczne{
	//Definiowanie zmiennych/obiektow globalnie
	static DaneOsobowe dos;
	
	public static void main(String [] args){
		//Stworzenie obiektu
		dos = new DaneOsobowe(); //Od tego momentu moge uzywac nazwy: dos
		System.out.println(dos.wzrost);
	}
}