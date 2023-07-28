import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ATM {
   public static void Transaction_Reciept()
   {
    String encoding = "Cp1250";
   File file = new File("ATM.txt");

    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding))) {
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
   }
    public static void main(String[] args){
        System.out.println("....Welcome to the ABC ATM...   \n");
        System.out.print("Select your choice \n 1.Withdraw \n 2.Deposit \n 3. Transaction_Details \n 4. Exit");
        int balance=20000,choice=0,withdraw=0,deposit=0;
        
        Scanner sc=new Scanner(System.in);
       
        while(choice!=4)
        {
        choice=sc.nextInt();
        switch(choice)
        {
          case 1:
          System.out.println("Enter the amount to withdraw :");
          withdraw=sc.nextInt();
          balance=balance-withdraw;
            try(FileWriter fw = new FileWriter("ATM.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.println("Withdraw = " +String.valueOf(withdraw)+"\n"+"balance = "+String.valueOf(balance));

} catch (IOException e) {
    
   }
          break;
          case 2:
          System.out.println("Enter the amount to deposit :");
          deposit=sc.nextInt();
          balance=balance+deposit;
            try(FileWriter fw = new FileWriter("ATM.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.println("Deposit = " +String.valueOf(deposit)+"\n"+"balance ="+String.valueOf(balance));

} catch (IOException e) {
    e.printStackTrace();
   }
          break;
          case 3:
          Transaction_Reciept();
          break;
          case 4:
          System.exit(0);
          break;



        }
        
    }
    sc.close();
    }
}
