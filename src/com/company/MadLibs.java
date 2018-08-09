package com.company;
import java.util.Random;
import java.util.Scanner;
public class MadLibs {
    Scanner sc = new Scanner(System.in); //scanner object
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNumb;
    Random rand = new Random();

//Getters
    public String getStory(){
        return  story;
    }
    public String getName(){
        return  name;
    }
    public String getAdjective1(){
        return  adjective1;
    }
    public String getAdjective2(){
        return  adjective2;
    }
    public String getNoun1(){
        return  noun1;
    }
    public String getNoun2(){
        return  noun2;
    }
    public String getNoun3(){
        return  noun3;
    }
    public String getAdverb(){
        return  adverb;
    }
    public String getRandomNumb(){
        return  randomNumb;
    }

//Setters
    public void setStory(String newStory){
        this.story = newStory;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setAdjective1(String newAdjective1){
        this. adjective1 = newAdjective1;
    }
    public void setAdjective2(String newAdjective2){
        this.adjective2 = newAdjective2;
    }
    public void setNoun1(String newNoun1){
        this.noun1 = newNoun1;
    }
    public void setNoun2(String newNoun2){
        this.noun2 = newNoun2;
    }
    public void setNoun3(String newNoun3){
        this.noun3 = newNoun3 ;
    }
    public void setAdverb(String newAdverb){
        this.adverb = newAdverb;
    }

    public void setRandomNumb(){
        int num = Math.abs(rand.nextInt())% 100; //get the random numbers
        int index = 0;  //set the index by zero
        int [] numberHolder  = new int[3]; //create an array
        while (index < numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }
        randomNumb = "not" + numberHolder[0] + " , not " + numberHolder[1]
                + ", but " + numberHolder[2];
    }


    public void printInstruction(){
        System.out.println("Welcome to the MadLibs game. If you type in words, we will give you a story. Start by typing in a name.");
    }

//functions give to user enter strings using scanner
    public void enterName(){
        setName(sc.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Give me a noun! ");
        setNoun1(sc.nextLine());
    }
    public void enterNoun2(){
        System.out.println("Give me another noun! ");
        setNoun2(sc.nextLine());
    }
    public void enterNoun3(){
        System.out.println("Give me the last noun! ");
        setNoun3(sc.nextLine());
    }
    public void enterAdjective1(){
        System.out.println("I need an adjective! ");
        setAdjective1(sc.nextLine());
    }
    public void enterAdjective2(){
        System.out.println("I really need an alpaca... just kidding, give me another adjective! ");
        setAdjective2(sc.nextLine());
    }
    public void enterAdverb(){
        System.out.println("Please! I really need an adverb! ");
        setAdverb(sc.nextLine());
    }

///the method creates the story
    public void putTogetherStory(){
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if(num == 0) {
            story = "Jesse and her best friend " + getName() + " went to Disney Land today! The say a "
                    + getNoun1() + "in a show at the Magic Kingdom and ate a " + getAdjective1() + "feast for dinner. The next day I " + getAdverb()
                    + " to meet Mickey Mouse  in his " + getNoun2() + " and then that night I gazed at the " + getRandomNumb() + " "
                    + getAdjective2() + "firework shooting from the " + getNoun3() + ".";
        }else {
            story = " Amanda and her best friend " + getName() + " went to the Zoo last summer. They saw a huge  "
                    + getNoun1() + " and tiny little " + getNoun2() + " That night they decided to climb  "  +  getAdverb() + "into the "
                    + getNoun3() + " to get a closer look. The Zoo was  " + getAdjective1() + " at night, but they didn't care... until"+ getRandomNumb() + " "
                    + getAdjective2() + " alpies yelled in their faces, making  Amanda and " + getNoun3() + " sprint all the way back home.";

        }
            setStory(story);

    }

    //the method call all those enter functions
    public void play(){
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNumb();
        putTogetherStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
	    MadLibs game = new MadLibs();
	    game.printInstruction();
	    game.play();
    }
}
