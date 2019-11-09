import java.util.Scanner;

public class Assignment2{

    public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    double carPrice=0;
    double downPayment=0;
    int loanPeriod=0;
    double interestRate=0;
    double totalInterest;
    double totalPayment;
    double monthlyPayment;
    int x;
        
    System.out.printf("*********%n");
    System.out.printf("Car Loan Calculator%n");
    System.out.printf("*********%n");

   do{
   System.out.printf("Enter car price (RM30000 and above)   : ");
   carPrice = in.nextDouble();
   if (carPrice>=30000);
   else System.out.println("Please enter the price RM30000 and above");}
   while (carPrice<30000);
   
   do{
   System.out.printf("Enter down payment (RM)               : ");
   downPayment = in.nextDouble();
   if (downPayment>=0);
   else System.out.println("Please enter an correct input");}
   while (downPayment<0);
   
   do{
   System.out.printf("Enter car loan period (5-9years)      : "); 
   loanPeriod = in.nextInt();
   if (loanPeriod>=5 && loanPeriod<=9);
   else System.out.println("Car loan period is between 5 to 9 year!");}
   while (loanPeriod <5||loanPeriod >9);
   
   do{
   System.out.print("Enter the interest rate (3-7%)        : ");
   interestRate = in.nextDouble();
   if (interestRate>=3 && interestRate<=7);
   else System.out.println("Interest rate is between 3-7% !");}
   while (interestRate <3||interestRate >7);
   
   
   totalInterest = (carPrice-downPayment)* (interestRate/100)* loanPeriod;
   totalPayment = (carPrice-downPayment)+totalInterest;
   monthlyPayment = totalPayment/(loanPeriod*12);
   
   System.out.printf("Monthly Repayment : RM %.2f %n", monthlyPayment );
   System.out.printf("%-15s%15s%15s%15s%n","Years","PRINCIPAL(RM)","INTEREST(RM)","BALANCE(RM)");
   
     
   for(x=1;x<=loanPeriod;++x){
   double principal=(totalPayment/loanPeriod)*x;
   double interest=(totalInterest/loanPeriod)*x;
   double balance=totalPayment-(totalPayment/loanPeriod)*x;
   System.out.printf("%-15d%15.2f%15.2f%15.2f%n",x,principal,interest,balance);
   in.close();
   }
   }
}







