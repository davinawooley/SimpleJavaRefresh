public class IfElse {
    public static void main(String[] args) {
        ifElseChecker(22);
    }

    public static void  ifElseChecker(int input){

        if(input%2 != 0){
            System.out.println("Weird");
        }

        else if(input>=2 && input<=5){
            System.out.println("Not Weird");
        }

        else if(input>=6 && input<=20){
            System.out.println("Weird");
        }

        else if(input>20){
            System.out.println("Not Weird");
        }


    }
}
