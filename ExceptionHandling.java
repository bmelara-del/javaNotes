
public class ExceptionHandling {
    public static void main(String[] args) {
        // Exception handling - a way to handle errors in a program without crashing it
        // ex of simple code that can throw an exception

        // int myInt = Integer.parseInt("pants"); // this will throw a NumberFormatException because "pants" cannot be converted to an integer
        // System.out.println(myInt);
        // instead of just blowing up and crashing the program, we can use a try-catch block to handle the exception

        // ex: 
        try {
          // code that causes an exception  
            getInt();
            System.out.println("After Parsing Pants"); // this line will not execute because the exception is thrown before it, but if there was no exception, this line would execute
            return; // this will exit the method, so the code after this line will not execute, but if there was an exception, this line would not execute and the code in the catch block would execute instead
        } catch (NumberFormatException | NullPointerException e) { // or insntead to add another catch block to catch a different type of exception, you can do that too with the | operator, which is called a multi-catch block. This will catch either a NumberFormatException or a NullPointerException and execute the same code for both exceptions.
            // code that we want to execute if the exception is thrown
            System.out.println("Hey dude you can't make an int out of that string, try again");
        } finally { // contains code you want to execute wheter there was an exception or not
            System.out.println("This will always execute, even if there was an exception or not");
        }
        
        // catch (NullPointerException e){ // if you wanted to add another catch block to catch a different type of exception, you can do that too
        //     System.out.println();
        // }
        System.out.println("End here");

        // exception hierarchy - all exceptions are subclasses of the Exception class
        // will catch only exceptions that are of the type specified in the catch block or its subclasses
        // ex: you might just see "catch (Exception e)" which will catch any exception that is a subclass of Exception, which is basically all exceptions except for errors and runtime exceptions

        // Class NumberFormatException 
        // Object -> Throwable -> Exception -> RuntimeException -> IllegalArgumentException -> NumberFormatException

        // There are two types of throwable objects in Java: Exceptions and Errors.
        // You might not want to catch Errors because they are usually unrecoverable and indicate a serious problem with the program, such as OutOfMemoryError or StackOverflowError. 
        // Exceptions, on the other hand, are usually recoverable and indicate a problem that can be handled, such as NumberFormatException or NullPointerException.

        // When a method gets thrown an excpetion, it'll look for a catch block that can handle that exception. If it doesn't find one in the current method, it will look up the call stack to see if any of the calling methods have a catch block that can handle the exception. If it reaches the top of the call stack without finding a catch block that can handle the exception, the program will crash and print a stack trace.
        // might look for a catch block that can handle the exception in the current method, then in the method that called it, then in the method that called that one, and so on until it finds a catch block that can handle the exception or reaches the top of the call stack.
        // call stack - the sequence of method calls that led to the point where the exception was thrown. When an exception is thrown, the program will look for a catch block that can handle that exception in the current method. If it doesn't find one, it will look up the call stack to see if any of the calling methods have a catch block that can handle the exception. If it reaches the top of the call stack without finding a catch block that can handle the exception, the program will crash and print a stack trace.

        System.out.println(printNumber());

    }

    // ex of call stack
    public static void getInt(){
        int myInt = Integer.parseInt("pants"); // this will throw a NumberFormatException because "pants" cannot be converted to an integer
    }

    // ex of private method
    private static int printNumber(){
        try { // code that causes an exception
            return 3;
        } 
        catch (Exception e) { // code that we want to execute if the exception is thrown
            return 4;
        }
        finally { // code that you want to execute wheter there was an exception or not
            return 5; // this will override the return statements in the try and catch blocks, so this method will always return 5, even if there was an exception or not
        }
    }
}
