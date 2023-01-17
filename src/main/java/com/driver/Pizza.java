package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean ischeese = false;
    private boolean istoppings = false;
    private boolean ispaperbag = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300; // veg pizza price
//            String base = "Base Price Of The Pizza: 300\n";
        }
        else {
            this.price = 400; // non-veg pizza price
//            String base = "Base Price Of The Pizza: 400\n";
        }
        return;
    }

    public int getPrice(){

//        this.bill += this.price;
        return this.price;
    }
//    public int setPrice(int price){ // to set pizza price from deluxe
//
////        this.bill += this.price;
//        this.price += price;
//        return this.price;
//    }

    public void addExtraCheese(){
        // your code goes here
        if(this.ischeese == false){
            this.ischeese = true;
            this.price += 80;
//            String cheese = "Extra Cheese Added: 80\n";
        }

        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if (isVeg && this.istoppings == false){
            this.istoppings = true;
            this.price += 70;
//            String toppings = "Extra Toppings Added: 70\n";

        }
        else if (!isVeg && this.istoppings ==false){
            this.istoppings = true;
            this.price += 120;
//            String toppings = "Extra Toppings Added: 120\n";
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if (this.ispaperbag == false){
            this.ispaperbag = true;
            this.price += 20;
//            String paperbag = "Paperbag Added: 20\n";
        }

        return;
    }

    public String getBill(){
        // your code goes here
        this.bill =("Base Price Of The Pizza: "+(isVeg?300:400)+"\nExtra Cheese Added: 80\nExtra Toppings Added: "+(isVeg?70:120)+(ispaperbag?"\nPaperbag Added: 20":"")+"\nTotal Price: "+this.price+"\n");
        return this.bill;
    }
}
