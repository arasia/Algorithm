//#include <iostream>
//using namespace std;
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int n, k;
//	int coin[100], money[10001] = { 1, 0, };
//	cin >> n >> k;
//
//	for (int i = 0; i < n; i++)
//		cin >> coin[i];
//
//	for (int i = 0; i < n; i++)
//		for (int j = coin[i]; j <= k; j++)
//			money[j] += money[j - coin[i]];
//
//	cout << money[k];
//	system("pause");
//	return 0;
//}