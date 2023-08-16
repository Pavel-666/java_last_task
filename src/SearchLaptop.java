import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class SearchLaptop {
    static Set<Laptops> laptops = new HashSet<>();
    static public void createSet() {
        laptops.add(new Laptops("", 45, "", "", 4563, "", 4.0));
        laptops.add(new Laptops("", 45, "", "", 4563, "", 4.0));
        laptops.add(new Laptops("", 45, "", "", 4563, "", 4.0));
        laptops.add(new Laptops("", 45, "", "", 4563, "", 4.0));
        laptops.add(new Laptops("", 45, "", "", 4563, "", 4.0));
    }

    static public void searchLaptop(){
        System.out.println("если параметр вам не важен, вводите 0");
        Scanner in = new Scanner(System.in);
        System.out.println("производитель : ");
        String manufacturer = in.next();
        System.out.println(" процессор  ");
        String processor = in.next();
        System.out.println(" обьем оперативной памяти более  ");
        int ram = in.nextInt();
        System.out.println(" обьем постоянной памяти более  ");
        int hdd = in.nextInt();
        System.out.println(" операционная система  ");
        String operatingSystem = in.next();
        System.out.println(" видеокарта  ");
        String nameVideoCart = in.next();
        System.out.println(" диагональ экрана более  ");
        Double screenDiagonal = in.nextDouble();
         for (Laptops laptop : laptops){
             System.out.println(laptop.getRam());
        }
    }
}
