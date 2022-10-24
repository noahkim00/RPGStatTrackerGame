/*****************************************
Title: RPG Stat Tracker
Files: Main.java, Characters.java
Author: Noah Kim
Contact: noah.kim@my.uwrf.edu

Created: October 6, 2022
Modified: October 15, 2022

Description: This program will create an 
array of characters in D&G. It will then 
keep track of their character descriptions
and their stats. They will be going along
a journey where they will encounter many
obstacles they must overcome together. As
they deal with the obstacles the program
will update their stats when needed.
*****************************************/

//import the random to create random integers
import java.util.Random;
public class Characters {

  //immutable character attributes
  final String firstname;
  final String lastname;
  final String sex;
  final String race;
  final String characterClass;

  //mutable character attributes
  int armorClass;
  int hp;
  int strength;
  int dexterity;
  int constitution;
  int intelligence;
  int wisdom;
  int charisma;

 //Characters constructor to set the immutable attributes to the user arguments.
  //Also to set the muttable attributes to a random int from 10 to 100.
  Characters(String fname, String lname, String s, String r, String charClass) {
    firstname = fname;
    lastname = lname;
    sex = s;
    race = r;
    characterClass = charClass;

    //setting the max and min to 100 and 10
    int min = 10;
    int max = 100;

    //creating int values to store the random integer for each muttable attribute.
    //using math.floor to math.random to get the correct whole number from 10-100.
    int armorrand = (int)Math.floor(Math.random()*(max-min+1)+min);
    int hprand = (int)Math.floor(Math.random()*(max-min+1)+min);
    int strengthrand = (int)Math.floor(Math.random()*(max-min+1)+min);
    int dexrand = (int)Math.floor(Math.random()*(max-min+1)+min);
    int constrand = (int)Math.floor(Math.random()*(max-min+1)+min);
    int intelrand = (int)Math.floor(Math.random()*(max-min+1)+min);
    int wisrand = (int)Math.floor(Math.random()*(max-min+1)+min);
    int charrand = (int)Math.floor(Math.random()*(max-min+1)+min);

    //setting the muttable attributes to the random integers.
    armorClass = armorrand;
    hp = hprand;
    strength = strengthrand;
    dexterity = dexrand;
    constitution = constrand;
    intelligence = intelrand;
    wisdom = wisrand;
    charisma = charrand;
           }

 //A void method to display all the immutable and muttable attributes.
//Using prinf to format the print statements.
  public void show_stats(){

    System.out.printf("Firstname: %s\n", firstname);
    System.out.printf("Lastname: %s\n", lastname);
    System.out.printf("Sex: %s\n", sex);
    System.out.printf("Race: %s\n", race);
    System.out.printf("Character Class: %s\n", characterClass);
    System.out.printf("Armor Class: %d\n", armorClass);
    System.out.printf("HP: %d\n", hp);
    System.out.printf("Strength: %d\n", strength);
    System.out.printf("Dexterity: %d\n", dexterity);
    System.out.printf("Constitution: %d\n", constitution);
    System.out.printf("Intelligence: %d\n", intelligence);
    System.out.printf("Wisdom: %d\n", wisdom);
    System.out.printf("Charisma: %d\n", charisma);
    System.out.println();

  }

    //A method that will return back the updated armorClass level based 
    //on the user integer argument. Used an if statement to make sure 
    //any armorClass level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.
    public int armorClass(int a){
      int newAC = armorClass + a;
      if (newAC < 0){
        newAC = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newAC;
  }

    //A method that will return back the updated hp level based 
    //on the user integer argument. Used an if statement to make sure 
    //any hp level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.  
    public int hp(int a){
      int newHP = hp + a;
      if (newHP < 0){
        newHP = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newHP;
  }

    //A method that will return back the updated strength level based 
    //on the user integer argument. Used an if statement to make sure 
    //any strength level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.  
    public int strength(int a){
      int newStrength = strength + a;
      if (newStrength < 0){
        newStrength = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newStrength;
  }

    //A method that will return back the updated dexterity level based 
    //on the user integer argument. Used an if statement to make sure 
    //any dexterity level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.  
    public int dexterity(int a){
      int newDexterity = dexterity + a;
      if (newDexterity < 0){
        newDexterity = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newDexterity;
  }

    //A method that will return back the updated constitution level based 
    //on the user integer argument. Used an if statement to make sure 
    //any constitution level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.  
    public int constitution(int a){
      int newConstitution = constitution + a;
      if (newConstitution < 0){
        newConstitution = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newConstitution;
  }

    //A method that will return back the updated intelligence level based 
    //on the user integer argument. Used an if statement to make sure 
    //any intelligence level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.  
    public int intelligence(int a){
      int newIntelligence = intelligence + a;
      if (newIntelligence < 0){
        newIntelligence = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newIntelligence;
  }

    //A method that will return back the updated wisdom level based 
    //on the user integer argument. Used an if statement to make sure 
    //any wisdom level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.  
    public int wisdom(int a){
      int newWisdom = wisdom + a;
      if (newWisdom < 0){
        newWisdom = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newWisdom;
  }

    //A method that will return back the updated charisma level based 
    //on the user integer argument. Used an if statement to make sure 
    //any charisma level below 0 is set to 0 and returns a statement
    //letting the user know it cannot go lower than 0.  
    public int charisma(int a){
      int newCharisma = charisma + a;
      if (newCharisma < 0){
        newCharisma = 0;
        System.out.println("This stat cannot go any lower");
      }
      return newCharisma;
  }

}//end of class Characters