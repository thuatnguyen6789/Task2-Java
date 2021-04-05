package session2;

import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
    int maths1;
    int science1;
    int english1;
    int average1;
    int maths2;
    int science2;
    int english2;
    int average2;
    int hb1;
    int hb2;

        System.out.println("Enter the details for the scholarship....");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Math1:");
        maths1 = scan.nextInt();
        System.out.println("Enter the Science1:");
        science1 = scan.nextInt();
        System.out.println("Enter the English1:");
        english1 = scan.nextInt();
        average1 = (maths1+science1+english1)/3;

        System.out.println("Enter the Math2:");
        maths2 = scan.nextInt();
        System.out.println("Enter the Science2:");
        science2 = scan.nextInt();
        System.out.println("Enter the English2:");
        english2 = scan.nextInt();
        average2 = (maths2+science2+english2)/3;

        System.out.printf("\nMaths1: %d", maths1);
        System.out.printf("\nScience1: %d", science1);
        System.out.printf("\nEnglish1: %d", english1);
        System.out.printf("\nAverage1: %d", average1);
        System.out.printf("\nMaths2: %d", maths2);
        System.out.printf("\nScience2: %d", science2);
        System.out.printf("\nEnglish2: %d", english2);
        System.out.printf("\nAverage2: %d", average2);

        if (average1 > 75) {
            hb1 = 20000;
        }
        else if (average1 < 60) {
            hb1 = 0;
        }
        else
         {
            hb1 = 10000;
        }
        System.out.printf("\nScholarship1: $%d", hb1);
        if (average2 > 75) {
            hb2 = 20000;
        }
        else if (average2 < 60) {
            hb2 = 0;
        }
        else
        {
            hb2 = 10000;
        }
        System.out.printf("\nScholarship2: $%d", hb2);
    }
}
