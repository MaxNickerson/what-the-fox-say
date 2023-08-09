import java.util.*;
import java.io.*;

public class Fox {
    public static void main(String args[]) throws IOException { 

        Scanner sc = new Scanner(System.in);
        ArrayList<String> recordings = new ArrayList<String>(); // stores the recordings (i.e. toot woot toot)
        ArrayList<String> words = new ArrayList<String>();

        int recNum = Integer.parseInt(sc.nextLine()); // int that stores number of recordings

        for (int i = 1; i < recNum + 1; i++) // for loop that adds each recording to a ArrayList type string
        {
            String rec = sc.nextLine();
            recordings.add(rec);
        }

        // words = convertString(words); // points to a method that convert inputed animal noises to Strings and appends them to an arrayList

        while (sc.hasNextLine()) // checkin each line for animal noises to remove, same as commented out method call
        {
            String animal_goes =  sc.nextLine(); 
            String[] animal = animal_goes.split(" "); 
            List<String> animals = new ArrayList<>(Arrays.asList(animal)); // converts from string to Array to ArrayList

            if (animals.contains("fox"))
            { //break and return ArrayList
                break;
            }
            else if (animals.contains("goes")) 
            { // making sure the string contains the goes, so it can assign a noise to an animal
                words.add(animals.get(animals.size() - 1)); //adding the animal noise to a arraylist type string
            }
            

        }

        for (int i = 0; i < recordings.size(); i++) // splits each string recording and adds it to ArrayList String (local to for loop)
        // while (sc.hasNextLine()) 
        { 
            // String[] noises = sc.nextLine().split(" "); // converting to Array 
            String[] noises = recordings.get(i).split(" "); // converting to Array
            List<String> animal_noises = new ArrayList<>(Arrays.asList(noises)); // converting to ArrayList

            animal_noises.removeAll(words); // removes every word from the recording

            for (int k = 0; k < animal_noises.size(); k++) // print fox noises
            {
                if (k == animal_noises.size() - 1)
                {
                    System.out.print(animal_noises.get(k)); 
                    break;
                }
                else 
                {
                    System.out.print(animal_noises.get(k) + " ");
                }
            }
            System.out.println();

        }   


    }

    // somehow calling this method instead of having it in main broke the autochecker so I'll just keep this here to look back on
    // public static ArrayList<String> convertString(ArrayList<String> words) { // Converts animal words to an ArrayList
    //     Scanner sc = new Scanner(System.in);

    //     while (sc.hasNextLine())
    //     {
    //         String animal_noise =  sc.nextLine();
    //         String[] noises = animal_noise.split(" "); 
    //         List<String> animals = new ArrayList<>(Arrays.asList(noises)); // converts from string to Array to ArrayList

    //         if (animals.contains("fox"))
    //         { //break and return ArrayList
    //             break;
    //         }
    //         else if (animals.contains("goes")) 
    //         { // making sure the string contains the goes, so it can assign a noise to an animal
    //             words.add(animals.get(animals.size() - 1)); //adding the animal noise to a arraylist type string
    //         }
            

    //     }

    //     return words;
    // }
    

}