import java.util.Arrays;
import java.util.Collections;
   
public class th1{
    double real;
    double imag;
    public th1(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public static th1 add(th1 n1, th1 n2)
    {
        th1 temp = new th1(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return(temp);
    }
    public static void main(String[] args){
        int a=1,b=2;
        System.out.println(a+b);
        th1 n1 = new th1(2.3, 4.5),
            n2 = new th1(3.4, 5.0),
            temp;
        temp = add(n1, n2);
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
        Integer[] arr = { 1, 3, 2, 5, -2, 23, 7, 87, -42, 509 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("\nModified arr[] : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Modified arr[] : " + Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).anyMatch(i -> i == -42));
        a=0;
        for (int i=0;i<arr.length-1;i++) {
            if(arr[i] == 1)
                a=1;
            if(arr[i+1]-arr[i]>1 && arr[i]>0){
                if(a==1)
                    System.out.print(arr[i]+1);
                else
                    System.out.print(1);
                break;
            }
        }
    }
}