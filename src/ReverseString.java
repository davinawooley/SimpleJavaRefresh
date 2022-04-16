public class ReverseString {
    public static String reverseString(String input){
        char[] arrayOfChars =input.toCharArray();
        String output = "";
for(int i = arrayOfChars.length-1; i>=0; i--){
    output +=arrayOfChars[i];
}
        return output;
    }

    public static void main(String[] args) {
        String input = "Reverse Me !tcerroc";
        System.out.println(reverseString(input));
    }
}
