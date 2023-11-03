import java.util.Scanner;
public class MontyHallRunner {
    public static void main(String[] args) {
        int prob=(int)(Math.random()*2+1);
        int goat1=prob;
        if (goat1==1) {
            if ((int)(Math.random()*1+1)==1) {
                int goat2=2;
            }
        }
        int goat2;
        int car;
        System.out.println("Welcome to the Monty Hall Game!");
        System.out.println();
        System.out.println("2 goats and a car are hidden in 3 doors. Guess in which of the 3 doors the car is.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a door, any door (1 ,2, 3): ");
        int userDoor = scan.nextInt();
        MontyHall game = new MontyHall(goat1, goat2, car, userDoor);

    }
}
