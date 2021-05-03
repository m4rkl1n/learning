package helowrld;

public class operators {
    public static void main(String[] args) {
        int a = 2;
        //a = a + 4;
        //a will = 9
        //a++; //adds 1 to a
        //a+=2 is the same as a = a+2

        int b = 11;
        int c = 4;
        boolean ans = a>b; //will come out as true
        boolean answ = a == b; //will be false
        // != means its not equal

        boolean or = b==5 || c==4; //true because one or more is true. || means or
        boolean both = b==5 && c==4; //both has to be true.

        if (a>b) {
            //System.out.println("a is greater than b");
        } else{
            //System.out.println("b is greater than a");
        }
        boolean answer = a>c;
        if (!answer){
            //System.out.println("c is greater than a");
        }else{
            //System.out.println("a is greater than c");
        }

        switch(a){
            case 1:
                System.out.println(" a is one");
                break;
            case 2:
                System.out.println("a is two");
                break;
            default:
                System.out.println("a is not a number");
}

    }

}
