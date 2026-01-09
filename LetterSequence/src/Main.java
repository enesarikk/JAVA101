public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        for(int r = 0; r < letter.length; r++){
            for(int  c = 0; c < letter[r].length; c++){
                if(r==0 || r == 3 || r == 6){
                    letter[r][c] = " * ";
                } else if (c == 0) {
                    letter[r][c] = " * ";
                } else {
                    letter[r][c] = "   ";
                }
            }
        }
        for(String[] row : letter){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}