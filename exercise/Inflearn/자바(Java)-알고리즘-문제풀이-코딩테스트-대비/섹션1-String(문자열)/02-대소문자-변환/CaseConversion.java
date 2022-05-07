import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main {
  public StringBuilder Solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c))
                answer.append(Character.toLowerCase(c));
            else
                answer.append(Character.toUpperCase(c));
        }

        return answer;
    }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    Main main = new Main();

    System.out.println(main.Solution(str));
  }
}