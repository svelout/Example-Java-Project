package train;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи число от: 200 до 1000");
        int city = sc.nextInt();
        char a = 64;
        char b = 64;
        int j;
        int c = 26;
        for(j = 0;j<=25;j++) {
            a++;
            b++;
            for(int x=0;x<=26;x++) {
                if (x == j) System.out.print(a);
                else if (x == c) {System.out.print(b);if (b==77) System.out.print(" ");}
                else System.out.print(" ");
            }
            c--;
            System.out.println();
            try {
                Thread.sleep(city);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print(dtf.format(now));
    }
}

