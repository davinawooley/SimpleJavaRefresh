import java.util.*;

public class Hangman {
    int lettersCorrect = 0;
    int guessesLeft = 10;

    ArrayList<String> wordBank = new ArrayList<>(Arrays.asList("nacho", "potato", "cookie", "apple", "pizza", "fries", "sushi", "Cool Ranch Doritos"));

    ArrayList<Character> progressArray = new ArrayList<>();
    ArrayList<Character> progressOutputArray = new ArrayList<>();

    int randomIndex = ((int)(Math.random() * wordBank.size()) + 0);

    char[] selectedWord = wordBank.get(randomIndex).toLowerCase().toCharArray() ;


    public void makeGuess(char input){
        System.out.println("Guess a letter...");

        for (int i = 0; i < progressArray.size(); i++) {
            if (progressArray.get(i).equals(input)) {
               lettersCorrect += 1;
               progressOutputArray.set(i, progressArray.get(i));
            }
        }

        this.guessesLeft-=1;
        System.out.println("letters incorrect " + lettersCorrect );
        System.out.println("Guesses Left: "+ guessesLeft);
        System.out.println(progressOutputArray.toString());
    }

    public void playHangman() {
        Scanner scanner = new Scanner(System.in);
        int wordLength = selectedWord.length;

        System.out.println("Let's play Hangman!");
        System.out.println("The word has " + wordLength + " letters in it");
        System.out.println("Make your first guess...");

        for(int i = 0; i<wordLength; i++){
            progressArray.add(selectedWord[i]);
        }

        for(int i = 0; i<wordLength; i++){
            if(selectedWord[i] != ' '){
                progressOutputArray.add('*');
            }
            else{
                progressOutputArray.add(' ');
            }
        }

        while ( progressOutputArray.contains('*')==true ){
            String input = scanner.next();
            char toChar = input.charAt(0);
            this.makeGuess(toChar);
            if(guessesLeft<1 || progressOutputArray.contains('*')==false){

                guessesLeft = 10;
                progressOutputArray.clear();
                progressArray.clear();
            }
            if(guessesLeft==0){
                System.out.println("You are out of guesses.");
            }
        }


        System.out.println("Would you like to play again? y or n");
        String playAgain = scanner.next().toLowerCase();

       if(playAgain.equals("y") ){
          playHangman();
       }

       else{
           System.out.println("Thanks for playing!");
       }
    }
}
