
class DaneOsobowe{
	private String imie = "";
	private String nazwisko = "";
	private int wiek = 0;
	private int wzrost = 0;
	private int waga = 0;
	
	public DaneOsobowe(String imie, String nazwisko, int wiek, int wzrost, int waga){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.wzrost = wzrost;
		this.waga = waga;
	}
	
	
	  @Override
    public String toString(){
        return "DaneOsobowe:" +"\n"+
                "name='" + name + '\''+"\n"+
                "lastname='" + lastname + '\'' +"\n"+
                "age=" + age +"\n"+
                "height=" + height +"\n"+
                "weight=" + weight;
    }
}

