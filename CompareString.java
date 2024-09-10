 public class CompareString {

    public static void main(String[] args) {
        String s1 = "This is Example 1";
        String s2 = "This is Example 1";
        int temp = s1.compareTo(s2);
        if(temp<0){
            System.out.println("s1 is less than s2");
        }
         else if(temp>0){
            System.out.println("s1 is greater than s2");
         }
         else{
            System.out.println("s1 and s2 are equal");
         }

        }
       

    }
