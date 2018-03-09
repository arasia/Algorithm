//#include <iostream>
//#include <algorithm>
//#include <vector>
//using namespace std;
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int N, temp[500];
//	vector<int> arr;
//	cin >> N >> temp[0];
//	arr.push_back(temp[0]);
//
//	for (int i = 2; i <= N; i++)
//	{
//		for (int j = 0; j < i; j++)
//			cin >> temp[j];
//
//		arr.push_back(arr[i - 2] + temp[i - 1]);
//		for (int j = i - 2; j > 0; j--)
//			arr[j] = temp[j] + max(arr[j], arr[j - 1]);
//		arr[0] += temp[0];
//	}
//
//	auto result = max_element(arr.begin(), arr.end());
//	cout << *result;
//	system("pause");
//	return 0;
//}