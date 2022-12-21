import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First Number");
        int firstnum = sc.nextInt();
        System.out.println("Second Number");
        int secondnum = sc.nextInt();
        System.out.println("Method");
        int method = sc.nextInt();
        if (method == 1) {
            System.out.println(firstnum+secondnum);
        }
        if(method == 2){
            System.out.println(firstnum-secondnum);
        }
        if(method == 3){
            System.out.println(firstnum*secondnum);
        }
        if(method == 4){
            System.out.println(firstnum/secondnum);
        }
    }
}
