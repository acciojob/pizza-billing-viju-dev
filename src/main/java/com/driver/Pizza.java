package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300; // veg pizza price
            this.bill = "Base Price Of The Pizza: 300\n";
        }
        else {
            this.price = 400; // non-veg pizza price
            this.bill = "Base Price Of The Pizza: 400\n";
        }
        return;
    }

    public int getPrice(){

//        this.bill += this.price;
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price += 80;
        this.bill += "Extra Cheese Added: 80\n";
        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if (isVeg){
            this.price += 70;
            this.bill += "Extra Toppings Added: 70\n";

        }
        else {
            this.price += 120;
            this.bill += "Extra Toppings Added: 120\n";
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        this.price += 20;
        this.bill += "Paperbag Added: 20\n";
        return;
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+this.price+"\n";
        return this.bill;
    }
}
