package helowrld;

public class forLoop {
    public static void main(String[] args) {
        //for (int i=0; i<10; i++){
            //System.out.println("i is "+ i);
        //}
        int a=5;
        while (a <10 ) {
            if (a==8){
                continue;
            }
            System.out.println("hello");
            a++;
        }
        do {
            System.out.println("prints once no patter condtion");
        }while (a>5);
    }
}
