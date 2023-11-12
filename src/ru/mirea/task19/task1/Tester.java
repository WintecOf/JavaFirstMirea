package ru.mirea.task19.task1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        DataBase database = new DataBase(
                new User("1234567890", "Tom Percs"),
                new User("9876543210", "Perc Toms")
        );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter users name: ");
        String username = sc.nextLine();
        System.out.println("Enter users INN: ");
        String INN = sc.nextLine();

        try {
            boolean check_result = database.checkUserINN(username, INN);
            if (check_result) {
                System.out.println("INN check passed.");
            }
        } catch (VerifyError err) {
            throw new WrongINNException("Invalid INN: " + INN + " for user: " + username, err);
        } catch (NoSuchElementException err) {
            throw new UserNotFoundException("No such user in database: " + username, err);
        }

    }
}
