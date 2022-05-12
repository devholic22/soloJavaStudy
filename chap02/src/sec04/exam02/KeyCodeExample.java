package sec04.exam02;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception{
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        /*
        맥 OS에서는 엔터를 한 번만 인식하는 것 같다.
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
        */
    }
}
