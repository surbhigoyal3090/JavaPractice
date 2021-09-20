package com.company;

public class Main {

    public static void main(String[] args) {

        /******************** Inheritance ***************************/
//        Civic civic = new Civic(true);
//        String velocity = civic.changeVelocity(100, "North");
//        System.out.println("Civic car: " + civic.getName() + " and velocity is " + velocity);
//
        /************************** Encapsulation ***********************/
////        Printer printer = new Printer(50, false);
//        Printer printer = new Printer(50, true);
//        System.out.println("initial page count = " +printer.getNumberOfPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getNumberOfPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getNumberOfPagesPrinted());

        /************************** Interface ***********************/
//        Player player = new Player("xyz", 59,8);
//        player.read(player.write());

        /************************ Abstract*****************************/
//        Bird bird = new Bird("Parrot");
//        bird.fly();
//        System.out.println("Abstract Example: " + bird.getName());

        /************************ Generics *************************************/
//        League<Team<FootballPlayer>> footballLeague = new League<>("FootBall");
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
//
//        footballLeague.add(adelaideCrows);
//        footballLeague.add(melbourne);
//
//        footballLeague.showLeagueTable();

        /******************************* Lambda ***********************************/
        LambdaExp lambda = new LambdaExp();
//        lambda.testLambda();
//        lambda.challenge9();

        /******************************** Regular Expressions ***************************/
        RegularExpressions regExp = new RegularExpressions();
//        regExp.challenges();

        /************************************** Threads *********************************/
        BankAccount account = new BankAccount("987946373292", 100);
        Thread t1 = new Thread() {
            public void run(){
                account.deposit(300.00);
                account.withdraw(50.00);
                System.out.println(account.getBalance());
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                account.deposit(200.00);
                account.withdraw(100.00);
                System.out.println(account.getBalance());
            }
        };
        t1.start();
        t2.start();
    }
}
