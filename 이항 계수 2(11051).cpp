//#include <iostream>
//
//using namespace std;
//long long result[1002][1002] = { 0, };
//const long long mod = 10007;
//long long func(long long up, long long down);
//int main()
//{
//	ios::sync_with_stdio(false);
//	long long N, K;
//	cin >> N >> K;
//	cout << func(N, K);
//	system("pause");
//	return 0;
//}
//long long func(long long up, long long down)
//{
//	if (down == 0 || down == up)
//		return 1;
//	
//	if (result[up][down] != 0)
//		return result[up][down];
//	else
//		result[up][down] = (func((up - 1), (down - 1)) + func((up - 1), down))%mod;
//	
//	return result[up][down];
//}