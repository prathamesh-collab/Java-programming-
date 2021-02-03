public class array_for_loop {
    public static void main(String[] args){
        int[] [] mynumbers = { { 1,2,3,4,} , {5, 6, 7}};
        for (int i = 0; i<mynumbers.length ; ++i) {
            for(int j =0;j<mynumbers[i].length; ++j) {

                System.out.println(mynumbers[i][j]);
            }
        }
    }
}

        