package taphopsonguyen;

import java.util.Scanner;
import java.util.TreeSet;

public class NumberSet {
    private TreeSet<Integer> set = new TreeSet<>();

    public NumberSet(Scanner sc, int n) {
        for(int i=0; i<n; i++){
            this.set.add(sc.nextInt());
        }
    }
    
    public String hieu(NumberSet o){
        TreeSet<Integer> x = (TreeSet<Integer>)o.set.clone();
        x.retainAll(this.set);
        TreeSet<Integer> y = (TreeSet<Integer>)this.set.clone();
        y.removeAll(x);
        String s = "";
        for(int i : y){
            s+= i + " ";
        }
        return s;
    }
    public String giao(NumberSet o){
        TreeSet<Integer> x = (TreeSet<Integer>)o.set.clone();
        x.retainAll(this.set);
        String s = "";
        for(int i : x){
            s+= i + " ";
        }
        return s;
    }
}
