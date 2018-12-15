package analyzers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberOfWordsAnalyzer implements Analyzer<Integer> {

    public Integer analyze (String text){

        Map<String,Integer> wordsCount = new HashMap<>();

        text.replaceAll("[^A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*", "").toLowerCase();
        String [] wordsArr = text.split(" ");


//        text.replaceAll("[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*", "").toLowerCase();
//        String [] wordsArr = text.split(" ");
//
//        for (int i = 0; i <wordsArr.length;i++){
//            if (wordsArr[i])
//
//        }




        return wordsArr.length;
    }

//    for (String line : lines) {
//        //tutaj zaczynam kodowac, mam juz pobrane linie z pliku
//        //przyklad line: ASCII stands for American Standard Code for
//        //1 - rozdzielam na wyrazy, poprzez 'spacje' ---> dokumentacja String
//        //String[] elements = Regex.Split(input, pattern);
//        String[] words = line.split(" ");
//        //2 - mam tablice wyrazow
//        //3 - przeleciec tablice wyrazow for-em
//        for (String word : words) {
//            if (!wordsMap.containsKey(word)) {
//                wordsMap.put(word, 1);
//            } else {
//                int currentWordCount = wordsMap.get(word);
//                wordsMap.put(word, currentWordCount + 1);
//            }
//        }

//    public String format (String analyze){
//        return null;
//    }

}
