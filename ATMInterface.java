package TASK3;

import java.util.*;

public class ATMInterface{
    public static void main(String[] args) {
        Operations start = new Operations();
    }
}
class Data{
    int balance;
}

class Operations {
    HashMap<Integer , Data >  map  = new HashMap<>();
    Scanner read = new Scanner(System.in);
    Operations(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Welcome~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        op();
    }

    public void op(){
        System.out.println("enter valid pin");

        int pin = read.nextInt();

        if(map.containsKey(pin)){
            Data obj = map.get(pin);
            menu(obj);
        }else{
            System.out.println("please create account first ");
            System.out.println("set pin code");
            System.out.println("set a four digit pin ");

            int newpin = read.nextInt();

            Data obj = new Data();
            if(Integer.toString(newpin).length() == 4){
                obj.balance = 0;
                map.put(newpin , obj);
                menu(obj);
            }
            else{
                System.out.println("Invalid pin");
            }
        }
    }


    public void menu(Data obj){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Options");

        System.out.println("1 . check balance");
        System.out.println("2 . withdraw money");
        System.out.println("3 . deposit money");
        System.out.println("4 . exit");
        System.out.println("5 . check another account");
        System.out.println("Enter your choice");
        int x = read.nextInt();

        if(x == 1){
            check_balance(obj);
        }
        else if(x==2){
            withdraw(obj);
        }
        else if(x==3){
            deposit(obj);
        }
        else if(x == 4){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~thank you~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }else if(x == 5){
//            Operations obj = new Operations();
            op();
        }
        else{
            System.out.println("enter valid option");
            menu(obj);
        }
    }

    public void check_balance(Data obj){
        System.out.println("your current balance is " + obj.balance);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        menu(obj);
    }

    public void deposit(Data obj){
        System.out.println("enter the amount ");
        float d = read.nextFloat();
        obj.balance += d;
        System.out.println("amount deposited successfully ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        menu(obj);
    }

    public void withdraw(Data obj){
        System.out.println("enter the amount ");
        float d = read.nextFloat();
        if(d > obj.balance) {System.out.println("insufficient balance"); menu(obj);}
        obj.balance -= d;
        System.out.println("amount withdrawn successfully ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        menu(obj);
    }


}