import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args){

        ArrayList<Integer> tenInts = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 10, 20 , 30, 100, 200, 300, 123456789));
        String snippet = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        System.out.println(sumOfEvenInts(tenInts));

        System.out.println("");

        printFiveLetterWords(snippet);

        System.out.println("");

        printWordsWithUserInput(snippet);

    }

    public static int sumOfEvenInts(ArrayList<Integer> integers){

        int total = 0;
        for (int integer : integers){
            if(integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(String str){

        String[] words = str.split("(\\p{P}* |\\p{P})");
        for(String word : words){
            if (word.length() == 5){
                System.out.println(word);
            }
        }

    }

    public static void printWordsWithUserInput(String str){

        System.out.print("Enter a number: ");
        Integer input = new Scanner(System.in).nextInt();

        String[] words = str.split("(\\p{P}* |\\p{P})");
        for(String word : words){
            if(word.length() == input){
                System.out.println(word);
            }
        }

    }

}
