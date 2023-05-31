package src;

public class Main {
    public static void main(String[] args){
        CharacterCounter myCharacterCounter = new CharacterCounter();
        //Bonus Mission Task 1 pt2:
        String myUserInput = myCharacterCounter.getUserInput();
        myCharacterCounter.countCharacters(myUserInput);
        //printed the quote below to test the output.

        //Main assignment
        //myCharacterCounter.countCharacters( "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.");
    }
}
