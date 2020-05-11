/*
 * Course:        TCSS 142 - Introduction to Object-Oriented Programming
 * File Name:     Project1.java
 * Assignment:    1
 * Due Date:      14 April 2020
 * Instructor:    Mr. Schuessler
 */

/**
 * This simple program makes an ASCII Space Needle of all different sizes!
 * (Definitely not to be confused with the Tokyo Sky Tree)
 *
 * @author Jeremy Tirador <a href = "mailto:Tirabyte@uw.edu">Tirabyte@uw.edu</a>
 * @version 2020/04/08 v1.0.0
 *
 */
public class Project1 {
   
   //    Constants:
   /**   SIZE - Specifies a Size of the Space Needle and scales accordingly.*/
   public static final int SIZE = 6;

   /**
      Main Brains of the Program, Runs all the Steps to construct a Space Needle
      (Main Driver)
      
      @param args - Used for CMD Line Input
   */
   public static void main(String[] args) {
      
      needlePole();
      needleRoof();
      needleBotC();
      needlePole();
      needleBody();
      needleRoof();
   }

   /**
      Creates the Pole for the Space Needle
      Used for the Tip and Neck of the Landmark
   */
   public static void needlePole() {
      
      // Scales height depending on SIZE
      for (int height = 0; height < SIZE; height++){
      
         // Adds space for centering
         for (int spa = 0; spa < 3 * SIZE; spa++){
            System.out.print(" ");
         }
         
         // Needle! (or neck of Needle...)
         System.out.println("||");
      }
   }
   
   /**
      Creates the Roof for the Space Needle
      Used for the Roof and Base of the Landmark
   */
   public static void needleRoof() {
   
      // Scales height depending on SIZE
      for (int height = 0; height < SIZE; height++){
         
         // Adds space for centering
         for (int spa = 0; spa < (3 * SIZE - 3) - (3 * height); spa++){
            System.out.print(" ");
         }
         
         // Builds Roof/Base according to SIZE
         System.out.print("__/");
         
         // Filler for the left side of Roof/Base with :
         for (int fill = 0; fill < 3 * height; fill++){
            System.out.print(":");
         }
         System.out.print("||");
         
         // Fills for the right side of Roof/Base with :
         for (int fill = 0; fill < 3 * height; fill++){
            System.out.print(":");
         }
         System.out.println("\\__");
      }
      
      // Adds baseplate of Roof/Base
      System.out.print("|");
      
      // Fills baseplate with "
      for (int base = 0; base < 6 * SIZE; base++){
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   /**
      Creates the Bottom Cone for the Space Needle
   */
   public static void needleBotC() {
   
      // Scales height depending on SIZE
      for (int height = 0; height < SIZE; height++){
      
         // Adds Space for Centering
         for (int spa = 0; spa < 2 * height; spa++){
            System.out.print(" ");
         }
         
         // Builds Bottom Cone according to SIZE
         System.out.print("\\_");
         
         // Fills cone with /\
         for (int fill = 0; fill < 2 + (SIZE * 3 - 3) - (height * 2); fill++){
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   
   /**
      Creates the Main Body for the Space Needle
   */
   public static void needleBody() {
   
      // Scales height depending on SIZE
      for (int height = 0; height < SIZE * 4; height++){
      
         // Adds Space for Centering
         for (int spa = 0; spa < 3 * SIZE - 3; spa++){
            System.out.print(" ");
         }
         
         // Body!
         System.out.println("|%%||%%|");
      }
   }
}

// Tear All the Bytes!