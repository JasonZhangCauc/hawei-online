import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
//本class仅供测试用 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int money = Integer.parseInt(str.split(" ")[0])/10;
        int num = Integer.parseInt(str.split(" ")[1]);
        int[] price= new int[num+1];
        int[] value= new int[num+1];
        int[] check= new int[num+1];
        boolean[] flags = new boolean[num+1];
        int[][] result = new int[num+1][money+1];
        for (int i = 1; i <= num; i++) {
            String[] strings = br.readLine().split(" ");
            price[i] = (Integer.parseInt(strings[0]))/10;
            value[i] = Integer.parseInt(strings[1]) * price[i];
            check[i] = Integer.parseInt(strings[2]);
        }
 
        for (int i = 1; i <= num; i++) {
            for(int j = 1; j<=money; j++){
                if(check[i] == 0) {
                    if(price[i] <= j){
                        result[i][j] = Math.max(result[i-1][j], result[i-1][j-price[i]] + value[i]);
                    }
                }else{
                    if(price[i] + price[check[i]] <= j){ 
                        result[i][j] = Math.max(result[i-1][j], result[i-1][j-price[i]] + value[i]);
                    }
                }
            }
        }
        System.out.println(result[num][money] * 10);
    }
}