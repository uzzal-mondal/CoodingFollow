package JavaLearning;

public class PrimeNum {
    public static void main (String args[]){

       int count = 0;
       int num  = 7;

        for (int i = 2; i<num; i++){

            if (num%i==0){

                count++;
                break;
            }
        }

       if (count==0){

           System.out.println("Prime num"+count);
       }else{
           System.out.println("not Prime num"+count);
       }
    }
}
