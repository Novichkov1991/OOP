import Figurki.Krug;
import Figurki.Kvadrat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        double rKrug = sc.nextDouble();
        Krug krug = new Krug(rKrug);
        System.out.println(krug.getPloshad());
        System.out.println(krug.getPerimetr());


        Kvadrat kv = new Kvadrat();
        double storonaKvadrat1 = sc.nextInt();
        double storonaKvadrat2 = sc.nextInt();
        System.out.println(kv.getsKvadrat());
        System.out.println(kv.getpKvadrat());




    }
}