package EpamLessons.AutomaticDoor;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        new Solution().openDoor();
    }
    static Scanner scanner = new Scanner(System.in);


    //int person = 0;
    private void closeDoor () {
        if (scanner.nextInt() == 0)
            System.out.println("Door is close. ");
    }

    private void openDoor() {
        if (scanner.nextInt() == 1) {
            System.out.println("Door is open");

        }
    }
}


