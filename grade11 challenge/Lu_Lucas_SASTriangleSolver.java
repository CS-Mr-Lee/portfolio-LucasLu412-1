/**
* Name: Lucas Lu
* Date: Feb.15
* Description: get one angle in radians and two sides from input, create a method and return the smallest angle in degree
*/

import java.util.Scanner;

public class Lu_Lucas_SASTriangleSolver{
     public static void main(String args[]) {
    	 Scanner in = new Scanner(System.in);
    	 
    	 System.out.println("please enter angle in radian between two sides");
    	 double angleGivenInRadian = in.nextDouble();
    	 
    	 System.out.println("Please enter the first side of the triangle");
    	 double firstSideGiven = in.nextDouble();
    	 
    	 System.out.println("please enter the second side of the triangle");
    	 double secondSideGiven = in.nextDouble();
    	 
    	 double smallestAngle = triangleSolver(angleGivenInRadian,firstSideGiven,secondSideGiven);
    	 
    	 System.out.printf("The smallest angle in triangle is: %.2f", smallestAngle);
    	 
    	 
     }
     
     /**
     * convert radian angle to the degree and calculate all angles in the triangle, then return smallest one in degree
     * @param angleRadian  double input value of angle in radian
     * @param side1  the first side beside that angle
     * @param side2  the second side beside that angle
     * @return return smallest angle in degree
     */
     public static double triangleSolver(double angleGivenInRadian, double firstSideGiven, double secondSideGiven) {
         //get the degree of angle given in radian
    	 double angleFirstGiven = angleGivenInRadian;
    	 double firstSideBesideGivenAngle = firstSideGiven;
    	 double secondSideBesideGivenAngle = secondSideGiven;
    	 
         //get the third side and other angles
    	 double ThirdSide = Math.sqrt(Math.pow(firstSideBesideGivenAngle, 2) + Math.pow(secondSideBesideGivenAngle, 2) - (2 * firstSideBesideGivenAngle * secondSideBesideGivenAngle * Math.cos(angleFirstGiven)));
         double secondAngleInRadian = Math.acos((Math.pow(secondSideBesideGivenAngle,2) + Math.pow(ThirdSide,2) - Math.pow(firstSideBesideGivenAngle,2)) / (2 * ThirdSide * secondSideBesideGivenAngle));
         double secondAngleInDegree = secondAngleInRadian * 180 / 3.1415926;  //convert second angle to degree
       
         //convert all angles to the degree
    	 double thirdAngle = 180 - angleFirstGiven - secondAngleInDegree; 
    	 angleFirstGiven = angleFirstGiven * 180 / 3.1415926;  //convert first angle to degree
    	 
         //compare those angles and return the smallest one
    	 if (secondAngleInDegree < angleFirstGiven && secondAngleInDegree < thirdAngle) {
    	   return secondAngleInDegree;
    	 } else if (angleFirstGiven < secondAngleInDegree && angleFirstGiven < thirdAngle) {
    	   return angleFirstGiven;
    	 } else if (thirdAngle < secondAngleInDegree && thirdAngle < angleFirstGiven) {
    	   return thirdAngle;
    	 } 
    	 return 0;
     }
}
