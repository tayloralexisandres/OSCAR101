package JavaBasics.TasksForToday;

public class Finra {/// java class
    public static void main(String[] args) {/// main method to print java code source
        finra(30);// method called and input
    }

    public static void finra(int num) {/// custom method with one arg
        if (num >= 1 && num <= 30) {/// nested condition for numbers 1-30



            // if else used for multiple conditions
            if (num % 3 == 0 && num % 5 == 0) {//// if input number is divided by 3 and 5 is true
                System.out.println("Finra");/// prints this instead of the number input
            } else if (num % 5 == 0) {/// if input number is divided by 5 is true
                System.out.println("ra");// prints this instead of the number input

            } else if (num % 3 == 0) {// if input number is divided by 3 is true
                System.out.println("fin");/// prints this instead of number input

            } else {///////// or
                System.out.println(num);//// if nothing above is true this will print the input number

            }
        }
    }
}
