//#include <iostream>
//#include <vector>
//#include <algorithm>
//using namespace std;
//
//bool cmp(const vector<int> &a, const vector<int> &b)
//{
//	int count = 4;
//	while (count)
//	{
//		if (a[count] < b[count])
//			return 1;
//		else if (a[count] > b[count])
//			return 0;
//		count--;
//	}
//	return 0;
//}
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int N;
//	vector< vector<int> > arr;
//	
//	arr.resize(3);
//
//	for (int i = 0; i < 3; i++)
//	{
//		arr[i].push_back(i + 1);
//		for (int j = 0; j < 4; j++)
//			arr[i].push_back(0);
//	}
//	
//	cin >> N;
//	while (N--)
//	{
//		int A, B, C;
//		cin >> A >> B >> C;
//
//		arr[0][4] += A;
//		arr[1][4] += B;
//		arr[2][4] += C;
//		arr[0][A]++;
//		arr[1][B]++;
//		arr[2][C]++;
//	}
//	sort(arr.begin(), arr.end(), cmp);
//
//	bool flag = false;
//	if ((arr[2][4] == arr[1][4]) && (arr[2][3] == arr[1][3]) && (arr[2][2] == arr[1][2]) && (arr[2][1] == arr[1][1]))
//	{
//		flag = true;
//	}
//
//	if (flag)
//		cout << "0 " << arr[2][4];
//	else
//		cout << arr[2][0] << " " << arr[2][4];
//
//	system("pause");
//	return 0;
//}