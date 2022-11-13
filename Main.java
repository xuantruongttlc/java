package taphopsonguyen;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        NumberSet s1 = new NumberSet(sc, n);
        NumberSet s2 = new NumberSet(sc, m);
        System.out.println(s1.giao(s2));
        System.out.println(s1.hieu(s2));
        System.out.println(s2.hieu(s1));
    }
    
}
