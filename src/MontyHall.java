public class MontyHall {
    private int goat1;
    private int goat2;
    private int car;
    private int userDoor;

    public MontyHall(int goat1, int goat2, int car, int userDoor) {
        this.goat1 = goat1;
        this.goat2 = goat2;
        this.car = car;
        this.userDoor = userDoor;
    }
    public void Check() {
        if (userDoor==car) {

        }
    }

    public void reveal(int door) {
        if (door==userDoor) {
            System.out.println("You guessed it! The car is yours!");
        }
        else if (door==goat1 || door==goat2) {
            System.out.println("Behind this door is a goat!");
        }
    }

    public void Pick() {
        int chance=(int)(Math.random()*2+1);
        if (goat1 != userDoor && goat2 != userDoor) {
            if (chance==1) {
                reveal(goat1);
            } else {
                reveal(goat2);
            }
        }
    }
}
