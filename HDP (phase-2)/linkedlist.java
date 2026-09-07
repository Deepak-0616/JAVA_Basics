import java.util.*;

public class linkedlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                list1.addLast(x);   
            } 
            if (x % 2 != 0) {
                list2.addFirst(x);    
            }
        }
        LinkedList<Integer> l = new LinkedList<>();
        l.addAll(list1);
        l.addAll(list2);
        System.out.println(l);
        sc.close();
    }
}