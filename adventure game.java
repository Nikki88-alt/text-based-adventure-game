import java.util.Scanner;

public class ForestAdventure {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println("Welcome to the Forest Adventure Game!");
        System.out.println("You find yourself at the edge of a dark forest.");
        choosePath();
    }

    private static void choosePath() {
        System.out.println("Do you want to go left, right, or straight?");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "left":
                leftPath();
                break;
            case "right":
                rightPath();
                break;
            case "straight":
                straightPath();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                choosePath();
        }
    }

    private static void leftPath() {
        System.out.println("You see a wounded deer. Do you want to help it, ignore it, or try to catch it?");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "help":
                System.out.println("You helped the deer! It guides you safely out of the forest.");
                break;
            case "ignore":
                System.out.println("You ignored the deer and got lost in the forest.");
                break;
            case "catch":
                System.out.println("The deer runs away and you end up trapped by wolves!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                leftPath();
        }
    }

    private static void rightPath() {
        System.out.println("You find a treasure chest! Do you want to open it, leave it, or take it?");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "open":
                System.out.println("You found gold and gems! You're rich!");
                break;
            case "leave":
                System.out.println("You left the treasure behind and walked away safely.");
                break;
            case "take":
                System.out.println("As you take the chest, it triggers a trap! You narrowly escape.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                rightPath();
        }
    }

    private static void straightPath() {
        System.out.println("You encounter a dark cave. Do you want to enter, walk past, or set up camp?");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "enter":
                System.out.println("Inside the cave, you find ancient artifacts. You've discovered history!");
                break;
            case "walk past":
                System.out.println("You walked past the cave and found your way home.");
                break;
            case "camp":
                System.out.println("While camping, you are visited by friendly forest spirits!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                straightPath();
        }
    }
}
