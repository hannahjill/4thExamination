package pkg4thexaminationlabajo;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        subclass kefifries = new subclass();
        Scanner scn = new Scanner(System.in);
        
        while (true) {

        System.out.println("1. Add User");
        System.out.println("2. Add Friends");
        System.out.println("3. Display");
        System.out.println("4. People You May Know: ");
        System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scn.nextInt();
            scn.nextLine();
 
            switch (choice) {
                case 1:
                    System.out.print("User Name: ");
                    String user = scn.nextLine();
                    kefifries.addUser(user);
                    System.out.println("User " + user + " added.");
                    break;
 
                case 2:
                    System.out.print("First User: ");
                    String User1 = scn.nextLine();
                    System.out.print("Second User: ");
                    String User2 = scn.nextLine();
                    kefifries.addFriends(User1, User2);
                    System.out.println("You're friends now " + User1 + " and " + User2 + ".");
                    break;
 
                case 3:
                    System.out.println("Display:");
                    kefifries.displayFriends();
                    break;
 
                case 4:
                    System.out.print("Name of the user to get recommendations: ");
                    String targetUser = scn.nextLine();
                    Set<String> recommendedFriends = kefifries.getRecommendedFriends(targetUser);
                    if (recommendedFriends.isEmpty()) {
                        System.out.println("No recommended friends for " + targetUser + ".");
                    } else {
                        System.out.println("Recommended friends for " + targetUser + ": " + recommendedFriends);
                    }
                    break;
 
                case 5:
                    System.out.println("Arigato");
                    scn.close();
                    return;
 
                default:
                    System.out.println("Try again tomorrow.");
            }
        }
    }
    }
    

