package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int tag;
    private int priceArray[];

    public Pizza(int tag,Boolean isVeg){
        this.tag=tag;
        this.isVeg = isVeg;
        this.priceArray=new int[5];
        if(tag==0)
        {
            //regular pizza, then
            this.price=300;
            priceArray[0]=300;
            priceArray[4]+=300;
        }
        else
        {   //deluxe pizza
            this.price=400;
            priceArray[0]=400;
            priceArray[4]+=400;
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       //cheese price is 80
      priceArray[1]+=80;
      priceArray[4]+=80;
    }

    public void addExtraToppings(){
        //check whether pizza is veg or non veg
        if(isVeg==true){
            //pizza is veg, add 70 rupees
            priceArray[2]+=70;
            priceArray[4]+=70;
        }
        else{
            //pizza is non veg ,add 120 rupees
            priceArray[2]+=120;
            priceArray[4]+=120;
        }
    }

    public void addTakeaway(){
      // adding takeaway means taking paper bag
        priceArray[3]+=20;
        priceArray[4]+=20;
    }

    public String getBill(){
        String s="";
        s+="Base Price Of The Pizza: "+priceArray[0]+"\n";
        if(priceArray[1]!=0)
          s+="Extra Cheese Added: "+priceArray[1]+"\n";
        if(priceArray[2]!=0)
          s+="Extra Toppings Added: "+priceArray[2]+"\n";
        if(priceArray[3]!=0)
           s+="Paperbag Added: 20\n";
        s+="Total Price: "+priceArray[4]+"\n";
        this.bill=s;
        return this.bill;
    }
}
