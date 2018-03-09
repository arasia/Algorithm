/*#include<iostream>
using namespace std;

int main()
{
	int T;
	cin >> T;
	pair<long long, long long> arr[41];

	arr[0] = make_pair(1, 0);
	arr[1] = make_pair(0, 1);
	arr[2] = make_pair(1, 1);

	for (int i = 3; i < 41; i++)
	{
		arr[i].first = arr[i - 1].first + arr[i - 2].first;
		arr[i].second = arr[i - 1].second + arr[i - 2].second;
	}
	
	while (T--)
	{
		int N;
		cin >> N;
		cout << arr[N].first << " " << arr[N].second << endl;
	}
	system("pause");
	return 0;
}*/