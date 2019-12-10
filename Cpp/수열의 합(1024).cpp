//#include <iostream>
//using namespace std;
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int N, L, temp;
//	cin >> N >> L;
//	while (L < 101)
//	{
//		if (L % 2 == 0)
//		{
//			temp = N / L;
//			if (N == ((temp * L) + (L / 2)))
//				break;
//		}
//		else
//		{
//			temp = N / L;
//			if (N == temp * L)
//				break;
//		}
//		L++;
//	}
//	int start = N / L - (L - 1) / 2;
//	if ((L == 101) || (start < 0))
//		cout << -1;
//	else
//		for (int i = 0; i < L; i++)
//			if (i == L - 1)
//				cout << start;
//			else
//				cout << start++ << " ";
//			
//	system("pause");
//	return 0;
//}