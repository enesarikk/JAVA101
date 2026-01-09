import java.util.Arrays;

public class Main {
    static boolean isFind(int[] array, int unit){
        for(int i : array){
            if(i == unit) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] sequence = {3, 7, 12, 18, 24, 31, 39, 45, 52, 18, 74, 45, 97, 12, 4, 24, 31};
        int[] copy = new int[sequence.length];
        int index = 0;
        for(int v = 0; v < sequence.length; v++){
            for(int f = 0; f < sequence.length; f++){
                if((v != f) && (sequence[v] == sequence[f])){
                    if(!isFind(copy, sequence[f])){
                        copy[index++] = sequence[v];
                    }
                    break;
                }
            }
        }
        for(int d : copy){
            if((d != 0) && (d % 2 == 0)) {
                System.out.print(d + ", ");
            }
        }
    }
}