//#include <iostream>
//using namespace std;
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int N, T;
//	long long result[101] = { 0, 1, 1, 1, 2, 2 };
//
//	for (int i = 6; i < 101; i++)
//		result[i] = result[i - 2] + result[i - 3];
//
//	cin >> T;
//	while (T--)
//	{
//		cin >> N;
//		cout << result[N] << endl;
//	}
//	system("pause");
//	return 0;
//}