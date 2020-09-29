package com.dineout.code.model.reporting;

import android.content.Context;

public class EndOfDay_EventHandler{
    private Context context;
    private String email = "";

    int totalSale = 0;
    int totalTax = 0;
    int totalLoss = 0;
    int totalProfit = 0;

    public EndOfDay_EventHandler(Context c, String owner_email){
        if(owner_email == null) email = "robert@gmail.com";
        else email = owner_email;
        this.context = c;
    }

    public EndOfDay_EventHandler(int totalSale, int totalTax, int totalLoss){
        this.totalSale = totalSale;
        this.totalTax = totalTax;
        this.totalLoss = totalLoss;
    }

    public int getProfit(){
        return totalSale-totalTax-totalLoss;
    }

    public int GetWeekDayIndex(String w){
        if(w.equals("Monday")) {return 3;}
        else if(w.equals("Tuesday")) {return 4;}
        else if(w.equals("Wednesday")) {return 5;}
        else if(w.equals("Thursday")){return 6;}
        else if(w.equals("Friday")){return 7;}
        else if(w.equals("Saturday")) {return 1;}
        else return 2;
    }

    public String getDayOfWeek(int value) {
        if(value==1) return "Saturday";
        else if(value==2) return "Sunday";
        else if(value==3) return "Monday";
        else if(value==4) return "Tuesday";
        else if(value==5) return "Wednesday";
        else if(value==6) return "Thursday";
        else if(value==7) return "Friday";
        return "";
    }

}



