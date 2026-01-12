public class Main {
    static boolean frequency(int[] array, int value){
        for(int s : array){
            if(s == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] seq = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] copy = new int[seq.length];

        for(int i = 0; i < seq.length; i++){
                if(!frequency(copy,seq[i])){
                    int counter = 0;
                    for(int number : seq){
                        if(seq[i] == number){
                            counter++;
                        }
                }
                System.out.println(seq[i] + " repeated " + counter + " times.");
                copy[i] = seq[i];
            }
        }
    }
}