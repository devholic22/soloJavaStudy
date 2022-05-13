package sec02.exam02;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};
        int sum1 = 0;
        for(int i = 0; i < 3; i++){
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        int sum2 = add(new int[] {83, 90, 87}); // 또는 scores와 같이 이미 생성된 배열을 바로 넣어도 된다. add(scores)
        System.out.println("총합 : " + sum2);
        System.out.println();
    }

    public static int add(int[] scores){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += scores[i];
        }
        return sum;
    }
}
