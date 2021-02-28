	
	import java.util.Scanner;

	class zad5{
    public static void main(String [] a){

    Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wyraz: ");
        String wyraz = sc.nextLine();
        int i = 0;
        int dlugosc = wyraz.length();
        for(;i<dlugosc;){

            System.out.println(wyraz.charAt(i));
            i++;
        }


    }
}