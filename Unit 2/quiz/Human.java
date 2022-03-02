/**
* Name: Lucas Lu
* Date: Mar.1
* Description: this human file have three attributes, name, energy, and weight. a constructor Human and several accessors
* run method calculate how many weight lose after km, sleep method calculate how much energy got after hours
*/

public class Human{
   //attributes
   private String name;
   private double weight;
   private int energyLevel;
   
   /**
   * This constructor with no parameter 
   */
   public Human(){
       this.name = "";
       this.energyLevel = -1;
       this.weight = -1;
   }
   
   /**
   * assign the value to each attributes
   * @param name    String type the name of human
   * @param energy  double type the energy of human
   * @param weight  double type the weight of human
   */
   public Human(String name, double weight, int energyLevel){
       this.name = name;
       this.energyLevel = energyLevel;
       this.weight = weight;
   }
   
   /**
   * accessors
   */
   
   /**
   * return the attribute name value
   * @return  return name attributes value
   */
   public String getName(){
       return this.name;
   }
   
   /**
   * return the attributes energy value
   * @return  return attributs energy value
   */
   public int getEnergyLevel(){
       return this.energyLevel;
   }
   
   /**
   * return the attributes weight value
   * @return  return attributes weight value
   */
   public double getWeight(){
      return this.weight;
   }
   
   /**
   * set energylevel always between 0 percent to 100 percent
   * @param energyLevel  int type indicate current energylevel
   */
   public void setEnergyLevel(int energyLevel){
     if (energyLevel > 100){
        this.energyLevel = 100;
     } else if(energyLevel < 0){
        this.energyLevel = 0;
     } else{
        this.energyLevel = energyLevel;
     }
   }
   
   /**
   * calculate how many weight lost after running and energy
   * @param km  double type, how many km is running    
   */
   public void run(double km){
      this.energyLevel = this.energyLevel - (int)(km * 3); //one km will lose 3 percent, because it stored as percentage, so it should be km *3
      this.weight = this.weight - km * 0.001;
      
      //set energyLevel
      setEnergyLevel(this.energyLevel);
   }
   
   /**
   * calculate how much energy get after sleeping
   * @param hours  double type, how many hours is sleeping
   * @return       
   */
   public void sleep(double hours){
       this.energyLevel = this.energyLevel + (int)(hours * 10); //because energylevel stored as a percentage, so one hour boost 10 percent, it should be hours * 10
       
       //set energyLevl
       setEnergyLevel(this.energyLevel);
   }
   
   /**
   * calculate how many energyLevel get and how much weight get
   * @param veg     this is the vegetable object
   * @param grams   double type this is the amount of vegetable eaten
   */
   public void eat(Vegetable veg, double grams){
      this.weight = this.weight + grams; //gain weight
      
      //gain energy from calories
      this.energyLevel = this.energyLevel + (int)(veg.getCalories() / 15);
      
      //if greater than weight, print messages
      if(grams > veg.getWeight()){
         System.out.println("I don’t have that much food");
      }
   }
   
   /**
   * calculate how many carlories we get and how much weight we get
   * @param food   cookie type the object of cookie
   * @param grams  double type the amount of cookie eaten
   */
   public void eat(Cookie food, double grams){
      this.weight = this.weight + grams; //gain weight
      this.energyLevel = this.energyLevel + (int)(food.getCalories() / 15);
      
      //if greater than the wieght,print message
      if(grams > food.getWeight()){
         System.out.println("I don’t have that much food");
      }
      
      if(food.getIsPackaged()){
         System.out.println("I can’t eat the bag");
      }
   }
   
   /**
   * return attributes value
   * @return  return attributes value in order
   */
   public String toString(){
      return ("\nname: " + this.name + "\nenergyLevel: " + this.energyLevel + "\nweight: " + this.weight);
   }
}