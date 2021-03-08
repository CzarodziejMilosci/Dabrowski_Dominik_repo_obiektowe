
class Rekurencja {
	public static void main(String [] args){
		//rekurencja(5);
		//System.out.println(zwracamJedynke());
		System.out.println(zwracamDrugaPotegeWprowadzLiczby(5));
		System.out.println(SumaDwochNajwiekszychLiczb(5,6,3));
		System.out.println(SumaDwochNajwiekszychLiczb(7,6,9));
		
	}
	private static int SumaDwochNajwiekszychLiczb(int a,int b,int c){
		int suma = 0;
		if(a>b, b>c){
			suma = a+b;
		} else if(a>b, c>b){
			suma = a+c;
		}	else if(b>a, c>a){
			suma = b+c;
		}
		return suma;
	}
	
	private static int zwracamDrugaPotegeWprowadzLiczby(int liczba);{
		return liczba*liczba;
	}
	
	//private static int zwracamJedynke(){
		
		//return 1;
	//}
	private static String zwracamTekst(){
		return "Zwracam Stringa";
		
		
	}
	private static int rekurencja(int i){
		if(i>0){
			System.out.println("rekurencja"+i);
			i--;
		} else {
			return 0;
		}
		rekurencja(i);
		return -1;
	//stem.out.println("rekurencja");
	//rekurencja(i);
	}
}