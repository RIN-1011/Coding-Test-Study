import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//������

public class _2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�Է� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0; i<N; i++) {
			int sum = 0;
			int temp = i;
			
			sum += i; //�ڱ� �ڽ� ���ϱ�
			
			//�ڸ��� ���� ���ϱ�
			while(temp != 0) {
				sum += temp%10; //�� �ڸ������� ����
				temp /= 10;
			}
			//�������� N�� ���� ��� ���� ���� ������ ���
			if(sum == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
