package JavaBasics.TasksForToday;

public class Division {// java class

    public static void main(String[] args) {/// main method for java source code
        divide(10,4);/// custom divide method called in main class and args input
    }
    public static void divide(int x, int y) {/// custom public method created with 2 args in the parameter
        int count=0;/// integer data type variable to store data
        // while loop  used to repeat a specific block of code an unknown number of times,
        // until a condition is met.
        while (x >= y) {// first loop- 10>=4 true,x is now 6>=4 true,x is now 2>=4 false
            x = x - y;// 6=10-4;, 2=6-4;doesnt run// x=2

            count++;// +1, +1, doesnt run // count =2

        }

        System.out.println("x divided by y =" +count+", and the remainder is "+x);
    }
}
