/*#include<iostream>
using namespace std;

int main()
{
	int N;
	long long arr[91] = { 0, 1, 0 };
	
	cin >> N;

	for (int i = 2; i <= N; i++)
	{
		arr[i] = arr[i - 1] + arr[i - 2];
	}
	cout << arr[N];
	system("pause");
	return 0;
}*/