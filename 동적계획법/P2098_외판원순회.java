import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class P2098_외판원순회 {
    private static final int INF = 1000000*16+1;
    private static int N;
    private static int[][] W;
    private static int[][] d;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        N = Integer.parseInt(br.readLine().trim());
        W = new int[16][16];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        d = new int[16][1 << 16];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 1 << N; j++) {
                d[i][j] = INF; //모든 비용을 충분히 큰수로 저장
            }
        }
        System.out.println(tsp(0, 1));
    }
    private static int tsp(int c, int v) { //모든 경우의 수에 대한 완전 탐색, 재귀 구현
        if (v == (1 << N) - 1) {    // 모든 노드를 방문한 경우
            return W[c][0] == 0 ? INF : W[c][0];
        }
        if (d[c][v] != INF) {  //이미 방문한 노드인 경우 -> 이미 계산한 경우 바로 리턴 (메모이제이션)
            return d[c][v];
        }
        for (int i = 0; i < N; i++) {
            if ((v & (1 << i)) == 0 && W[c][i] != 0) {   //방문한적이 없고 갈 수 있는 도시인 경우
                d[c][v] = Math.min(d[c][v], tsp(i, (v | (1 << i))) + W[c][i]);
            }
        }
        return d[c][v];
    }
}