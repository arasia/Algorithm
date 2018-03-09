//#include <iostream>
//#include <cstdio>
//using namespace std;
//
//pair <long long, long long> result[101][101];
//pair <long long, long long> func(long long up, long long down);
//pair <long long, long long> operator+(pair <long long, long long>left, pair <long long, long long> right)
//{
//	pair <long long, long long> ret;
//	ret.first = left.first + right.first;
//	ret.second = left.second + right.second;
//	if (ret.second >= 10000000000000000)
//	{
//		ret.first ++;
//		ret.second -= 10000000000000000;
//	}
//	return ret;
//}
//int main()
//{
//	for (int i = 0; i < 101; i++)
//		for (int j = 0; j < 101; j++)
//			result[i][j] = make_pair(0, 0);
//
//	long long N, K;
//	cin >> N >> K;
//	func(N, K);
//
//	if (result[N][K].first == 0)
//	{
//		cout << result[N][K].second;
//	}
//	else
//	{
//		printf("%lld%016lld", result[N][K].first, result[N][K].second);
//	}
//
//	system("pause");
//	return 0;
//}
//pair <long long, long long> func(long long up, long long down)
//{
//	if (down == 0 || down == up)
//		return make_pair(0, 1);
//
//	if ((result[up][down].first != 0) || (result[up][down].second != 0))
//		return result[up][down];
//	else
//		result[up][down] = func((up - 1), (down - 1)) + func((up - 1), down);
//	
//	return result[up][down];
//}