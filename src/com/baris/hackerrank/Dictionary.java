package com.baris.hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by barisilhan on 6/28/2018.
 */
public class Dictionary {

    public static void main(String[] args) {
        Map<String,String> engSpanDictionary = new HashMap<String,String>();

        // put inside to dictionary
        engSpanDictionary.put("Monday","Lunes");
        engSpanDictionary.put("Tuesday","Martes");
        engSpanDictionary.put("Wednesday","Miercoles");
        engSpanDictionary.put("Thursday","Jueves");
        engSpanDictionary.put("Friday","Viernes");
        engSpanDictionary.put("Saturday","Sabado");
        engSpanDictionary.put("Sunday","Domingo");

        // retrieve data
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.keySet()); // print keys
        System.out.println(engSpanDictionary.values()); // print values

        System.out.println("size of dictionary " + engSpanDictionary.size());

        // create shopping list
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        shoppingList.put("Ham",true);
        shoppingList.put("Bread",true);
        shoppingList.put("Oreo",true);
        shoppingList.put("Eggs",false);
        shoppingList.put("Sugar",false);

        System.out.println(shoppingList.get("Ham"));

        //key value pairs print
        System.out.println(shoppingList.toString());


    }
}
