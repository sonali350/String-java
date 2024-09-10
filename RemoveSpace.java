 class RemoveSpace {
    public static void main(String[] args) {
     
        String str="This is a String";
        for(int i = 0; i<str.length();i++){
           // String []s=str.split("");

            char c = str.charAt(i);
            if(c!=' '){
                System.out.print(c);  

            }

           
        }
             
    }
}

