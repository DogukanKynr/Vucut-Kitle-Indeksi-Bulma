import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double boyKare = boy*boy;
        double endeks = kilo / boyKare;

        System.out.print("Vücut kitle endeksiniz : " + endeks);

    }
}