import java.util.Scanner;

public class javaMoocPractice {
    public static void main(String[] args){
//        testChapOne();

        System.out.println( absoluteValue(5));
    }

    public static void testChapOne(){
       String userName = "";
        String outputMe = "Did this output?";
        System.out.println(outputMe);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        userName = scanner.nextLine();
        System.out.println("Your name is: "+ userName);

        scanner.nextLine();

        System.out.println(userName);


    }

    public static int absoluteValue(int input){

        if(input<0){
           return Math.abs(input);
        }
        return input;

    }
}
