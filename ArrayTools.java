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

Scanner scanner = new Scanner(System.in);
int choices = scanner.nextInt();
do {

  switch (choices){
    
    case 1:
    System.out.println("You're in Caesar Cipher menu");
    caesarCipher();
        break;

    case 2:
      System.out.println("You're in Array average menu");
        average();  
        break;
        
    case 3:
        System.out.println("You're in Search Array menu");
        arrayContains();
        break;
    case 4:
    System.out.println("You're in Array Reverse menu");
    revArray();
    break;
    case 5:
        return;

    default:
        return;
  }
}
while(choices<5);
}


public static void caesarCipher(){

    Scanner userInput = new Scanner(System.in); {
    System.out.println("Enter a string to encrypt.");
    String userValueEntered = userInput.nextLine();
    System.out.println("Enter a value to encrypt with.");
    int userKey = userInput.nextInt();
    char[] charArray = userValueEntered.toCharArray();
    String otherString = "";
    

    System.out.print("The encrypted string is ");
    for (char c: charArray) {
      c += userKey;
      System.out.print(c);
      otherString = otherString + "" + c;
    }
    System.out.println("");
    char[] decryptArray = otherString.toCharArray();

  System.out.print("Decrypting " + otherString + " with " + "-" + userKey+"..." +"\n");
    for (char d: decryptArray) {
      d -= userKey;
      System.out.print(d);
    }
    System.out.println("\n");
  }
 

    choice();
}


public static void average(int...infinite){
  
  System.out.println("How many numbers you want to enter?");
       
    Scanner userInput = new Scanner(System.in); {
    int userValueEntered = userInput.nextInt(); 
     double[] userArray = new double[userValueEntered];
    
     double total = 0;
    for(int i=0; i<userArray.length; i++){
    	System.out.print("Enter No."+(i+1)+": ");
    	userArray[i] = userInput.nextDouble();
    }

    for(int i=0; i<userArray.length; i++){
    	total = total + userArray[i];
    }
    double average = total / userArray.length;
    
    System.out.println("The average of an array is " + String.format("%.2f", average) + "\n");
    choice();
  }
    }

    public static void revArray(int...infinite){
    System.out.println("How many numbers you want to enter?");
      Scanner userInput = new Scanner(System.in); {
        int userValueEntered = userInput.nextInt(); 
         int[] userArray = new int[userValueEntered];
    
        for(int i=0; i<userArray.length; i++){
          System.out.print("Enter No."+(i+1)+": ");
          userArray[i] = userInput.nextInt(); 
        }
        System.out.print("The array was: ");
        for(int i=0; i<userArray.length; i++){
          System.out.print(userArray[i] + " ");
        }
        System.out.println();
        System.out.print("The reversed array is: ");
        for(int i = userArray.length - 1 ; i >= 0; i--){
          System.out.print(userArray[i] + " ");
        }
        System.out.println("\n");
        choice();
      

    }
  }

  public static void arrayContains(int...infinite){
    System.out.println("How many numbers you want to enter?");
      Scanner userInput = new Scanner(System.in); {
        int userValueEntered = userInput.nextInt(); 
         int[] userArray = new int[userValueEntered];
    
        for(int i=0; i<userArray.length; i++){
          System.out.print("Enter No."+(i+1)+": ");
          userArray[i] = userInput.nextInt(); 
        }
        System.out.print("The array is: ");
        for(int i=0; i<userArray.length; i++){
          System.out.print(userArray[i] + " ");
        }
        boolean found = false;
        System.out.print("\n" + "Please enter a number to search from the above array ");
        int userSearchValue = userInput.nextInt();
        int searchedValue = userSearchValue;
        for(int x : userArray){
	      if(x == searchedValue){
        found = true;
        break;
    }
  }
    System.out.println("The array contains " + searchedValue + " " + found + "\n");
    choice();
    }
  }
}


