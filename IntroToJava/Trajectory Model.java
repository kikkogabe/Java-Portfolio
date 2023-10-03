/**
 * Program that given a distance, solves the best launch angle and initial speed. 
 * 
 * @author Gabe Azzarita
 * @version 20221005
 **/

import java.util.Scanner;

public class TrajectoryModeling {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //Defining and initialzing variables
      double userDistance;
      double speed = 1.00;
      double angle = 25.00;
      double time = 0.00;
      double calcDistance;
      double difference;
      double bestDistance = 0.00;
      double bestSpeed = 0.00;
      double bestAngle = 0.00;

      //Prompting user for distance
      System.out.print ("Enter a distance to target: ");
      userDistance = input.nextDouble();
      difference = userDistance;
      System.out.println ();
      input.close ();
      
      //Nested loops that tests speeds 1-30 for angles 25-90 (increment by 5)  
      while (angle <= 90) {
         speed = 1.00;
         while (speed <= 30) {
            time = (2 * (speed) * (Math.sin(Math.toRadians(angle))));
            time = (time / 9.8);
            calcDistance = (speed * time * (Math.cos(Math.toRadians(angle))));   
            if (Math.abs(userDistance - calcDistance) < difference) {
               difference = Math.abs(userDistance - calcDistance);
               bestDistance = calcDistance;
               bestSpeed = speed;
               bestAngle = angle;
            }
            speed += 1.00;
         }
         angle += 5.00;
      }

      //Concluding statements
      System.out.format ("Best angle: %.2f%n", bestAngle);
      System.out.format ("Best speed: %.2f%n", bestSpeed);
      System.out.format ("Distance travelled: %.2f%n", bestDistance);
      System.out.format ("Missed the target center by: %.2f%n", difference);
    }
}