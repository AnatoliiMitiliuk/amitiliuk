package homework4;

public class Task4 {
    public static void main(String[] args) {
        int n=8;
        int s=1;
        int i=1;
        int i1=1;

        System.out.println("нечетные числа от 1 до 99:");
        do {

            System.out.print(i1+" ");
            i1 +=2;
        }

        while (i1 <=99);


        do {
            s *=i;
            i++;
        }

        while (i <=n);

        System.out.println();
        System.out.println("факториал " +n+"! = "+s);


    }

}
