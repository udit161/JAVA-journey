public class Boolean {
    boolean isJavaFun = true;
    boolean isUditAwesome = true;
    boolean isFoodTasty = false;
    
    public static void main(String[] args) {
        Boolean b = new Boolean();
        if(b.isJavaFun) {
            System.out.println("Java is fun!");
        }
        else{
            System.out.println("Java is not fun");
        }
    }
}