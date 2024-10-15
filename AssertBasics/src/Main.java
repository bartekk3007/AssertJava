import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        //System.out.println("Podaj liczbę");
        //Scanner scanner = new Scanner(System.in);
        int liczba = -3;
        assert liczba >= 0 : "Liczba jest ujemna";
        AssertionError assertionError = new AssertionError("Zwykly blad");
        throw new AssertionError("Unknown value");
    }
}