package com.example.main;



import com.example.entity.WorkingDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Choose the number of the date,you want too see information of *****");
        System.out.println("|01.02.23| - 1 ");
        System.out.println("|02.02.23| - 2 ");
        System.out.println("|03.02.23| - 3 ");
        System.out.println("|04.02.23| - 4 ");
        int num = scanner.nextInt();

        switch (num) {

            case 1:
                System.out.println("*****   Day in the shop   *****");
                WorkingDay workingDay = new WorkingDay("01.02.23", "+73$", 124, 567);
                workingDay.setDate("01.02.23");
                workingDay.getDate();
                System.out.println("|date| " + workingDay.getDate());

                workingDay.setProfit("+73$");
                workingDay.getProfit();
                System.out.println("|profit of the day| " + workingDay.getProfit());

                workingDay.setTheNumberOfBuyers(124);
                workingDay.getTheNumberOfBuyers();
                System.out.println("|Persons who visited this shop during the day | " + workingDay.getTheNumberOfBuyers());

                workingDay.setNumberOfGoodsSold(567);
                workingDay.getNumberOfGoodsSold();
                System.out.println("|Number of goods which was sold during the day | " + workingDay.getNumberOfGoodsSold());
                break;

            case 2:
                System.out.println("*****   Day in the shop   *****");
                WorkingDay workingDay1 = new WorkingDay("02.02.23", "+123$", 178, 737);
                workingDay1.setDate("02.02.23");
                workingDay1.getDate();
                System.out.println("|date| " + workingDay1.getDate());

                workingDay1.setProfit("+123$");
                workingDay1.getProfit();
                System.out.println("|profit of the day| " + workingDay1.getProfit());

                workingDay1.setTheNumberOfBuyers(178);
                workingDay1.getTheNumberOfBuyers();
                System.out.println("|Persons who visited this shop during the day | " + workingDay1.getTheNumberOfBuyers());

                workingDay1.setNumberOfGoodsSold(737);
                workingDay1.getNumberOfGoodsSold();
                System.out.println("|Number of goods which was sold during the day | " + workingDay1.getNumberOfGoodsSold());
                break;


            case 3:
                System.out.println("*****   Day in the shop   *****");
                WorkingDay workingDay2 = new WorkingDay("03.02.23", "+191$", 211, 651);
                workingDay2.setDate("03.02.23");
                workingDay2.getDate();
                System.out.println("|date| " + workingDay2.getDate());

                workingDay2.setProfit("+191$");
                workingDay2.getProfit();
                System.out.println("|profit of the day| " + workingDay2.getProfit());

                workingDay2.setTheNumberOfBuyers(211);
                workingDay2.getTheNumberOfBuyers();
                System.out.println("|Persons who visited this shop during the day | " + workingDay2.getTheNumberOfBuyers());

                workingDay2.setNumberOfGoodsSold(651);
                workingDay2.getNumberOfGoodsSold();
                System.out.println("|Number of goods which was sold during the day | " + workingDay2.getNumberOfGoodsSold());
                break;

            case 4:
                System.out.println("*****   Day in the shop   *****");
                WorkingDay workingDay3 = new WorkingDay("04.02.23", "+98$", 98, 215);
                workingDay3.setDate("04.02.23");
                workingDay3.getDate();
                System.out.println("|date| " + workingDay3.getDate());

                workingDay3.setProfit("+98$");
                workingDay3.getProfit();
                System.out.println("|profit of the day| " + workingDay3.getProfit());

                workingDay3.setTheNumberOfBuyers(98);
                workingDay3.getTheNumberOfBuyers();
                System.out.println("|Persons who visited this shop during the day | " + workingDay3.getTheNumberOfBuyers());

                workingDay3.setNumberOfGoodsSold(215);
                workingDay3.getNumberOfGoodsSold();
                System.out.println("|Number of goods which was sold during the day | " + workingDay3.getNumberOfGoodsSold());
                break;

        }


    }

}
