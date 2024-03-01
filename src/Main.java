import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {

    public static void sort(ArrayList<Player> playerInfo, int size){   //method to sort all the dataset based on the salary and guaranteed payment of the player
        Compare comparator = new Compare();                            //new object for Compare
        boolean checkSort = false;                                     //boolean variable to check if the arrayList is sorted
        int i;

        while (!checkSort) {                                            //iterate until the arrayList is sorted
            checkSort = true;
            for(i=0; i<size-1; i++) {
                if (comparator.compare(playerInfo.get(i), playerInfo.get(i + 1)) > 0) {       //if the first object payment or guarnatted payment is bigger, swap the two player data.
                    swap(playerInfo, i, i + 1);                  //calls swap method
                    checkSort = false;
                }
            }

        }
    }

    public static void swap(ArrayList<Player> playerInfo, int first, int second){   //method for swaping the two object order in the arrayList
        Player infoBank = playerInfo.get(first);                                    //object to temporary store the first object's data

        playerInfo.set(first, playerInfo.get(second));                              //change the first object to second data
        playerInfo.set(second, infoBank);                                           //change the second object to first data using teh infoBank
    }


    public static void main(String[] args){

        //To collect the execution time;
        // use the following lines before and after calling the method
        // you need to compute its execution tim
        long startTime;
        long finishTime;

        FileInputStream file = null;
        FileOutputStream fileOut = null;
        Scanner read;
        PrintWriter write;
        ArrayList<Player> playerInfo = new ArrayList<>();                       //arrayList to store the objects
        Player sportsman;                                                       //objects for the Player class

        try{
            file = new FileInputStream("src/mls-salaries-2014.csv");      //opens the dataset file
            fileOut = new FileOutputStream("sortedDataset.txt");          //opens the file to write on
        }
        catch(FileNotFoundException x){                                         //catch if the file does not exist in src
            System.out.println("Your dataset is not found inside the src");
            System.exit(1);
        }

        read = new Scanner(file);
        write = new PrintWriter(fileOut);
        read.nextLine();

        while(read.hasNextLine()){                                                      //while next line exist in the file
            String line = read.nextLine();                                              //assign the first line into the String variable
            String[] split = line.split(",");                                    //split the line by commas
            char positionC = split[3].charAt(0);                                        //since position datasets are char variable, change the datatype
            double pay = Double.parseDouble(split[4]);                                  //change the datatype into double
            double gPay = Double.parseDouble(split[5]);                                  //change the datatype into double

            sportsman = new Player(split[0], split[1], split[2], positionC, pay,gPay);   //create new object
            playerInfo.add(sportsman);                                                  //assign the object into the arrayList
        }

        startTime =  System.currentTimeMillis();                //measure the starttime of the sort() method
        sort(playerInfo,playerInfo.size());                     //call sort method to sort the arrayList
        finishTime = System.currentTimeMillis();                //measure the finish time


        int i;
        for(i=0; i<playerInfo.size(); i++){
            write.println(playerInfo.get(i).toString());       //print write all the data into the file
        }

        read.close();                                           //closing scanner
        write.close();
        long time = finishTime-startTime;                       //calculate the run time of the sort method()
        System.out.println("The time it took for sort method was " + time + " milliseconds");  //tell the user the runtime

    }
}