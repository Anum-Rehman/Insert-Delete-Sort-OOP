/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiderweb;

import java.util.Scanner;

/**
 *1
 * @author Anum
 */
public class SpiderWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SpiderCollection oop=new SpiderCollection();
        try (Scanner sc=new Scanner (System.in)){
        final int mainmenuselection=askuserforchoice(sc,"1-Input,2-Rank Spider,3-Search Spider,4-Delete Spider",4);
        switch (mainmenuselection){
            case 1:{
        System.out.println("How many Spider info you want to enter??");
        int num=sc.nextInt();
        oop.intialize(num);
        String line =sc.nextLine();
        for (int i=0;i<num;i++){
        System.out.println("Enter Spider Info:\t legs\t color\t size");
        line =sc.nextLine();
        String [] split=line.split(" ");
        oop.addSpider(Integer.parseInt(split[0]),split[1], Float.parseFloat(split[2]));
        }
        System.out.println("Input successful and shown below");
        System.out.println(oop);
        break;
        }
            case 2:{
                System.out.println("How many Spider info you want to sort??");
        int num=sc.nextInt();
        oop.intialize(num);
        String line =sc.nextLine();
        for (int i=0;i<num;i++){
        System.out.println("Enter Spider Info:\t legs\t color\t size");
        line =sc.nextLine();
        String [] split=line.split(" ");
        oop.addSpider(Integer.parseInt(split[0]),split[1], Float.parseFloat(split[2]));
        }
        System.out.println("Input successful and shown below before Ranking");
        System.out.println(oop);
        System.out.println("Enter criteria for ranking \t color \t size");
        line =sc.nextLine();
           String[] split=line.split(" ");
           SpiderCollection c=oop.sort(oop.sList, split[0]);
           System.out.println(c);
           break;       
            }
            case 3:
    {
        System.out.println("How many Spider info you want to enter??");
        int num=sc.nextInt();
        oop.intialize(num);
        String line =sc.nextLine();
        for (int i=0;i<num;i++){
        System.out.println("Enter Spider Info:\t legs\t color\t size");
        line =sc.nextLine();
        String [] split=line.split(" ");
        oop.addSpider(Integer.parseInt(split[0]),split[1], Float.parseFloat(split[2]));
        }
        System.out.println("Input successful and shown below");
        System.out.println(oop);
        System.out.println("Enter criteria for searching \t color,size \t color");
        line =sc.nextLine();
           String[] split=line.split(" ");
           Spider c=oop.search(oop.sList, line);
           System.out.println(c);
           break;       
            }
            case 4:{
        System.out.println("How many Spider info you want to enter??");
        int num=sc.nextInt();
        oop.intialize(num);
        String line =sc.nextLine();
        for (int i=0;i<num;i++){
        System.out.println("Enter Spider Info:\t legs\t color\t size");
        line =sc.nextLine();
        String [] split=line.split(" ");
        oop.addSpider(Integer.parseInt(split[0]),split[1], Float.parseFloat(split[2]));
        }
        System.out.println("Input successful and shown below");
        System.out.println(oop);
        System.out.println("Enter Spider info you want to delete");
           String[] split=line.split(" ");
            boolean c=oop.deleteSpider(num, line, num);
           System.out.println(c);
           break;         
            }
    }
}

            }
        
public static int askuserforchoice (Scanner sc,String prompt,int maxvalue){
System.out.println("Please select menu item");
System.out.println(prompt);
int value=sc.nextInt();
while (value<1|| value>maxvalue){
System.out.println ("invalid menu item, please try again");
value=sc.nextInt();}

return value;
}
}

       
    
    


