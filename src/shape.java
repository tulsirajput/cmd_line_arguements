
public class shape {
    void draw(){
        System.out.println("Draw shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }

    public static void main(String[] args) {
        shape s = new shape();
        s.draw();
        s.erase();
    }
}
