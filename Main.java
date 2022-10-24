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

class Main {
  public static void main(String[] args) {

    //An array created to store the 5 charcters.
    Characters[] characterobjs = new Characters[5];

    //Declaring each character with the specific immutable attributes.
    //Using the Chacacters constructor to do so.
    characterobjs[0] = new Characters("Bilbo", "Baggins", "Male", "Halfing", "Rogue");
    characterobjs[1] = new Characters("Aragorn", "Ellessar", "Female", "Human", "Ranger");
    characterobjs[2] = new Characters("Grimble", "Grumble", "Male", "Gnome", "Wizard");
    characterobjs[3] = new Characters("Arwen", "Undomiel", "Female", "Elf", "Cleric");
    characterobjs[4] = new Characters("Mister", "Steve", "Male", "Human", "Bard");

    //A for loop to display each character's attributes.
    for(int i=0; i<characterobjs.length; i++){
      characterobjs[i].show_stats();
    }

    //First situation provided by Professor Tomesh in the assignment
    System.out.println();
    System.out.println();
    System.out.println("The Fellowship enter the dark swamp of Guruth-kil. An eerie green mist hangs in the air. ");
    System.out.println("\"I don't like the feel of this place,\" whispers Bilbo.");
    System.out.println("\"Never fret, master Hobbit,\" squeaks Grimble Grumble, \"you have a wizard at your side!\"");
    System.out.println();
    System.out.println("Grimble, distracted by his own ego, steps into a trap!");

    //If and else if statements to implement the storyline and to see what
    //happens to Grimble depending on his dexterity level. The statements 
    //will also provided a hp subtraction if needed and that is done using
    //the hp method that takes an int as an argument.
    if(characterobjs[2].dexterity > 60){
      System.out.println("Grimble nimbly dodges a flurry of daggers that rain down all around him!");
    }
    else if(characterobjs[2].dexterity <= 60){
      System.out.println("Grimble is suddenly struck by a flurry of arrows! Grimble takes -40 to his hp!");
      characterobjs[2].hp = characterobjs[2].hp(-40);
    }
    if(characterobjs[2].hp <= 0){
      System.out.println("\"Boy was I a fool in school for cutting gym....\" Grimble sighs with his last breath...");
    }

    //The second storyline situation I wrote for Mister Steve!
    System.out.println();
    System.out.println("The Fellowship now get past the first trap in the dark swamp.");
    System.out.println("They carefully enter the murky dark swamp waters.");
      System.out.println("\"Beware my friends as there may be a monster preying on us,\" says Aragorn.");
    System.out.println("\"Don't be so weak and scared!\" Screams Mister Steve to Aragorn.");
    System.out.println("Just as Mister Steve scolds Aragorn... a blood hungry crocodile emerges!");
    System.out.println();

    //If and else if statements to implement the situation and see what
    //happens to Mister Steve based on his strength level.
    //If there is a need to subtract hp the hp method will be utilized.
    if(characterobjs[4].strength > 60){
      System.out.println("Mister Steve powers through and fires his shotgun at the crocodiles head!!");
    }
    else if(characterobjs[4].strength <= 60){
      System.out.println("Mister Steve loses his leg to the hungry crocodile and must now hobble around!");
      System.out.println("Mister Steve takes a hit of -35 hp.");
      characterobjs[4].hp = characterobjs[4].hp(-35);
    }
    if(characterobjs[4].hp <= 0){
      System.out.println("\"Man I shoudl have watched my mouth...\" Mister Steve is taken by the crocodile and feasted on!");
    }

    //The third storyline situation I wrote!
    System.out.println();
    System.out.println("The fellowship move past the crodile infested waters and are onto the next part of the journey.");
    System.out.println("\"Let us not take anything else for granted,\" said the smart elf Arwen.\"");
    System.out.println("\"Just stay close to me you weak elf,\" says Bilbo confidentely.");
    System.out.println("Bilbo then falls into a floor trap where he is surronded by human shark half breeds!");
    System.out.println("The shark half breeds scream, \"You are not getting out of here alive!\"");
    System.out.println();

    //If and else if statements to implement the situation and see what
    //happens to Bilbo based on his intelligence level. If there 
    //is a need to lower hp the hp method will be utilized.
    if(characterobjs[0].intelligence > 60){
      System.out.println("Bilbo out smarts the shark halfbreeds by throwing the tuna sandwiches his mommy packed for him.");
      System.out.println("As they are distracted he swifty chops them all up with his chainsaw!");
    }
    else if(characterobjs[0].intelligence <= 60){
      System.out.println("Bilbo is rushed by the shark half breeds all at once!");
      System.out.println("He manages to fight them all off except one because he thought of his mommy's pie waiting for him back home.");
      System.out.println("One shark manages to take a chunk out of Bilbo as he was distracted. He takes -25 to his hp.");
      characterobjs[0].hp = characterobjs[0].hp(-25);
    }
    if(characterobjs[0].hp <= 0){
      System.out.println("All the sharks attack and devour Bilbo for a nice family feast!");
    }

    //The fourth situation in the storyline I wrote!
    System.out.println();
    System.out.println("The fellowship a little shaken from the sharks move along their journey.");
    System.out.println("They enter a cave now that starts to make them very wary of their surrondings.");
    System.out.println("Aragorn being a dumb human runs ahead of the group.");
    System.out.println("She finds herself alone now and gets worried as she can only see the others from a distance.");
    System.out.println("Suddenly, she starts to hear critters crawling around her.");
    System.out.println("A huge spider monkey emerges from the top of the cave! Aragorn is now in the fight for her life!");
    System.out.println();

    //If and else if statements to implement the situation and see what
    //happens to Aragorn based on her charisma level. If there is a 
    //need to subtract hp the hp method will be utilized.
    if(characterobjs[1].charisma > 60){
      System.out.println("Aragorn sweet talked the spider monkey into dropping his guard.");
      System.out.println("As he dropped his guard she swifty stabs him in the head with her spear!!");
    }
    else if(characterobjs[1].charisma <= 60){
      System.out.println("Aragorn tries to talk to the spider monkey but he only speaks in monkey!");
      System.out.println("The spider monkey then shoots a posion web at Aragorn!");
      System.out.println("She is able to quickly heal herself and defeat the spider money.");
      System.out.println("Aragorn takes a -15 hit to her hp from the poison.");
      characterobjs[1].hp = characterobjs[1].hp(-15);
    }
    if(characterobjs[1].hp <= 0){
      System.out.println("Aragorn tries to reason with the spider monkey to let her and her friends pass along.");
      System.out.println("However, the spider monkey hasn't ate in a week so he devours her whole!");
    }
    
  }//end of main method
}//end of Main class