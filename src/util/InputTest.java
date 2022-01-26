package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();

        in.getString();
        System.out.println(in.yesNo());
        in.getInt(1,20);
        in.getInt();
        in.getDouble(1.1,30.5);
        in.getDouble();

    }
}
