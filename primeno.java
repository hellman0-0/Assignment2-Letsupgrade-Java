public class primeno
{
 /**
     * @param args
     */
    public static void main(String args[]){
        int i=2;
        System.out.println("Prime Numbers Are:");
      for(i=2;i<=10;i++){
        int count,j;
        count=0;
        for(j=2;j<=i/2;j++){
            if(i%j==0){
                count++;
            }}
        if(count==0){
            System.out.println(i);
        }}}}