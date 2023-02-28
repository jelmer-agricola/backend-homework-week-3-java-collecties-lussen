package src;

import java.util.Objects;
import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {

        //        [x]2. Maak in je main methode een Integer array genaamd `numeric` die je vult met de nummers 1,2,3,4,5,6,7,8,9,0.

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //        [x]3. Maak in je main methode een String array genaamd `alphabetic` die je vult met de String varianten van de nummers uit stap 1, dus: "een", "twee", ... etc ..., "negen", "nul".
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

//        for (int i = 0; i < numeric.length; i++) {
//            System.out.println(numeric[i]);
//
//        }

//        []9. De constructor is klaar. Nu ga je deze aanroepen met de juiste argumenten in de main methode van de Main class, oftewel: maak in main een nieuw object aan van het type Translator.
        Translator translator = new Translator(numeric, alphabetic);

// []12. Maak in de main methode van de Main class een boolean variabele genaamd `play` met de waarde `true`. Maak een String variabele genaamd `ongeldig` waarin je de String "ongeldige invoer" zet. Als laatst maak je nog een nieuw Scanner object aan met `Scanner scanner = new Scanner(System.in)`.

        boolean play = true;
        String incorrectAnswer = "incorrect";
        Scanner scanner = new Scanner(System.in);
//[][13. Vervolgens maak je een while-loop die doorgaat zolang `play` true is.
//        []14. Print in de while-loop `"Type 'x' om te stoppen \nType 'v' om te vertalen"` en maak een String variabele genaamd `input` waarin je de waarde van `scanner.nextLine()` opslaat.
//hieronder while play is ture
        while (play)
        {
            System.out.println("type x om te stoppen");
            System.out.println("type v om te vertalen");
            String input = scanner.nextLine();

//            []15.Maak in de body van de while-loop een if/else if/else statement.
//    1. __if__: Als de `input` "x" is, dan zet je `play` naar false.
//    2. __else if__: Als de `input` "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9",
//       vervolgens sla je het resultaat van `scanner.nextInt()` op in een variabele `int number`,
//       @@ -59,4 +65,9 @@ Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo go
//        2. __else__: anders dan print je `ongeldig`
//    4. __else__: Als de `input` dus iets anders dan "x" of "v" is, dan print je `ongeldig`

            if (Objects.equals(input, "x")) {
                play = false;
            } else if (Objects.equals(input, "v")) {
                System.out.println("type een cijfer tussen - 0 t/m 9");
                int inputNumber = scanner.nextInt();
                scanner.nextLine();

//                geneste if statement
                if(inputNumber < 10){
                    String result  = translator.translate(inputNumber);
                    System.out.println(result);

                }else{
                    System.out.println("ongeldig type een cijfer tussen - 0 t/m 9");
                }
            }else{
                System.out.println("input` dus iets anders dan x of v is, dan print je ongeldig ");
            }
        }
    }
}