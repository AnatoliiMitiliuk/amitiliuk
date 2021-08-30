package homework4;

public class Task3 {
    public static void main(String[] args) {

        int n = 8;
        int s = 1;
        int i = 1;
        while (i <=n)
        {
            s = s*i;
            i++;

        }
        System.out.println("факториал " +n+"! = "+s);

        System.out.println("нечетные числа от 1 до 99:");
        int i1 = 1;
        while (i1 <=99)
        {

            System.out.print(i1+" ");
            i1 +=2;

        }

    }
}
