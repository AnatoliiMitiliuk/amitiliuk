package homework4;

public class Task10 {
    public static void main(String[] args) {
        int[] number ={4,-5,0,6,8,};
        int max = number[0];
        for (int i : number) {
            if (i > max) ;
            max = i;
        }
        System.out.println(max);
    }
}
