package src;

import java.util.HashMap;

public class Translator {

    //    [x]. Maak in de Translator class een `HashMap<Integer,String>` variabele met de naam `numericAlpha`.
    //   [x]5. Maak in de de naam `numericAlpha`. Maak in de Translator class een constructor die de volgende Translator class een `HashMap<Integer,String>` variabele met parameters krijgt: `(String[] alphabetic, Integer[] numeric)`.
    HashMap<Integer, String> numericAlpha = new HashMap<>();


//   []7.Schrijf in de constructor een for-loop die begint bij 0 en doorgaat tot de lengte van de numeric/alphabetic array (maakt niet uit welke, ze zijn even lang).

    public Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {s
            numericAlpha.put(numeric [i], alphabetic[i]);

        }

    }
//    []10. Maak in de Translator class een nieuwe methode genaamd `translate(Integer number)` die een String returnt.
//1In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij de sleutel (key) van `number`
    public String translate (Integer number){
//        11. In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij de sleutel (key) van `number`
        String  result = numericAlpha.get(number);
        return result;
//        return numericAlpha.get(number);



    }

}

