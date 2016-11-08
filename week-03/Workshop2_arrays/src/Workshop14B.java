/**
 * Created by Zsuzska on 2016. 11. 08..
 */
public class Workshop14B {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        ah = reverse(ah);
        for (int i = 0; i < ah.length; i++){
            System.out.println(ah[i]);
        }
    }
    public static int[] reverse(int[] reversable){
        int[] result = new int[reversable.length];
        for (int i = 0; i < reversable.length; i++){
            result[i] = reversable[reversable.length - i - 1];
        }
        return result;
    }
    public static int[] reverseWithoutArray(int[] reversable){
        int temp;
        for (int i = 0; i < reversable.length / 2; i++){
            // 1 / 2 = 0 0 <> utolso
            // 2 / 2 = 1 0 <> utolso(1)
            // 3 / 2 = 1 0 <> utolso(2)
            // 4 / 2 = 2 0 <> utolso(3)
            // 5 / 2 = 2 0 <> utolso(4)
            temp = reversable[i];
            reversable[i] = reversable[reversable.length - i - 1];
            reversable[reversable.length - i - 1] = temp;
        }
        return reversable;
    }
}
