public class ReplaceAllTeste{
    public static void main(String args[]){
     String str = new String("My .com site is BeginnersBook.com");
     System.out.print("String after replacing all com with net: " );
     System.out.println(str.replaceAll("com", "net"));
 
     System.out.print("Replacing whole String: " );
     System.out.println(str.replaceAll("(.*)Beginners(.*)", "Welcome"));
    }
 }