/*#include<iostream>
using namespace std;

const int mod = 1000000;
const int p = mod / 10 * 15;
int fibo[p] = { 0,1 };
int main() {
	long long n;
	cin >> n;
	int result = n % p;
	for (int i = 2; i<= result; i++) {
		fibo[i] = fibo[i - 1] + fibo[i - 2];
		fibo[i] %= mod;
	}
	cout << fibo[result];
	system("pause");
	return 0;
}*/