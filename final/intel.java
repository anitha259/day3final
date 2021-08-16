import java.util.Scanner;

class Cab {
    int fare;
    int d;
}

class RideCab {
    public static void main(String[] args) {

        Cab ob = new Cab();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled:");
        ob.d = sc.nextInt();
        ob.fare = 10 * ob.d;
        System.out.println("Total fare : Rs " + ob.fare);

    }
}