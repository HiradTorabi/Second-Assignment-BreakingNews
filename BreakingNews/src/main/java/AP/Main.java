package AP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Infrastructure infrastructure = new Infrastructure("a2372b61298f45a3a115a6fd2e02df8d");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running)
        {
            System.out.println("1 - Show news");
            System.out.println("2 - Exit");
            System.out.print("Choose an option: ");

            int choice;
            try
            {
                choice = scanner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice)
            {
                case 1:
                    infrastructure.displayNewsList();
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Please select number 1 or 2.");
            }
        }

        scanner.close();
    }
}
