package arraysEstrutura;
import java.util.Arrays;

public class Exemplo002 {
    public static void main(String[] args){
        int[][] bidimencional = {{1,2,3,4},{5,6,7}};
        for(int i = 0; i < bidimencional.length; i++){
            for(int j = 0; j < bidimencional[i].length; j++){
                System.out.println(bidimencional[i][j]);
            }
        }
    }
}
