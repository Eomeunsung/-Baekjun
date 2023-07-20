package Main_back;

//백준 17298
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		int ans[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>(); //인덱스 저장 할 스택 선언
		stack.push(0); //스택 초기화
		
		for(int i=1; i<N; i++) { 
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) { //스택이 비어 있지 않고 스택 마지막 값이 오른쪽 값보다 작을 경우
				ans[stack.pop()] = arr[i]; 
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) { //스택이 비어 있지 않을 경우 -1 로 저
			ans[stack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<N; i++) {
			bw.write(ans[i]+" ");
		}
		bw.write("\n");
		bw.flush();
		
	}

}

