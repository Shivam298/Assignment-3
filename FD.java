import java.io.*;
import java.util.*;

class FD{
    int currAmount=0;
    int time;
    public void deposit(int amount,int time){
        currAmount+=amount;
        this.time=time;
        System.out.println("Fixed Deposit created ");
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