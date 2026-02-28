import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class sw11task6 {

    public static void main(String[] args) {

        // BUILT-IN WORD LIST
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("computer");
        words.add("java");
        words.add("programming");
        words.add("school");
        words.add("hangman");
        words.add("science");
        words.add("education");
        words.add("planet");

        // RANDOM WORD
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        // INITIAL WORD STATE
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("Welcome to Java Hangman!");
        System.out.println("***********************");

        // GAME LOOP
        while (wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));

            // Show current word state
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            // INPUT
            System.out.print("Guess a letter: ");
            String input = scanner.next().toLowerCase();
            if (input.isEmpty() || input.length() > 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }
            char guess = input.charAt(0);

            // CHECK GUESS
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }

            } else {
                wrongGuesses++;
                System.out.println("Wrong guess!");

                if (wrongGuesses >= 6) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("GAME OVER!");
                    System.out.println("The word was: " + word);
                }
            }
        }

        scanner.close();
    }

    // HANGMAN ART
    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                    
                    
                """;
            case 1 -> """
                  O
                  
                  
                  
                  
                """;
            case 2 -> """
                  O
                  |
                  
                  
                  
                """;
            case 3 -> """
                  O
                 /|
                  
                  
                  
                """;
            case 4 -> """
                  O
                 /|\\
                  
                  
                  
                """;
            case 5 -> """
                  O
                 /|\\
                 /
                  
                  
                """;
            case 6 -> """
                  O
                 /|\\
                 / \\
                  
                  
                """;
            default -> "";
        };
    }
}