public class TestClass {
    public static void main(String[] args) {
        String str = "1 33" ;

        System.out.println(Integer.parseInt(str.substring(0, str.indexOf(" ")))-1 );
        System.out.println(str.substring(str.indexOf(" ") + 1));
    }
}
