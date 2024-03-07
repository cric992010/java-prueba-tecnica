package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private void invertirCadena(String text){
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();
        for(int i = array.length; i > 0; i--){
            newText.append(array[i-1]);
        }
        System.out.println(newText);

        StringBuilder arrayString = new StringBuilder(text);
        arrayString.reverse().toString();

        System.out.println(arrayString);
    }


    private void m2IsCapicua(int number){
        String numberText = String.valueOf(number);
        String reversoNumero = new StringBuilder(numberText).reverse().toString();

        if(numberText.equals(reversoNumero)){
            System.out.println("es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }

    public void m6IsLeapYear(int year){
        boolean isLeapyear= LocalDate.of(year, 1,1).isLeapYear();
        System.out.println("es " + isLeapyear);
    }

    private void m3CountCharacterTimes(String text){
        int i, lenght, counter[] = new int[256];

        lenght = text.length();

        for(i=0 ; i<lenght; i++){
           //counter[text.charAt(i)] = counter[text.charAt(i)] +i;
            counter[text.charAt(i)]++;
        }
        for(i = 0; i<256 ; i++){
            if(counter[i] !=0){
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    private void m4RepeatedCharacters(String text){
        int i, lenght, counter[] = new int[256];

        lenght = text.length();

        for(i=0 ; i<lenght; i++){
            //counter[text.charAt(i)] = counter[text.charAt(i)] +i;
            counter[text.charAt(i)]++;
        }
        for(i = 0; i<256 ; i++){
            if(counter[i] > 1){
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    public void m5IsMultipleOf2(int number){
        if(number % 2 ==0){
            System.out.println("is multiple");
        }else {
            System.out.println("isn't multiple");
        }
    }

    public void m7RamdomOrderString(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    public void m8GetOnlyNotDuplicatesList(List<Integer> List){
        Set<Integer> set= new HashSet<>(List);
        set.forEach(System.out::println);
    }

    public void m9CheckIfVowelIsPresent(String text){
        String[] array = text.split("");
        boolean isPresent = false;
        for(String s : array){
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);

        //Otra forma de llegar al resultado.
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);


        //usando programacion funcional
        boolean re= Arrays.stream(text.split("")).anyMatch(s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
            System.out.println(re);
    }

    public boolean m10Palindrome(String text){
         boolean result = true;
         int lenght = text.length();

         for (int i = 0; i<lenght/2; i++){
             if (text.charAt(i) != text.charAt(lenght -i -1)) {
                 result = false;
                 break;
             }
         }
        return result;
    }

    public static void main(String[] args) {
       Main main = new Main();
        main.invertirCadena("miterasdf");
        main.m2IsCapicua(6263);
      //  main.m3CountCharacterTimes("christian");
        main.m4RepeatedCharacters("christianomar");
        main.m5IsMultipleOf2(10);
        main.m6IsLeapYear(2024);
        main.m7RamdomOrderString("miterasdf");
        main.m8GetOnlyNotDuplicatesList(Arrays.asList(23,23,32,32,12));
        main.m9CheckIfVowelIsPresent("crck");
        System.out.println(main.m10Palindrome("dcucd"));
    }



}