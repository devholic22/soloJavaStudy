package sec02.exam03;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 1000000000000; // 컴파일 에러 (허용 범위 초과, L 표시 X)
        long var4 = 1000000000000L; // int 범위 초과할 때만 L 표시하면 됨

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
