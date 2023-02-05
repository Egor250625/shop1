package com.example.entity;

public class WorkingDay {



        private String date;
        private String profit;
        private int theNumberOfBuyers;
        private int numberOfGoodsSold;

        public WorkingDay(String date,String profit,int theNumberOfBuyers,int numberOfGoodsSold){
            this.date = date;
            this.profit = profit;
            this.theNumberOfBuyers = theNumberOfBuyers;
            this.numberOfGoodsSold = numberOfGoodsSold;
        }
        public void setDate(String date){
            this.date = date;
        }
        public String getDate(){
            return date;
        }


        public void setProfit(String profit){
            this.profit = profit;
        }
        public String getProfit(){
            return profit;
        }


        public void setTheNumberOfBuyers(int theNumberOfBuyers){
            this.theNumberOfBuyers = theNumberOfBuyers;
        }
        public int getTheNumberOfBuyers(){
            return  theNumberOfBuyers;
        }


        public void setNumberOfGoodsSold(int numberOfGoodsSold){
            this.numberOfGoodsSold = numberOfGoodsSold;
        }
        public int getNumberOfGoodsSold(){
            return numberOfGoodsSold;
        }

    }

