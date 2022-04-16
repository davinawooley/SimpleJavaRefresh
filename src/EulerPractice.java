public class EulerPractice {
    public static void main(String[] args) {
        System.out.println(problem1(1000));
    }
//problem1
    public static int problem1(int input){
        int sum = 0;
        for(int i = 0; i<input; i++){
            if(i%5 ==0 ||i%3 ==0){
                sum+=i;
            }
        }
        return sum;
    }




}
