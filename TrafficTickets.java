//Wyatt Hanes
//Student Number: 300311372

import java.util.Scanner;

public class HelloWorld {


    public static int getTicket(int x, int y, int c)
    {
        int s = x-y;

        if(c == 1){

            if(s >60)
                return 483;
            else if(s>40) // 41-61
                return 368;
            else if(s>20)
                return 253;
            else if(s>=1)
                return 196;
            else if(s < -20)
                return 121;
            else
                return 0;
        }
        else{
            if(s >60)
                return 483;
            else if(s>40)
                return 368;
            else if(s>20)
                return 196;
            else if(s>=1)
                return 138;
            else if(s < -20)
                return 121;
            else
                return 0;
        }

    }

    public static void main(String[] args){

        System.out.print("How fast was the vehicle going? ");
        Scanner stdin = new Scanner(System.in);
        int speed = stdin.nextInt();
        System.out.print("What was the speed limit? ");
        int speedLimit = stdin.nextInt();
        System.out.print("Was it a school or construction zone? (1 for yes or 2 for no) ");
        int slowZone = stdin.nextInt();


        System.out.println("The fine is " + getTicket(speed,speedLimit,slowZone));
        stdin.close();




    }
}