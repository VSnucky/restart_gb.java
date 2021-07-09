import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = "no";
    String z;
    do {
        int t = 3;
        System.out.println("Компьютер загадал число от 0 до 10. Угадайте его!");
        System.out.println("Введите число!");
        int a = new Random().nextInt(10);
        System.out.println(a);
        while (t > 0) {
            int c = sc.nextInt();
            if (c == a){
                System.out.println("Вы угадали! Начать заново?");
                break;
            }else if (c > a){
                System.out.println("Число меньше!");
            }
            else if (c < a){
                System.out.println("Число больше!");
            }
            t--;
            if (t == 0){
                System.out.println("Попытки закончились! Начать заново?");
                break;
            }
        }

        while (true){
            z = sc.nextLine();
            if (z.equals ("yes")){
                s = "yes";
                break;
            }
            else if (z.equals ("no")){
                s = "no";
                break;
            }
        }
    }
    while(s == "yes");
    }
}
