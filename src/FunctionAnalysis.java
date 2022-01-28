import java.lang.Math;

public class FunctionAnalysis {

    public static void main(String[] args) {
        long[] timeValues = {1000, 60000, 3600000, 86400000, 2678400000L, 31536000000L, 3153600000000L};

        System.out.println("Function log(n)");
        for (long time : timeValues) {
            long n=1;
            n = (long) Math.pow(10, time);
            print(time, n);
        }
        divider();

        System.out.println("Function sqrt(n)");
        for (long time : timeValues) {
            long n=1;
            n = (long) Math.pow(time, 2);
            print(time, n);
        }
        divider();

        System.out.println("Function n");
        for (long time : timeValues) {
            long n=1;
            n = time;
            print(time, n);
        }
        divider();

        System.out.println("Function n log n");
        for (long time : timeValues) {
            long n=1;
            while(n*Math.log10(n)<time){
                if(time>86400000){
                    n=n+10000;
                }
                else{
                    n++;
                }
            }
            if(n>0){n--;}
            print(time, n);
        }
        divider();

        System.out.println("Function n^2");
        for (long time : timeValues) {
            long n=1;
            n = (long) Math.sqrt(time);
            print(time, n);
        }
        divider();

        System.out.println("Function n^3");
        for (long time : timeValues) {
            long n=1;
            n = (long) Math.cbrt(time);
            print(time, n);
        }
        divider();

        System.out.println("Function 2^n");
        for (long time : timeValues) {
            long n=1;
            while(Math.pow(2,n)<time){
                n++;
            }
            if(n>0){n--;}
            print(time, n);
        }
        divider();

        System.out.println("Function n!");
        for (long time : timeValues) {
            long n=1;
            while(factorial(n)<time){
                n++;
            }
            if(n>0){n--;}
            print(time, n);
        }
        divider();
    }
    public static long factorial(long n){
        long i = 1;
        long result = 1;
        while(i<n+1){
                result = result*i;
                i++;
        }
        return result;
    }

    public static void print(long time, long n){
        System.out.println("Time (ms) = " + time + ", n = " + n);
    }

    public static void divider(){
        System.out.println("\n===================================================\n");
    }
}