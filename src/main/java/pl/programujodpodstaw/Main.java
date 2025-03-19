package pl.programujodpodstaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo, aby zamienić je na ciąg liczb ");
        String userWord = scanner.nextLine();
        System.out.println(wordToNumber(userWord)); //ponieważ metoda wordToNumber jest statyczna to wywołujemy ją bez instacji klasy

//        jeśli metoda wordToNumber byłaby niestatyczna to tak trzeba
//        Main main = new Main();
//        main.wordToNumber(userWord);
    }

    public static String wordToNumber(String word){
        String lowerCaseWord = word.toLowerCase();
        char[] wordCharArray = lowerCaseWord.toCharArray();
        List<Integer> numberFromWord = new ArrayList<>();
        String numbersResult = "";

        for (char characterOfArray : wordCharArray){
            if (characterOfArray == 'a' || characterOfArray == 'b' || characterOfArray == 'c'){
                numberFromWord.add(2);
            }else if(characterOfArray == 'd' || characterOfArray == 'e' || characterOfArray == 'f'){
                numberFromWord.add(3);
            }else if(characterOfArray == 'g' || characterOfArray == 'h' || characterOfArray == 'i'){
                numberFromWord.add(4);
            }else if(characterOfArray == 'j' || characterOfArray == 'k' || characterOfArray == 'l'){
                numberFromWord.add(5);
            }else if(characterOfArray == 'm' || characterOfArray == 'n' || characterOfArray == 'o'){
                numberFromWord.add(6);
            }else if(characterOfArray == 'p' || characterOfArray == 'q' || characterOfArray == 'r' || characterOfArray == 's'){
                numberFromWord.add(7);
            }else if(characterOfArray == 't' || characterOfArray == 'u' || characterOfArray == 'v'){
                numberFromWord.add(8);
            }else if(characterOfArray == 'w' || characterOfArray == 'x' || characterOfArray == 'y' || characterOfArray == 'z'){
                numberFromWord.add(9);
            }else {
                System.out.println("Użyto nieznanego znaku!");
            }
        }
        for (int i =0; i < numberFromWord.size(); i++){
            numbersResult += numberFromWord.get(i).toString();
        }
        return numbersResult;
    }
}