package EsRubrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Rubric myRubric = new Rubric();
        Scanner inputScanner = new Scanner(System.in);
        int choice = 0;
        while (flag) {
            System.out.println(
                    "Select your option: \n\r 0 - To Exit. \n\r 1 - To add a Contact. \n\r 2 - To remove a Contact. \n\r 3 - To see all the contacts \n\r 4 - To search a Contact. ");
            choice = inputScanner.nextInt();
            switch (choice) {
                case 0:
                    inputScanner.close();
                    flag = false;
                    System.out.println("Closing...");
                    break;
                case 1:
                    myRubric.addContact(inputValues(inputScanner));
                    System.out.println(myRubric);
                    break;
                case 2:
                    System.out.println(myRubric);
                    System.out.println("Type the index of the ppl to remove:");
                    int index = inputScanner.nextInt();
                    myRubric.removeContact(index);
                    System.out.println(myRubric);
                    break;
                    case 3: 
                    System.out.println(myRubric);
                    break;
                    case 4:
                    System.out.println("Type the name of the ppl to search:");
                    String name = inputScanner.next();
                    myRubric.searchContact(name);
                    break;
                default:
                    break;
            }
        }
    }

    public static Person inputValues(Scanner input) {
        System.out.println("Insert the name: ");
        String name = input.next();
        System.out.println("Insert the surname: ");
        String surname = input.next();
        System.out.println("Insert the telephone number: ");
        String telNumber = input.next();
        Person contact = new Person(name, surname, telNumber);
        return contact;
    }
}