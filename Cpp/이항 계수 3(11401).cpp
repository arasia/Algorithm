//#include <iostream>
//using namespace std;
//
//long long fact[4000001], inv[4000001];
//const long long mod = 1000000007;
//long long power(long long x, long long y);
//
//int main()
//{
//	ios::sync_with_stdio(false);
//	long long N, K, result;
//	
//	fact[1] = 1;
//	for (int i = 2; i <= 4000000; i++)
//		fact[i] = (fact[i - 1] * i) % mod;
//
//	inv[4000000] = power(fact[4000000], mod - 2);
//	for (int i = 4000000 - 1; i > 0; i--)
//		inv[i] = (inv[i + 1] * (i + 1)) % mod;
//
//	cin >> N >> K;
//
//	if ((N == K) || (K == 0))
//	{
//		cout << 1;
//		return 0;
//	}
//	result = (fact[N] * inv[N - K]) % mod;
//	result = (result * inv[K]) % mod;
//	cout << result;
//	system("pause");
//	return 0;
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