package session2;

public class forloop1 {
    public static void main(String[] args) {
        int i=9;
        int j;
        int k;
        for (j=1; j<=i; j+=2) {
            for(k=1; k<=j; k++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
