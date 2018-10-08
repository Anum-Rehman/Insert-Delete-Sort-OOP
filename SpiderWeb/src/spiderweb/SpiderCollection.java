/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiderweb;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anum
 */
public class SpiderCollection {
    public Spider[] sList;
    int SpiderCounter;
    public SpiderCollection(){
    this.SpiderCounter=0;
}
    public void intialize(int num)
    {
        sList=new Spider[num];
    }
    public void addSpider(int legs,String color,float size){
        sList [this.SpiderCounter]=new Spider (legs,color,size);
        this.SpiderCounter++;
    }
    
    private void increaseSize(){
        Spider[] tempReference=new Spider [this.sList.length*2];
        for (int c=0;c<this.SpiderCounter;c++){
            tempReference [SpiderCounter]=sList[c];
        }
        this.sList=tempReference;
    }
    @Override
    public String toString()
    {
        String fullInfo = "";
        String result = "\n\n-------------------------\n";
        result += "Number of Spiders:" +this.SpiderCounter +"\n";
        result += "        Spider List         \n\n"; 
        
        for (int i=0;i<this.SpiderCounter;i++)
            result += sList[i].toString()  +"\n";
        return result;
    }
     public SpiderCollection sort(Spider[] sList,String usercriteria){
        Spider[] tempoutput =new Spider[sList.length];
        switch (usercriteria){
            
                   case "color":
                   {
                     String [] colorArray=new String [SpiderCounter];
                   for (int i=0; i<SpiderCounter;i++){
                       colorArray[i]=sList[i].getColor();
                   }
                   Arrays.sort(colorArray);
                   for (int i=0;i<SpiderCounter;i++){
                       int Idx=this.Rank(colorArray[i]);
                       tempoutput[i]=new Spider (sList[Idx].getLegs(),sList[Idx].getColor(),sList[Idx].getSize());
                   }
                          break;  
                   }
                   case "size":
                   {
                     float[] sizeArray=new float [SpiderCounter];
                   for (int i=0; i<SpiderCounter;i++){
                       sizeArray[i]=sList[i].getSize();
                   }
                   Arrays.sort(sizeArray);
                   for (int i=0;i<SpiderCounter;i++){
                       int Idx=this.Rank(sizeArray[i]);
                       tempoutput[i]=new Spider (sList[Idx].getLegs(),sList[Idx].getColor(),sList[Idx].getSize());
                   }
                          break;  
}
        }
        SpiderCollection outL =new SpiderCollection();
            outL.sList=tempoutput;
            outL.SpiderCounter=tempoutput.length;
            return outL;
     }
     public Spider search(Spider[] sList,String userchoice){
                Spider[] tempoutput =new Spider[sList.length];
            switch (userchoice){
     case "color,size":{
                    System.out.println("Enter the color & size of the Spider you want to search");
                    System.out.println("Spider Color");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Spider size:");
                    float a=sc.nextFloat();
                    int ind = this.findSpider(line,a);
                if (ind == -1)
                {
                    System.out.println("Student not found");   
                }
                
                else
                    //for (int i=ind+1; i<ObjectCounter; i++)
                {
                   Spider TempSpider = new Spider(this.sList[ind].getLegs(),
                                                              this.sList[ind].getColor(),
                                                              this.sList[ind].getLegs());
                    return TempSpider;
                }
                break; 
     }
             case "color":{
                    System.out.println("Enter the color & size of the Spider you want to search");
                    System.out.println("Spider Color");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    int ind = this.findSpider(line);
                if (ind == -1)
                {
                    System.out.println("Student not found");   
                }
                
                else
                    //for (int i=ind+1; i<ObjectCounter; i++)
                {
                   Spider TempSpider = new Spider(this.sList[ind].getLegs(),
                                                              this.sList[ind].getColor(),
                                                              this.sList[ind].getLegs());
                    return TempSpider;
                }
                break; 
    }
     }
                        return null;
     }
     public boolean deleteSpider(int legs, String color,float size){
         System.out.println("Enter the color,size & legs of the Spider you want to search");
                    System.out.println("Spider Color:");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Spider size:");
                    float a=sc.nextFloat();
                    System.out.println("Spider legs:");
                    int b=sc.nextInt();
         int loc= this.findSpider(line, a, b);
         if (loc== -1){
             System.out.println("Spider not found");
             return false;
         }
         else{
         for (int i=loc+1;i<this.sList.length;i++){
             this.sList[i-1].setLegs(legs);
             this.sList[i-1].setColor(color);
             this.sList[i-1].setSize(size);
         }
         return true;
     }}
     private int findSpider(String color,float size,int legs){
                       for(int i=0;i<SpiderCounter;i++)
                           if (sList[i].getColor().equals(color) && sList[i].getSize()==size && sList[i].getLegs()==legs)
                               return i;
                       return -1;
                   }
     
        private int Rank(String color){
                   int i=0;
                   for (i=0;i<SpiderCounter;i++)
                       if (sList[i].getColor().equals(color))
                       return i; 
                   return -1;
        }
        private int Rank(float size){
                   int i=0;
                   for (i=0;i<SpiderCounter;i++)
                       if (sList[i].getSize()==size)
                       return i; 
                   return -1;
        }
        public int findSpider(String color,float size){
                       for (int i=0;i<SpiderCounter;i++){
                           if (sList[i].getColor().equals(color) && sList[i].getSize()==size)
                            return i;   
                       }
                       return -1;
                   }
                   public int findSpider(String color){
                       for (int i=0;i<SpiderCounter;i++){
                           if (sList[i].getColor().equals(color))
                            return i;   
                       }
                       return -1;
                   }
                   
        }

    






