package notes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    void checkDuplicate(){
        List<Integer> l =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Numbers you want to add ?");
        int n=sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            
            System.out.println("enter element no " +k);
            int x=sc.nextInt();
            l.add(x);
            k++;
        }
        
        Set<Integer> set=new HashSet<>(l);
        System.out.println("List After removing Duplicates "+set);
    }

    public static void main(String[] args) {
        RemoveDuplicates r=new RemoveDuplicates();
        r.checkDuplicate();
    }

}
