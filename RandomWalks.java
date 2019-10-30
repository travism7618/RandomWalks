import java.io.File;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;


class RandomWalks {
/*
   calculates several possible times that it would take for a student to walk to class by taking the number of blocks the person walks, the block length in feet, the speed at which they walk and the max time they would walk and then outputs that information
   @author  Travis Matos
   @version   1.0 , 10/1/19
 */

public static void main(String[] args) throws Exception {
        /*
           This method requests and receive (with only 1 Scanner object) the following inputs:
           (short)  number of blocks
           (int)    block length in feet
           (float)  walking speed in ft/min.
           (double) maximum red-time in min.
           (Second input line:) Students full name
         */

        // creates new Scanner object
        Scanner in = new Scanner(System.in);

        // Asks user for number of blocksblock length in feet, walking speed in ft/min, and maximum red-time in min  and stores it within their respective variables

        System.out.print("Please input the number of blocks, block length (in whole feet), walking speed (as ft per min) and the maximum red-time per traffic signal (as min): ");
        // invokes methods from scanner object to receive data from user
        short numberOfBlocks = in.nextShort();
        int blockLength = in.nextInt();//in feet
        float walkingSpeed = in.nextFloat(); //in ft/min.
        double maxRedTime = in.nextDouble(); //in min.

        // Asks for user's name and stores it wihin another variable
        System.out.print("What is your full Name? ");
        // avoids the scanner bug by moving the scanner to another new line
        in.nextLine();
        String fullName = in.nextLine();
        in.close();

        /*
           Invokes the 3 calc methods specified below main method and stores them within different variables
         */
        float shortestTime = calcShortestTime(blockLength, numberOfBlocks, walkingSpeed);

        float randomTime1 = calcRandomTime(blockLength, numberOfBlocks, walkingSpeed, maxRedTime);
        float randomTime2 = calcRandomTime(blockLength, numberOfBlocks, walkingSpeed, maxRedTime);
        float randomTime3= calcRandomTime(blockLength, numberOfBlocks, walkingSpeed, maxRedTime);

        float longestTime = calcLongestTime(blockLength, numberOfBlocks, walkingSpeed,maxRedTime);

        // creates new PrintStream object for the file "RandomWalks.txt" in order to output information into said file.

        PrintStream ps  = new PrintStream("RandomWalks.txt");
        ps.printf("%-15s%s \n","Individual:",fullName);
        ps.printf("Number of blocks: %d,   Block Length: %d ft,  Walking Speed: %d ft/min, Maximum Red-Time per signal: %f min. \n",numberOfBlocks,blockLength,(int)walkingSpeed,maxRedTime);
        ps.printf("%-25s%s \n","Trip Description","Duration (minutes)");
        ps.printf("%-25s%s \n", "_________________","_________________");
        ps.printf("%-25s%.1f \n","Shortest Possible",shortestTime);
        ps.printf("%-25s%.1f \n","Random 1",randomTime1);
        ps.printf("%-25s%.1f \n","Random 2",randomTime2);
        ps.printf("%-25s%.1f \n","Random 3",randomTime3);
        ps.printf("%-25s%.1f \n","Longest Possible",longestTime);
        ps.close();

        // outputs information to system terminal as well
        System.out.printf("%-15s%s \n","Individual:",fullName);
        System.out.printf("Number of blocks: %d,   Block Length: %d ft,  Walking Speed: %d ft/min, Maximum Red-Time per signal: %.2f min. \n",numberOfBlocks,blockLength,(int)walkingSpeed,maxRedTime);
        System.out.printf("%-25s%s \n","Trip Description","Duration (minutes)");
        System.out.printf("%-25s%s \n", "_________________","_________________");
        System.out.printf("%-25s%.1f \n","Shortest Possible",shortestTime);
        System.out.printf("%-25s%.1f \n","Random 1",randomTime1);
        System.out.printf("%-25s%.1f \n","Random 2",randomTime2);
        System.out.printf("%-25s%.1f \n","Random 3",randomTime3);
        System.out.printf("%-25s%.1f \n","Longest Possible",longestTime);
        System.out.close();


}

public static float calcShortestTime(int blockLength, short numberOfBlocks, float walkingSpeed){
        // block length multiplied by the number of blocks is equaled to the distance
        // distance divided by speed is equivalent to the time it tkaes.
        return (float)(blockLength*numberOfBlocks)/walkingSpeed;


}


public static float calcRandomTime(int blockLength, short numberOfBlocks, float walkingSpeed, double maxRedTime){
        return (float)((blockLength*numberOfBlocks)/walkingSpeed)+(float)(Math.random()*maxRedTime*numberOfBlocks);
        // the time it takes waiting per block randomized * all blocks + the time it takes to travel  = total time
}


public static float calcLongestTime(int blockLength, short numberOfBlocks, float walkingSpeed, double maxRedTime){
        return (float)((blockLength*numberOfBlocks)/walkingSpeed)+(float)(maxRedTime*numberOfBlocks);
        // the maximum time it would take waiting per block * all blocks + the time it takes to travel  = total time

}

}
