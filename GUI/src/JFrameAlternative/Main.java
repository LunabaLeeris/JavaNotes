package JFrameAlternative;

public class Main {
    public static void main(String[] args) {
        /* Another way to create a window is to create a child class of JFrame and use "this" instead of
        creating an instance of JFrame.
        ADVANTAGE : WIll make code much cleaner*/
        MyWindow window = new MyWindow(420, 420, false, "Employment Salary"); // all we have to do is instantiate the class and were done!.
    }
}
