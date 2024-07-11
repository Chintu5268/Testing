public class ReverseString {
  
  public static void main(String[] args) {
    
    String orignal = "Hello Sandesh";
    String sb = new StringBuilder(orignal).reverse().toString();
    System.out.println(sb);
   
  }
}
