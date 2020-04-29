package ledTesting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int no_of_led=scanner.nextInt();
        Led led[]=new Led[no_of_led];
        for (int i = 0; i <no_of_led;i++) {
            String colour = scanner.next();
            String working = scanner.next();
            led[i] = new Led(colour, working);
        }
        LedStrip ledStrip=new LedStrip(led);
        ledStrip.stripStatus();



    }
}
