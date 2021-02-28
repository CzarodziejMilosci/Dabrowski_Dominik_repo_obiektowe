	import java.util.Scanner;

	class zad2{
    public static void main(String [] a){

    Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imie");
        String imie = sc.nextLine();

        System.out.println("Podaj nazwisko");
        String nazwisko = sc.nextLine();

        System.out.println("Imie: "+imie.length());
        System.out.println("Naziwsko: "+nazwisko.length());
    }
}