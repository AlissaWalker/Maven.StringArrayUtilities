package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects //means param means parameters
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO                                     //Array length says were a variable is at
    public static String getLastElement(String[] array) {
        int lastIndex = array.length;
        //1st find index of the array -> .length
        //2nd need last element of array ->

        return array[lastIndex - 1];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        // int secLast = array.length-2; //int variable holding the size of the array

        return array[array.length - 2]; //array.length is an integer for the index
        //elements are different then sizes because arrays start at 0
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        //1st read string of objects
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {                                 // when length has () its a method
                return true;                                                 //== is comparison 1 = sets a value

            }
            //2nd read the values of the index in the array
            //3rd return true if it has the specified value // 2nd branch in for loop
        }
        return false;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int j= 0;   //declared int j as place holder for new array
        String[] newArray = new String[array.length];       //created a place holder array = to the size of the 1st array
        for (int i = array.length - 1; i >= 0; i--) {       //did a for loop setting i to the length -1 of the array to get the last index of the original array, i-- steps down each loop turn
            newArray[j] = array[i];                         //set new hold varible j to the index of the orginal array
            j++;                                            //assigned j to the 2nd index so it adds 1 each time in the loop
        }

        return newArray; //passes 3 of 3 test
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        //String [] newArray=  new String[array.length];
        for(int i=0; i< array.length; i++){     //checks each element int he array
            if(array[i] != array[array.length-1-i]){  // if the array
                return false; // if its not in order return false
            }
        }

         return true; // if the array matched the same thing flipped return true
    }



        /**
         * @param array array of String objects
         * @return true if each letter in the alphabet has been used in the array
         */ // TODO
        public static boolean isPangramic (String[]array){
            Boolean pangramicUpperCase, pangramicLowerCase, pangramic = true;
            String arrayString = Arrays.toString(array);
            for (int i = 0; i <= 26; i++) {
                pangramicUpperCase = arrayString.contains(Character.toString((char) ('A' + i)));
                pangramicLowerCase = arrayString.contains(Character.toString((char) ('a' + i)));
                if ((!pangramicUpperCase) && (!pangramicLowerCase)) {
                    pangramic = false;
                }
            }

         /*    String newStringHolder = "";
            for(int i= 0; i< array.length; i++){
                newStringHolder += array[i]; //sets newString
            }

            String [] letters ="abcdefghijklmnopqrstuvwxyz".split("");
          for(int i=0; i<letters.length; i ++){ // goes thru array
               for(int j=0; j< array.length;j++){
                   if(array[i] == letters[i]){
                       return false;

                   } //
                   if(array[i] != letters[i]){

                   }
               }

           }
            return false; <-- pass all but last test */
            return pangramic;
        }

        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return number of occurrences the specified `value` has occurred
         */ // TODO
        public static int getNumberOfOccurrences (String[]array, String value){
            int count = 0; // set count to 0
            for (String string : array) {
                if (string.equals(value)) {
                    count++;
                }
            }
            return count;

        }

        /**
         * @param array         array of String objects
         * @param valueToRemove value to remove from array
         * @return array with identical contents excluding values of `value`
         */ // TODO
        public static String[] removeValue (String[]array, String valueToRemove){
            List<String> aList = new ArrayList<>(Arrays.asList(array));
            aList.removeAll(List.of(valueToRemove));
            array = aList.toArray(new String[0]);
            return array;

        }

        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){

            ArrayList<String> newArr = new ArrayList<>();

            int n = array.length;
            if (n == 0 || n == 1) {
                return array;

            }
            for (int i = 0; i < n - 1; i++) {
                if (array[i] != array[i + 1]) {
                    newArr.add(array[i]);
                }

    // Next add to new array + return the new string array.
            }
            newArr.add(array[n - 1]);
            return newArr.toArray(new String[0]);

        }

        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){
            ArrayList<String> arrayCopy = new ArrayList<String>();
            String concat="";
            for (int i = 0; i < array.length; i++){
                if (i== array.length -1) {
                    if (array[i]==array[i-1]) {
                        concat+=array[i];
                        arrayCopy.add(concat);
                    }
                    else
                        arrayCopy.add(array[i]);
                }
                else if (array[i] == array[i+1])
                    concat+=array[i];
                else {
                    if (i==0)
                        arrayCopy.add(array[0]);
                    else if (array[i]==array[i-1]){
                        concat+=array[i];
                        arrayCopy.add(concat);
                        concat="";
                    }
                    else
                        arrayCopy.add(array[i]);
                }
            }
            return arrayCopy.toArray(new String[arrayCopy.size()]);


        }


    }
