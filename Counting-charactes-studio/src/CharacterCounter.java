package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {
    //class variables

    //constructors
    public CharacterCounter() {

    }
    //methods
    public void countCharacters(String wordToCount) {
        //Bonus Mission 1 Task 2: Make strings case insensitive;
        wordToCount = wordToCount.toLowerCase();

        char[] arrayOfChars = wordToCount.toCharArray();
        //System.out.println(arrayOfChars[0]); tested to see if it'd print first character

        //loop through characters to count them
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        //created for loop first to see if it worked then added hashmap on top
        for ( int i = 0; i < arrayOfChars.length; i++ ){
            //System.out.println(arrayOfChars[i]); testing to see if it print

            //Bonus Mission 1 Task 3: Exclude non-alpha char
            if (Character.isLetter(arrayOfChars[i]) == false) {
                //exclude if it's false
                continue; //this tells the for loop stop what youre doing and go back to the top
            }



            //Main task: add or update the count of each character into the hash map
            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                //Does not contain the key
                myCharacterCount.put(theCharacter, 1);
            } else {
                //Does contain the key
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }

        }
        //System.out.println(myCharacterCount); test above to make sure it pints
        /*
        Text ex of how it wants it to be counted:
        I = #
        */

        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        //System.out.println(myCharacterKeys); test to see if keys print
        for(int i = 0; i < myCharacterKeys.size(); i++) {
            //System.out.println(myCharacterKeys.get(i)); tested to see if char print on each line
            //print the way the assignment
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ": " + theValue);
        }
    }
    //Bonus Mission Task 1 pt1:
    public String getUserInput() {
        Scanner myScanner = new Scanner(System.in);

        String myUsersInput = myScanner.nextLine();

        myScanner.close();

        return myUsersInput;
    }
}
