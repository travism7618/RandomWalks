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

public static void main(String[] args) throws Exception {
        /*
           Request and receive (with only 1 Scanner object) the following inputs:
           (First input line:)
           (short)  number of blocks
           (int)    block length in feet
           (float)  walking speed in ft/min.
           (double) maximum red-time in min.
           (Second input line:) Students full name
         */

        // Scanner in = new Scanner(System.in);
        //
        // System.out.print("Please input the number of blocks, block length (in whole feet), walking speed (as ft per min) and the maximum red-time per traffic signal (as min): ");
        //
        // short numberOfBlocks = in.nextShort();
        // int blockLength = in.nextInt();//in feet
        // float walkingSpeed = in.nextFloat(); //in ft/min.
        // double maxRedTime = in.nextDouble(); //in min.
        //
        // System.out.print("What is your full Name? ");
        // in.nextLine();
        // String fullName = in.nextLine();
        //
        // in.close();


        // For testing purposes

        short numberOfBlocks = 10;
        int blockLength = 10;//in feet
        float walkingSpeed = (float)10.0; //in ft/min.
        double maxRedTime = 10.0; //in min.
        String fullName = "Bob Ross";


        /*
           Invokes the 3 calc methods specified above
         */

        // System.out.println(fullName);
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

        /*
           Individual:   Morris Badrian
           Number of blocks: 10,   Block Length: 500 ft,  Walking Speed: 175 ft/min., Maximum Red-Time per signal: 0.75 min.

           Trip Description	   Duration (minutes)
           _________________   __________________
           Shortest Possible	28.6
           Random 1	34.8
           Random 2	35.3s
           Random 3	31.0
           Longest Possible	35.3

         */




        PrintStream ps  = new PrintStream("RandomWalks.txt");
        ps.printf("%-15s%s \n","Individual:",fullName);
        ps.printf("Number of blocks: %d,   Block Length: %d ft,  Walking Speed: %d ft/min., Maximum Red-Time per signal: %f min. \n",numberOfBlocks,blockLength,(int)walkingSpeed,maxRedTime);
        ps.printf("%-25s%s \n","Trip Description","Duration (minutes)");
        ps.printf("%-25s%s \n", "_________________","_________________");
        ps.printf("%-25s%.1f \n","Shortest Possible",shortestTime);
        ps.printf("%-25s%.1f \n","Random 1",randomTime1);
        ps.printf("%-25s%.1f \n","Random 2",randomTime2);
        ps.printf("%-25s%.1f \n","Random 3",randomTime3);
        ps.printf("%-25s%.1f \n","Longest Possible",longestTime);
        ps.close();

        System.out.printf("%-15s%s \n","Individual:",fullName);
        System.out.printf("Number of blocks: %d,   Block Length: %d ft,  Walking Speed: %d ft/min., Maximum Red-Time per signal: %f min. \n",numberOfBlocks,blockLength,(int)walkingSpeed,maxRedTime);
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
        return (float)(blockLength*numberOfBlocks)/walkingSpeed;

}


public static float calcRandomTime(int blockLength, short numberOfBlocks, float walkingSpeed, double maxRedTime){
        return (float)((blockLength*numberOfBlocks)/walkingSpeed)+(float)(Math.random()*maxRedTime*numberOfBlocks);
}


public static float calcLongestTime(int blockLength, short numberOfBlocks, float walkingSpeed, double maxRedTime){
        return (float)((blockLength*numberOfBlocks)/walkingSpeed)+(float)(maxRedTime*numberOfBlocks);

}

}
