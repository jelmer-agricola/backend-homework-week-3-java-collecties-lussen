package src;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Hier mag je je code scrijven voor de hoofd-opdracht

        /* deze regel mag je weg halen voor de bonus opdracht. Onderstaande code is voor de bonus opdracht.
        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber =  setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback();
         deze regel mag je weg halen voor de bonus opdracht */


//        [x]2. Maak in je main methode een Integer array genaamd `numeric` die je vult met de nummers 1,2,3,4,5,6,7,8,9,0.
        int [] numeric ={1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < numeric.length; i++) {
            System.out.println(numeric[i]);
        }
//        [x]3. Maak in je main methode een String array genaamd `alphabetic` die je vult met de String varianten van de nummers uit stap 1, dus: "een", "twee", ... etc ..., "negen", "nul".
        String[] alphabetic ={ "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};


    }
}



//    Deze methode is voor de bonus opdracht.
//        */
//public static void feedback(String stringnumber) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder feedback = new StringBuilder();
//        System.out.println("take a guess");
//        String guess = scanner.nextLine();
//        if (Objects.equals(guess, stringnumber)) {
//        System.out.println("gefeliciteerd je hebt het goed");
//        } else {
//        for (int i = 0; i < 4; i++) {
//        if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
//        feedback.append("+");
//        } else if (stringnumber.contains(guess.substring(i, i + 1))) {
//        feedback.append("0");
//        } else {
//        feedback.append("X");
//        }
//        }
//        }
//        System.out.println(feedback.toString());
//        }
//        }