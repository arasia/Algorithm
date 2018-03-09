//#include <iostream>
//#include <cmath>
//using namespace std;
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int test_case;
//	cin >> test_case;
//	while (test_case--)
//	{
//		double x1, y1, x2, y2, big, small;
//		cin >> x1 >> y1 >> big >> x2 >> y2 >> small;
//
//		if ((x1 == x2) && (y1 == y2) && (big == small))
//		{
//			cout << "-1\n";
//			continue;
//		}
//
//		double dist = sqrt(pow(x1-x2,2) + pow(y1-y2,2));
//		if (small > big)
//		{
//			int temp = small;
//			small = big;
//			big = temp;
//		}
//
//		if (dist < big)
//		{
//			if (big > dist + small)
//				cout << "0\n";
//			else if (big == dist + small)
//				cout << "1\n";
//			else
//				cout << "2\n";
//		}
//		else
//		{
//			if (big + small < dist)
//				cout << "0\n";
//			else if (big + small == dist)
//				cout << "1\n";
//			else
//				cout << "2\n";
//		}
//	}
//	system("pause");
//	return 0;
//}
//
////큰원 반지름 > 두 점사이 거리 + 작은원 반지름 -> 못만남
////큰원 반지름 == 두 점사이 거리 + 작은원 반지름 -> 1
////큰원 반지름 + 작은원 반지름 < 두 점사이 거리 -> 0
////큰원 반지름 + 작은원 반지름 > 두 점사이 거리 -> 2