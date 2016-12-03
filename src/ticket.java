/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jomana
 */
public class Requirment {
    public static  int luggageWeight;
    public static int NoOfBagPieces=2;
    public static int NoOfHandBagPieces=2;
    private int NoOfBabies;
    private int NoOfChildren;
    private int NoOfAdults;
    private String Class ;
    public int LuggageWeight(String Class){
        if(Class=='Firstclass'){
        return 50;
        }
        else if(Class=='Bussinessclass')
        {
            return 40;
        }
        else if(Class=='Economyclass')
        {
            return 23;
        }
    }
    
    public void calcExtraWeight(int weight){
       if(weight>23){
         System.out.println("There is overweight you have to pay 5$ on every extraweight");
       }
    }
    public void setNoOfAdults(int NoOfadults){
        NoOfAdults=NoOfadults;
    }
     public void setNoOfbabies(int NoOfbabies){
        NoOfBabies=NoOfbabies;
    }
    public void setNoOfChildren(int NoOfchildren){
        NoOfChildren=NoOfchildren;
    }
    public void setClass(String cClass){
        Class=cClass;
    }
    public int getNoOfAdults(){
        return NoOfAdults;
    }
    public int getNoOfBabies(){
        return NoOfBabies;
    }
    public int getNoOfChildren(){
        return NoOfChildren;
    }
    public String getClass(){
        return Class;
    }
    
    }
    

public class ticket {
    private int currentPrice;
    private int price;
   public int calcCurrentPrice(String Class){
       if(Class=='Firstclass'){
       return 4000;
        }
       else if(Class=='Bussinessclass'){
             return 3000;
       }
       else if(Class=='Economyclass'){
              return 2000;
       }
    }
   //public int Adultsprice(int NoOfAdults){
    
   }
   //public int ChildrenPrice(int NoOfChildren){
       
   }
   //public int calcBabiesPrice (int NoOfBabies){
       
   }   
}
public class ExtraRequirment{
   private int price;
   //private int calaPrice()
}
public class pets{
    private float maxWeight;
    private float[3] cageDimentions;
    public void setMaxWeight(float MaxWeight){
       maxWeight=MaxWeight;
    }
    public void setCageDimention(float CageDimentions[3]){
        cageDimentions=CageDimentions[3];
    }
    public float getMaxWeight(){
        return maxWeight;
    }
    public float[3] getCageDimention(){
        return cageDimentions;
    }
    public int calcExtraWeight(int weight){
        if(weight>5){
         System.out.println("There is overweight you have to pay 20$ on every extraweight");
    }
 }
    public class carRent{
        private String pickUpLocation;
       private Date.pickUpDay;
       private Date.dropOfDay;
       private float pickUpTime;
       private float dropOfTime;
       public void setPickUpLocation( String PickUpLocation ) {
           pickUpLocation=PickUpLocation;
       }
       //public void setPickUpDay( Date PickUpDay ) {
           pickUpDay=PickUpDay;
     //  }
       //public void setDropOfDay ( Date dropOfDay ) {
           dropOfDay=dropOfDay;
       //}
       public void setPickUpTime ( float PickUpTime ) {
           pickUpTime=PickUpTime;
       }
       public void setDropOfTime ( float DropOfTime ) {
           dropOfTime=DropOfTime;
       }
       public String getPickUpLocation () {
          return pickUpLocation;
       }
       public Date getPickUpDay (){
           return pickUpDay;
       } 
       public Date getDropOfDay (){
           return dropOfDay;
       }
       public float getPickUpTime () {
           return pickUpTime;
       }
       public float getDropOfTime () {
           return dropOfTime;
       }
    }
    public class Hotel {
        String name;
        String destination;
        int NoOfAdults;
        int NoOfChidren;
        Date checkInDate;
        Date checkoutDate;
        int NoOfSingleRooms ;
        int NoOfDoupleRooms;
        int currentPrice; 
        public void setName ( String name ) {
            this.name=name;
        }
        public void setDestination ( String destination ) {
            this.destination=destination;
        }
        }


