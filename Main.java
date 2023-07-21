package Main_back;

//백준 2164
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			q.offer(i);
		}
		
		int count = 1;
		while(q.size()!=1) {
			int n=0;
			if(count%2!=0) {
				q.poll();
				count++;
			}else if(count%2==0) {
				n = q.poll();
				q.offer(n);
				count++;
			}
		}
		int n= q.poll();
		System.out.println(n);
	}

}

