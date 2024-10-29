import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] allFriends = new String[10];
        int friendnum = 0;

        System.out.println("[Top 10 Friend's List]");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1) Enter a friend's name");
            System.out.println("2) Replace a friend's name");
            System.out.println("3) Display your friends list");
            System.out.println("4) Quit");
            System.out.print("Your choice: ");
            int choice = input.nextInt();


            switch (choice) {
                case 1:
                    if (friendnum < 10) {
                        System.out.print("Enter a name: ");
                        String newFriend = input.nextLine();
                        boolean hasname = false;
                        for (String friend : allFriends) {
                            if (friend != null && friend.equals(newFriend)) {
                                hasname = true;
                                break;
                            }
                        }
                        if (!hasname) {
                            allFriends[friendnum] = newFriend;
                            friendnum++;
                            System.out.println(newFriend + " has been added to your friends list!");
                        } else {
                            System.out.println("Sorry, they're already on the list!");
                        }
                    } else {
                        System.out.println("Sorry, your friends list is full!");
                    }
                    break;
                case 2:
                    System.out.print("Enter a name: ");
                    String newName = input.nextLine();
                    System.out.print("Enter an index: ");
                    int replace = input.nextInt();
                    input.nextLine();

                    if (replace >= 1 && replace <= 10) {
                        if (allFriends[replace - 1] != null) {
                            System.out.println(allFriends[replace - 1] + " has been replaced with " +newName+ " on your friends list!");
                            allFriends[replace - 1] = newName;
                        } else {
                            System.out.println("Sorry, there is no friend to replace at index " +replace);
                        }
                    } else {
                        System.out.println("Sorry, that's an invalid command!");
                    }
                    break;
                case 3:
                    System.out.println("Friend's List:");
                    for (int i = 0; i < 10; i++) {
                        System.out.println((i + 1) + ") " +(allFriends[i] != null ? allFriends[i] : ""));
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }
    }
}
