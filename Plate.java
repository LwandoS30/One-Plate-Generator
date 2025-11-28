package plategenerator;

import java.util.Scanner;
import plategenerator.car.Car;
import java.util.Random;

public class Plate{
    //class fields declaration
    private String fName;
    private String lName;
    private String idNumber;
    private String passportNumber;

    private String plateNumber;

    public static void main(String args[]){
        //Object creation
        Plate userDetails = new Plate();
        Scanner input = new Scanner(System.in);
        Car carDetails = new Car();
        Random rand = new Random();

        //Array declaration and assignment
        //Charactor array
        char alphaChar = 'a', tempChar;
        int randNum;
        //String array
        String[] province = {"EC", "GP", "FC", "KWZ", "LP", "MP", "NC", "NW", "WC"};

        //String array
        String[] identityOption = {"National Id", "Passport"};
        
        System.out.println("******************************************************************************************");
        System.out.println("****************************Welcome to One Plate Registration*****************************");
        System.out.println("******************************************************************************************");
        System.out.println();

        //Prompt for user data
        System.out.println("Please enter your first name: ");
        userDetails.fName = input.nextLine();

        System.out.println("Please enter last name: ");
        userDetails.lName = input.nextLine();

        for(int identity = 0; identity < identityOption.length; identity++){

            System.out.println(identityOption[identity]);
        }
        
        System.out.println("Please enter type of identification");
        String identityType = input.nextLine();

        if(identityOption[0].equals(identityType)){
            System.out.println("Please enter your ID number: ");
            userDetails.idNumber = input.next();

            int idLength = userDetails.idNumber.length();
            //System.out.println(idLength);
            //checking the length of an ID number
            while (idLength != 13) {
                System.out.println("ID number must be equal to 13 charactors: ");
                userDetails.idNumber = input.next();

                idLength = userDetails.idNumber.length();
            }
        }
        else{
            System.out.println("Please enter your passport number: ");
            userDetails.passportNumber = input.next();

            int passportLength = userDetails.passportNumber.length();
            System.out.println(passportLength);
            //Checking the length of the passport number
            while (passportLength != 8) {
                System.out.println("Passsport number must be equal to 8 charactors: ");
                userDetails.passportNumber = input.next();

                passportLength = userDetails.passportNumber.length();
            }
        }

        System.out.println("Please enter your car color: ");
        carDetails.setColor(input.next());

        System.out.println("Please enter your car make: ");
        carDetails.setMake(input.next());

        System.out.println("Please enter your car model: ");
        carDetails.setModel(input.next());

        System.out.println("Please enter your car year: ");
        carDetails.setYear(input.nextInt());
      
        //Display provinces so people will enter the province abbriviation
        System.out.println();
        //Province string to store the selected province code by the user
        String provinceCode;
        
        System.out.println("Please enter the abbriviation of your province from the below list");
        for(int p = 0; p < province.length; p++){
            System.out.println(province[p]);
        }
        System.out.println("Enter province  code: ");
        provinceCode = input.next();

        //Declare a string to store the generated values
        // String 
        //Generating the first two random charactors
        randNum = rand.nextInt(10);
        
        for(int r = 0; r < 3; r++){
            System.out.println(r);
        }
        input.close();
    }

}