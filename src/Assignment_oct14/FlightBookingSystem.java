package Assignment_oct14;

import java.util.Scanner;

public class FlightBookingSystem {
    public static void main(String[] args) {
        String[] destinations = {"New York", "Toronto", "Montreal", "Halifax", "Windsor"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter the destination choice you want to search or update (S/U): ");
        char choice = scanner.nextLine().toLowerCase().charAt(0);
        if(choice == 's'){
            System.out.println("Enter the destination you want to search: ");
            String userSearchDestination = scanner.nextLine();
            searchDestination(userSearchDestination, destinations);
        }else if(choice == 'u'){
            System.out.println("Enter the old destination you want to update: ");
            String oldDestination = scanner.nextLine();
            searchDestination(oldDestination, destinations);
            System.out.println("Enter the new destination name you want to update: ");
            String newDestination = scanner.nextLine();
            updateDestination(oldDestination, newDestination, destinations);
        }


    }

    public static void updateDestination(String oldDestination, String newDestination, String[] destinations){
        boolean found = false;
        for(int i=0; i<destinations.length; i++){
            if(oldDestination.equalsIgnoreCase(destinations[i])){
                destinations[i] = newDestination;
                System.out.println("Destination name " + oldDestination + " replace with name : " + newDestination);
                found = true;

                break;
            }

        }

        displayDestination(destinations);
        if(!found){
            System.out.println("Destination not found!");
        }
    }

    public static void displayDestination(String[] destinations){
        System.out.println("Updated Destination:");
        for(int i=0; i<destinations.length; i++){
            System.out.println(destinations[i]);
        }

    }

    public static void searchDestination(String userSearchDestination, String[] destinations){
        boolean found = false;
        for(int i=0; i<destinations.length; i++){
            if(userSearchDestination.equalsIgnoreCase(destinations[i])){
                System.out.println("Destinations : " + destinations[i] + " is available");
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Destinations not found!");
            System.exit(0);
        }

    }
}
