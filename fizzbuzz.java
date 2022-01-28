public class fizzbuzz {

    public static void main(String[] args) {
        int i=0;
        while(i<=200){

            if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
            i++;
        }
    }


}
