/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package TestKata;
 
/**
*
* @author samuel.oyediran
*/
public class DirReduction {
//    public static String[] dirReduc(String[] arr) {
//        // Your code here.
//        int countWest=0;
//        int countNorth = 0;
//       
//        for (String currentDirection: arr)
//        {  
//            switch(currentDirection)
//            {
//                case "WEST": countWest++;
//                    break;
//                case "EAST": countWest--;
//                    break;
//                case "NORTH": countNorth++;
//                    break;
//                case "SOUTH": countNorth--;
//                    break;                   
//            }
//        }
//       // String[] reducedDirection = new String[Math.abs(countWest)+Math.abs(countNorth)];
//       // for(int i)
//       
//        return new String[] {};
//    }
   
    public static String[] dirReduc(String[] arr){
        String arrString= String.join(" ", arr);
//        String pattern="(.*)(NORTH,SOUTH|SOUTH,NORTH)(.*)";
//        String pattern2="(.*)(EAST,WEST|WEST,EAST)(.*)";
//        int length = arrString.length();
//        String temp = arrString.replaceAll(pattern, "$1$3");
//        System.out.println(temp);
//        temp = temp.replaceAll(pattern2, "$1$3");
//        System.out.println(temp);
//        temp= temp.replaceAll(pattern, "$1$3");
//        System.out.println(temp);
//        String pattern = "((.*)(NORTH)(\\s+)(SOUTH)(.*))|((.*)(SOUTH)(\\s+)(NORTH)(.*))"
//                                + "|((.*)(EAST)(\\s+)(WEST)(.*)|(.*)(WEST)(\\s+)(EAST)(.*))";
        String pattern = "(.*)(NORTH\\s+SOUTH|SOUTH\\s+NORTH)(.*)";
        String pattern2= "(.*)(WEST\\s+EAST|EAST\\s+WEST)(.*)";
        int stringLength= arrString.length();
        System.out.println(arrString.replaceAll(pattern, "$1$3"));
        while(true)
        {
//            arrString.re
        }
       
    }
   
    public static void main(String... args){
       // System.out.println(String.join(",",new String[]{"NORTH","SOUTH","WEST","EAST"}));
        DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
    }
}

 