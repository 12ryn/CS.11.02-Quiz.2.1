import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first integer:");
        int numOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your second integer:");
        int numTwo = scanner.nextInt();
        System.out.println("The sum of these two numbers is: " + add(numOne, numTwo));
        scanner.nextLine();

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(greeting(name));

        System.out.println("Enter your first integer:");
        numOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your second integer:");
        numTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your third integer:");
        int numThree = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your fourth integer:");
        int numFour = scanner.nextInt();
        System.out.println("The sum of these four numbers is: " + add(numOne, numTwo, numThree, numFour));
        scanner.nextLine();

        System.out.println("I will repeat what you say to you, please write something: ");
        String printing = scanner.nextLine();
        printMe(printing);
    }

    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }
    
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int resultOne = add(numOne, numTwo);
        int resultTwo = add(resultOne,numThree);
        int resultThree = add(resultTwo, numFour);
        return resultThree;
    }

    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }
}

/* I have neither given nor received any unauthorized aid on this piece of work */