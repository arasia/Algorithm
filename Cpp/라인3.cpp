//#include <iostream>
//using namespace std;
//
///*
//* Time complexity: O(log N)
//* Space complexity: O(N)
//*/
//
//long long fact[1000001], inv[1000001];
//const long long mod = 1003001;
//long long power(long long x, long long y);
//long long func(long long N, long long K);
//
//int main()
//{
//	fact[1] = 1;
//	for (int i = 2; i <= 1000000; i++)
//		fact[i] = (fact[i - 1] * i) % mod;
//
//	inv[1000000] = power(fact[1000000], mod - 2);
//	for (int i = 1000000 - 1; i > 0; i--)
//		inv[i] = (inv[i + 1] * (i + 1)) % mod;
//
//	int T;
//	cin >> T;
//	while (T--)
//	{
//		long long N, K, M;
//		cin >> N >> K >> M;
//		long long result1 = func(N, M), result2 = func(N, K - M);
//
//		cout << (result1 * result2) % mod << "\n";
//	}
//	return 0;
//}
//long long func(long long N, long long K)
//{
//	long long result;
//	if ((N == K) || (K == 0))
//	{
//		return 1;
//	}
//	result = (fact[N] * inv[N - K]) % mod;
//	result = (result * inv[K]) % mod;
//	return result;
//}
//long long power(long long x, long long y)
//{
//	long long result = 1;
//	while (y > 0)
//	{
//		if (y % 2)
//		{
//			result *= x;
//			result %= mod;
//		}
//		x *= x;
//		x %= mod;
//		y /= 2;
//	}
//	return result;
//}