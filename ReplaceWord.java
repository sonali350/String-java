 class _170ReplaceString {
    public static void main(String[] args) {
    String str = "My name is sona";
    String[] strArray = str.split(" ");
    for(int i = 0; i < strArray.length; i++){
    if(strArray[i].equalsIgnoreCase("sona")){
    strArray[i] = "john";
    }
    }
    String newStr = "";
    for(int i = 0; i < strArray.length; i++){
    newStr += strArray[i] + " ";
    }
    System.out.println(newStr);
    }
    }
    

   //  String str = "This is a String";
   //  String [] arr = str.split(" ");
   //  for(int i=0; i<arr.length;i++){

   //      if(arr[i].equalsIgnoreCase("String")){
   //          arr[i]="java";
   //      }

   //      String newStr=" ";
   //      newStr=newStr+arr[i];
   //      System.out.print(newStr);
   //  }


    
