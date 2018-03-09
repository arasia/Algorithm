//#include <iostream>
//#include <algorithm>
//using namespace std;
//
//int main(void)
//{
//	int N, house[1000][3], result = 0;
//	cin >> N;
//	for(int i = 0 ; i < N ; i++)
//	{
//		int RGB[3];
//		cin >> RGB[0] >> RGB[1] >> RGB[2];
//		if (i == 0)
//		{
//			house[i][0] = RGB[0];
//			house[i][1] = RGB[1];
//			house[i][2] = RGB[2];
//		}
//		else
//		{
//			house[i][0] = min(RGB[0] + house[i - 1][1], RGB[0] + house[i - 1][2]);
//			house[i][1] = min(RGB[1] + house[i - 1][0], RGB[1] + house[i - 1][2]);
//			house[i][2] = min(RGB[2] + house[i - 1][0], RGB[2] + house[i - 1][1]);
//		}
//	}
//
//	if (N == 0)
//		result = 0;
//	else
//		result = min(min(house[N - 1][0], house[N - 1][1]), house[N - 1][2]);
//	cout << result;
//	system("pause");
//	return 0;
//}