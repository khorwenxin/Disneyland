import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; //time
import java.time.temporal.ChronoUnit;  //time-out

public class Customer{
    
    public static void PersonalInfo(){
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = false;
        
        while(shouldContinue == false)
        {
            System.out.println("Customer Information");
            System.out.println("=======================");
            System.out.print("Enter your first name: ");
            String fname = scanner.nextLine();
            System.out.print("Enter your last name: ");
            String lname = scanner.nextLine();
            System.out.print("Enter your ID number: ");
            int id = scanner.nextInt();
            System.out.print("Enter your age: "); //problem
            int age = scanner.nextInt();
            System.out.print("Enter your gender M(ale)/F(emale) : "); //problem
            char gender = scanner.next().charAt(0);
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();
            System.out.print("Enter your phone number: ");
            String phNum = scanner.nextLine();
            System.out.print("Enter your street address: ");
            String street = scanner.nextLine();
            System.out.print("Enter your city address: ");
            String city = scanner.nextLine();
            System.out.print("Enter your state address: ");
            String state = scanner.nextLine();
            System.out.print("Enter your poscode address: ");
            int posCode = scanner.nextInt();
            System.out.print("Enter your country address: ");
            String country = scanner.nextLine();
            
// +++++++++++++++++++ CORRECTION +++++++++++++++++++++

// Personal_info cust = new Personal_info(int id, String fName, String lName, String phNum, int age, char gender, String email, String street, String city, String state, int posCode, String country);
//            boolean result = cust.validateID(cust);
//            if(result == false){
//                System.out.print("Invalid data. Please Check Again\n\n");
//                shouldContinue = false;
//            }
//            else{
//                System.out.print("Success\n\n");
//                shouldContinue = true;
//            }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++
        }
    }
    
    public static void Ticket()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Purchase Ticket");
        System.out.println("==================");
        
        boolean shouldContinue = false;
        
        while(shouldContinue == false){
            System.out.print("Choose a number of the Ticket type 1.Classic 2.Premium: "); 
            int type = scanner.nextInt();
            if(type != 1 && type != 2){
                System.out.print("Please select 1 or 2 only");
                shouldContinue = false;
            }
        }
        
        while(shouldContinue == false){
            System.out.print("Enter ticket quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter number of adults: ");
            int adult = scanner.nextInt();
            System.out.print("Enter number of kids: ");
            int kid = scanner.nextInt();
            if (quantity != (adult + kid)){
                System.out.print("Ticket Quantity is not match. Try Again.");
                shouldContinue = false;
            }
        }
        
        System.out.print("Ticket Day Pass: ");
        int ticketpass = scanner.nextInt();
        
        LocalDate checkin = LocalDate.now();
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");  
        String formattedDate = myDateObj.format(myFormatObj);  
        
        System.out.println("Checked-in : " + checkin + "\t\t " + "Ticket Time-in: " + formattedDate);
        
        LocalDate checkout =  LocalDate.now().plusDays(ticketpass);
	System.out.println("Check-out : " + checkout + "\t\t" + "Ticket Time-out: " + myDateObj.plus(ticketpass, ChronoUnit.HOURS)); //DK HOW TO CANCEL OF THE SEC COUNT
    
        
        // +++++++++++++++++++ CORRECTION +++++++++++++++++++++
        
        // Ticket custicket = new Ticket(type, quantity, adult, kid, ticketpass, checkin);
        
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++
    }
    
    public static void Confirmation(){
        System.out.print("\t\t CONFIRMATION ORDER \t\t");
        System.out.print("========================================");
        System.out.print("");
        //total payment needed to pay by the customer
        //toString()
    }
    
    public static void Payment(){
        
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = false;
        
        while(shouldContinue == false)
        {
            System.out.print("Enter customer payment type 1.CASH 2.CARD (Enter either 1 digit): ");
            int paymentType = scanner.nextInt();
            if(paymentType != 1 && paymentType != 2){
                System.out.print("Invalid number. Please try again.");
                shouldContinue = false;
            }
            else if(paymentType == '2')
            {
                System.out.print("Enter customer card number: ");
                String cardNo = scanner.nextLine();
                //card validation
            }
        }        
    }
    
    public static void Summary(){
        //to String() 
    }
}

