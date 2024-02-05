import java.io.*;
import java.util.*;

class Savings{
    int currAmount=0;
    public void deposit(int amount){
        currAmount+=amount;
        System.out.println("Amount Deposited. Current Balance is "+currAmount);
    }
    public void withdraw(int amount){
        if(amount<=currAmount){
            currAmount-=amount;
            System.out.println("Amount Withdrwan. Current Balance is "+currAmount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}