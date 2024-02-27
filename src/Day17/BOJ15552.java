package Day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;


public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            writer.write(sum + "\n");
        }

        reader.close();
        writer.flush(); // BufferedWriter의 버퍼에 남아있는 데이터를 출력
        writer.close();
    }
}
