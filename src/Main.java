import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        SearchLaptop.createSet();
        if (userOrOwner() == 562){
            OwnerOpportunities();
        }else userOpportunities();
    }


        static int userOrOwner() {
            String originalPasvord = "pasvord";
            Scanner in = new Scanner(System.in);
            out.println(" если вы владелец сайта ввдите пароль, если нет то напишите что угодно и переходите к меню возможностей");
            String pasvord = in.next();
            if (pasvord == originalPasvord){
                return 562;
            } else return 0;
        }

        static void userOpportunities(){
            Boolean marcer = true;
                while (marcer){
                    out.println("выберите действие");
                    out.println("1 показать список доступных устройств ");
                    out.println("2 выбрать устройство по критериям ");
                    out.println("3 прейти в режим владельца ");
                    out.println("любая другая цифра, закончить работу ");
                    Scanner in = new Scanner(System.in);
                    out.println("ваш выбор  : ");
                    String operation = in.next();
                    switch (operation){
                        case "1": // allLaptops
                            out.println(SearchLaptop.laptops);
                            break;
                        case "2": // searchLaptop
                            SearchLaptop.searchLaptop();
                            break;
                        case "3": // go to Owner
                            out.println("данный функционал будет добавлен в следующем патче");
                            break;
                        default: // exit
                            out.println("добавленные данные не будут сохранены");
                            out.println("ожидайте патчей с добавлением долговременной памяти");
                            out.println("всего наилучшего");
                            marcer = false;
                            break;
                    }


                }

        }

        static void OwnerOpportunities(){
            out.println("данный функционал будет добавлен в следующем патче");
            userOpportunities();
        }

}
