
public class univ {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter 2 arguments at least");
        } else {
            String a = args[0];
            String b = args[1];
            if (a.equals("GLA") && b.equals("Mathura"))
                System.out.println("GLA University Mathura");
            else if (a.equals("AAA") && b.equals("Delhi"))
                System.out.println("AAA Technologies Delhi");
        }
    }
}