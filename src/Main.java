import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int [] list = new int [] {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] visited = new boolean[list.length];

        Arrays.fill(visited,false);


        System.out.println("************************** FREQUENCIES **************************");

        for (int i = 0; i < list.length; i++) {


            if (visited[i]){ continue; }

            int count = 1;

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Frequency of " + list[i] + "\t--> " + count);
        }

        System.out.println("*****************************************************************");




    }
}
