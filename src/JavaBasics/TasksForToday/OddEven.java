package JavaBasics.TasksForToday;

public class OddEven {
    public static void main(String[] args) {// main method to print java code source

        methodOddorEven(9);/// method called with  argument input


    }

    public static void methodOddorEven(int num) {//// custom class
//The if/else statement executes a block of code if a specified condition is true.
        if (!(num % 2 == 0)) {////// if the input number is divided by 2 and its NOT ZERO, is true

            System.out.println(num + " is odd");/// this will print

        } else {/// or if above condition is false

            System.out.println(num + " is even");/// this will print
        }


    }
}
