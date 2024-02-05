import java.io.*;
import java.util.*;

class Bank{
    public static void main(String[] args){
       Savings saving=new Savings();
	   saving.deposit(4500);
	   saving.withdraw(1500);
	   FD fd=new FD();
	   fd.deposit(1500,3);
	   fd.withdraw(3000);
	   Demat demat=new Demat();
	   demat.withdraw(1000);
	   Current current=new Current();
	   current.deposit(10000);
	   current.withdraw(5000);
	   current.withdraw(12000);

    }
    }
