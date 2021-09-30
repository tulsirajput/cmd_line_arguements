
import java.util.Scanner;

public class Patient {
    String patientName;
    double height;
    double weight;
    double computeBMI(){
        double d = weight/(height*height);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient ob = new Patient();
        ob.patientName = sc.nextLine();
        ob.height = sc.nextDouble();
        ob.weight = sc.nextDouble();

        double e = ob.computeBMI();
        System.out.println(e);
    }
}
