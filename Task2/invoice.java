package session2;

import java.util.Scanner;

public class invoice {
    public static void main(String[] args) {
        int shirts;
        int trousers;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int totalOfShirt;
        int totalOfTrouser;
        int discount;
        int netOfTotal;
        int OfEarn;
        boolean possible = false;

        System.out.println("Welcome to our shop");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order:");
        shirts = scan.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        trousers = scan.nextInt();

        totalOfShirt = (shirts * priceOfShirt);
        totalOfTrouser = (trousers * priceOfTrouser);
        discount = (totalOfShirt + totalOfTrouser) / 10;

        possible = ((totalOfShirt + totalOfTrouser) > 3000);
        discount = possible ? (totalOfShirt + totalOfTrouser) / 10 : 0;
        netOfTotal = (totalOfShirt + totalOfTrouser - discount);

        possible = ((totalOfShirt + totalOfTrouser - discount) > 3000);
        OfEarn = possible ? (totalOfShirt + totalOfTrouser - discount) / 100 : 0;

        System.out.printf("\nTotal of Shirts: %d", totalOfShirt);
        System.out.printf("\nTotal of Trousers: %d", totalOfTrouser);
        System.out.printf("\nDiscount: %d", discount);
        System.out.printf("\nNet of Total: %d", netOfTotal);
        System.out.printf("\nPoint Earned: %d", OfEarn);
    }
}
