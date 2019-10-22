import java.io.File;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;



class RandomWalks {
/*
   takes multiple inputs and does math
   @author  Travis Matos
   @version   1.0 , 10/1/19
 */

public static void main(String[] args){

        /*
           Request and receive (with only 1 Scanner object) the following inputs:
           (First input line:)
           (short)  number of blocks
           (int)    block length in feet
           (float)  walking speed in ft/min.
           (double) maximum red-time in min.
           (Second input line:) Students full name
         */

        Scanner in = new Scanner(System.in);


        System.out.print("Please input the number of blocks, block length (in whole feet), walking speed (as ft per min) and the maximum red-time per traffic signal (as min): ");


        short numberOfBlocks = in.nextShort();
        int blockLength = in.nextInt();//in feet
        float walkingSpeed = in.nextFloat(); //in ft/min.
        double maxRedTime = in.nextDouble(); //in min.

        // short numberOfBlocks = 10;
        // int blockLength = 10;//in feet
        // float walkingSpeed = (float)10.0; //in ft/min.
        // double maxRedTime = 10.0; //in min.
        // in.nextLine();
        // System.out.print("What is your full Name? ");


        // String fullName = in.nextLine();
        String fullName = "Bob Ross";

        /*
           Invokes the 3 calc methods specified above
         */

        float shortestTime = calcShortestTime(blockLength, numberOfBlocks, walkingSpeed);
        // System.out.println(shortestTime);

        float randomTime1 = calcRandomTime(blockLength, numberOfBlocks, walkingSpeed, maxRedTime);
        // System.out.println(randomTime1);

        float randomTime2 = calcRandomTime(blockLength, numberOfBlocks, walkingSpeed, maxRedTime);
        // System.out.println(randomTime2);

        float randomTime3= calcRandomTime(blockLength, numberOfBlocks, walkingSpeed, maxRedTime);
        // System.out.println(randomTime3);

        float longestTime = calcLongestTime(blockLength, numberOfBlocks, walkingSpeed,maxRedTime);
        // System.out.println(longestTime);
        // System.out.print("\n");
        // System.out.printf("%15s", "Trip Description");
        System.out.print("blah");
        System.out.println();




        // PrintWriter writer1 = new PrintWriter(new File(""));
        // writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        // writer1.flush();
        // writer1.close();



}

public static float calcShortestTime(int blockLength, short numberOfBlocks, float walkingSpeed){

        //
        return (float)(blockLength*numberOfBlocks)/walkingSpeed;

}


public static float calcRandomTime(int blockLength, short numberOfBlocks, float walkingSpeed, double maxRedTime){

        return (float)((blockLength*numberOfBlocks)/walkingSpeed)+(float)(Math.random()*maxRedTime*numberOfBlocks);

}

public static float calcLongestTime(int blockLength, short numberOfBlocks, float walkingSpeed, double maxRedTime){

        return (float)((blockLength*numberOfBlocks)/walkingSpeed)+(float)(maxRedTime*numberOfBlocks);

}

}
