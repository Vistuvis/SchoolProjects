public class Craps {


    public static int diceRoll(){

        int x = (int)(Math.random() *6) + 1;
		int y = (int)(Math.random() *6) + 1;


        return x + y;
    }

    public static void game(int point){
        int guess = diceRoll();
        System.out.println("You rolled a " + guess);


        if (guess == 7) {
            System.out.print("Craps. You lose");
        }
        else if (guess == point) {
            System.out.println("You Win!");
        }
        else{
            game(point);
        }
    }


    public static void main(String[] args){

        final int point = diceRoll();
 


        System.out.print("You rolled a " + point);
        switch (point) {
            case 2, 3, 12:System.out.print(".  Craps.  You lose"); break;
            case 7, 11: System.out.print(".  You win"); break;
            default: System.out.println(". Point is " + point); game(point);
        }
    }



}