//#include <iostream>
//
//using namespace std;
//
//int main()
//{
//	ios::sync_with_stdio(false);
//	
//	while (1)
//	{
//		int N, K, count = 1;
//		long result = 1;
//		cin >> N >> K;
//		
//		if ((N == 0) && (K == 0))
//			break;
//
//		if (N - K < K)
//			K = N - K;
//
//		while (K--)
//		{
//			result *= N--;
//			result /= count++;
//		}
//		cout << result << endl;
//	}
//	system("pause");
//	return 0;
//}