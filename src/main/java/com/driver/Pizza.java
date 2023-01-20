package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private  int tappingPrice;
    private int takeAwayPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraTappingAdded;
    private  boolean isGiveAwayAdded;
    private boolean isBillPrinted;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded=false;
        this.isExtraTappingAdded=false;
        this.isBillPrinted=false;
        this.isGiveAwayAdded=false;
        this.bill="";
        if(isVeg){
            this.price=300;
            this.tappingPrice=70;
        }
        else{
            this.price=400;
            this.tappingPrice=120;
        }
        this.cheesePrice=80;
        this.takeAwayPrice=20;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.price+=this.cheesePrice;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){

        if(!isExtraTappingAdded){
            this.price+=this.tappingPrice;
            isExtraTappingAdded=true;
        }
    }

    public void addTakeaway(){
        if(!isGiveAwayAdded){
            this.price+=this.takeAwayPrice;
            isGiveAwayAdded=true;
        }
    }

    public String getBill(){
        if(!isBillPrinted){
            if(isExtraCheeseAdded) this.bill+="Extra Cheese Added: "+this.cheesePrice+"\n";
            if(isExtraTappingAdded) this.bill+="Extra Toppings Added: "+this.tappingPrice+"\n";
            if(isGiveAwayAdded) this.bill+="Paperbag Added: "+this.takeAwayPrice+"\n";
            this.bill+="Total Price: "+this.price+"\n";
            isBillPrinted=true;
        }

        return this.bill;
    }
}
