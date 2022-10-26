public class primeno
{
 /**
     * @param args
     */
    static int prime(int i){
        int j;
        int count=0;
        for(j=2;j<=i/2;j++){
            if(i%j==0){
                count++;
            }}
        return count;
    }
     public static void main(String args[]){
        int i=2,count;
        System.out.println("Prime Numbers Are:");
      for(i=2;i<=10;i++){
        count=prime(i);
        if(count==0){
            System.out.println(i);
        }}}}
