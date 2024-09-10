public class StringComIgnore {
    public static void main(String[] args) {
        String s1="This is example 1";
        String s2="This is Example 1";
        int s=s1.compareToIgnoreCase(s2);
        if(s<0){
            System.out.println("s1 is less than s2");
        }
        else if(s>0){
            System.out.println("s1 is greater than s2");
        }
        else{
            System.out.println("s1 and s2 equal" );
        }
    }
    
}
