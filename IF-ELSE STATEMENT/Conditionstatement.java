import java.util.Scanner;

public class Conditionstatement {
    public static void main(String[] args) {
        // int age = 20;

        // if(age>=18){
        //     System.out.println("you are eligible to drive");
        //     }
        //     else if(age >=18){
        //         System.out.println("You can vote also");
        //     }
        //     else{
        //         System.out.println("you are not eleigible to drive ");
        //     }
        Scanner scanner  = new Scanner(System.in);

       String name;
         System.out.println("Enter your name");
         name = scanner.nextLine();
         

         if(name.isEmpty()){
            System.out.println("Name is empty");
            }
            else{
                System.out.println("hello" + name );
            }
            scanner.close();
         }
           
            

        }
