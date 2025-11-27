package plategenerator;

import java.util.Scanner;

public class Plate{
    //class fields declaration
    private String fName;
    private String lName;
    private String idNumber;
    private String passportNumber;

    private String plateNumber;

    public static void main(String args[]){
        //Class plate object
        Plate userDetails = new Plate();
         //Scanner object
        Scanner input = new Scanner(System.in);

        //Array declaration and assignment
        //Charactor array
        char[] alphaChar = {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j','k',
         'l', 'm', 'n', 'o','p', 'q', 'r', 's', 'u', 'v', 'w', 'x', 'y', 'z'};

        //String array
        String[] province = {"Eastern Cape", "Gauteng", "Free State", "Kwa-Zulu Natal", 
        "Limpopo", "Mpumalanga", "Northen Cape", "North West", "Western Cape"};

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


        // for(int p = 0; p < province.length; p++){
        //     System.out.println(p+". "+province[p]);
        // }
        // System.out.println("Please enter a number of your province");
        // int provinceNumber;

        // if(province[0]){

        // }
        // for(int i = 0; i <= 25; i++){
        //     System.out.println(alpha);
        //     alpha++;
        // }
    }
}