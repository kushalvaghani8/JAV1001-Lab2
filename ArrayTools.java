/*
Name:               Kushal Vaghani
student number:     A00247163
JAV-1001 - 11329 -  App Development for Android - 202201 - 001
Lab 2 - Methods and Arrays
*/


import java.util.Scanner;  // Import the Scanner class


public class ArrayTools{

  public static void main(String[] args) {

      choice();

      }

public static void choice(){

      System.out.println("1. Caesar Cipher (Encrypt Text)");
      System.out.println("2. Integer Array Average");
      System.out.println("3. Array Contains");
      System.out.println("4. Reverse Array");
      System.out.println("5. Quit");

Scanner scanner = new Scanner(System.in);
int choices = scanner.nextInt();
do {

  switch (choices){ //Initial menu with all the choices user can selct from

    case 1: //calls the ceaser cipher method
    System.out.println("You're in Caesar Cipher menu");
    caesarCipher();
        break;

    case 2: //calls the array average method
      System.out.println("You're in Array average menu");
        average();
        break;

    case 3: //calls the search array method
        System.out.println("You're in Search Array menu");
        arrayContains();
        break;
    case 4: //to reverse print the array/ method
    System.out.println("You're in Array Reverse menu");
    revArray();
    break;
    case 5: //exits the program.
      System.exit(0);
        return;

    default:
        return;
  }
}
while(choices<5);
}


public static void caesarCipher(){ //ceasecipher method.

    Scanner userInput = new Scanner(System.in); { //creates a new scanner object
    System.out.println("Enter a string to encrypt.");
    String userValueEntered = userInput.nextLine(); //getting string from user to encrypt
    System.out.println("Enter a value to encrypt with.");
    int userKey = userInput.nextInt(); //getting int from user to encrypt the user string with
    char[] charArray = userValueEntered.toCharArray(); //making a character array to save single value of strings
    String otherString = ""; //making an empty string for decryption


    System.out.print("The encrypted string is ");
    for (char c: charArray) { // for each character in string,
      c += userKey; // adds that many value to character
      System.out.print(c); //output for encrypted string.
      otherString = otherString + "" + c; //converting character back to string for decryption
    }
    System.out.println("");
    char[] decryptArray = otherString.toCharArray(); //decryption character array

  System.out.print("Decrypting " + otherString + " with " + "-" + userKey+"..." +"\n"); //output for decrypted string
    for (char d: decryptArray) { // for each character in string,
      d -= userKey; //subtracts that many value of character
      System.out.print(d); //outputs for decrypted string
    }
    System.out.println("\n");
  }

    choice(); //going back to main menu after encrypting/decrypting
}


public static void average(int...infinite){

  System.out.println("How many numbers you want to enter?");

    Scanner userInput = new Scanner(System.in); { //making a new scanner object
    int userValueEntered = userInput.nextInt(); //reading user input
     double[] userArray = new double[userValueEntered]; //saving all user input into an array.

     double total = 0;
    for(int i=0; i<userArray.length; i++){ //will run for the number entered in userValueEntered
    	System.out.print("Enter No."+(i+1)+": "); //showing user to input the next number (if user entered number was not the last)
    	userArray[i] = userInput.nextDouble(); //saving the number entered into the ith(number) place.
    }

    for(int i=0; i<userArray.length; i++){ //loops throgh the user input
    	total = total + userArray[i]; //adding all the user value entered
    }
    double average = total / userArray.length; //taking average of all number that user entered

    System.out.println("The average of an array is " + String.format("%.2f", average) + "\n"); //output for average with 2 decimal place
    choice(); //going back to main menu
  }
    }

    public static void revArray(int...infinite){ // method to reverse the array that user entered
    System.out.println("How many numbers you want to enter?");
      Scanner userInput = new Scanner(System.in); { //making a new scanner object
        int userValueEntered = userInput.nextInt(); //reading user input
         int[] userArray = new int[userValueEntered]; //saving them all into an array.

        for(int i=0; i<userArray.length; i++){ //for the number entred this will loop over that many times
          System.out.print("Enter No."+(i+1)+": "); //showing user to input the next number (if user entered number was not the last)
          userArray[i] = userInput.nextInt(); //saving the number entered into the i position
        }
        System.out.print("The array was: "); //displaying the message for user entered array.
        for(int i=0; i<userArray.length; i++){ //looping through the user input array.
          System.out.print(userArray[i] + " "); //printing out the array with above message
        }
        System.out.println(); //leaving a space in between
        System.out.print("The reversed array is: "); //displaying the reversed array message
        for(int i = userArray.length - 1 ; i >= 0; i--){ //logic to reverse the array, and looping through items
          System.out.print(userArray[i] + " "); //printing out the new /reversed array with above message
        }
        System.out.println("\n");
        choice(); //going back to main menu.


    }
  }

  public static void arrayContains(int...infinite){ //method to searh for number, if it's inside an array.
    System.out.println("How many numbers you want to enter?");
      Scanner userInput = new Scanner(System.in); { //making a new scanner object
        int userValueEntered = userInput.nextInt(); //reading user input
         int[] userArray = new int[userValueEntered]; //saving them all into an array.

        for(int i=0; i<userArray.length; i++){ //for the number entred this will loop over that many times
          System.out.print("Enter No."+(i+1)+": "); //showing user to input the next number (if user entered number was not the last)
          userArray[i] = userInput.nextInt(); //saving the number entered into the i position
        }
        System.out.print("The array is: "); //displaying the message for user entered array.
        for(int i=0; i<userArray.length; i++){ //looping through the user input array.
          System.out.print(userArray[i] + " "); //printing out the array with above message
        }
        boolean found = false; //making an boolean object and setting it to false
        System.out.print("\n" + "Please enter a number to search from the above array "); //message shown to user for the number input to search from the above array.
        int userSearchValue = userInput.nextInt(); //reading the user input
        int searchedValue = userSearchValue; //setting the user input in searchedValue
        for(int v : userArray){ //searching for the integer into the userarray
	      if(v == searchedValue){ //if user entered value is in the array
        found = true; //the boolean object will be set to true
        break;
    }
  }
    System.out.println("The array contains " + searchedValue + " " + found + "\n"); //printing true if user entered value is found, if not it'll be displayed as false
    choice(); //going back to main menu.
    }
  }
}
