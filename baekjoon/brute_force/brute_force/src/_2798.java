import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//����

public class _2798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N, M;
		
		//�Է� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		
		String s = br.readLine();
		String[] str = s.split(" ");
		
		//int�� ��ȯ
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		//M���� ����
		int diff = Integer.MAX_VALUE;
		//���� ��
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					int temp = arr[i] + arr[j] + arr[k]; //�� ī�� ��
					//M�� ���� �����鼭 �ִ��� ����� ���
					if(M-temp>=0 && M-temp<diff) {
						sum = temp; //��� �ݿ�
						diff = M - temp; //�� �ݿ�
					}
					
				}
			}
		}
		System.out.println(sum);
		
	}

}
