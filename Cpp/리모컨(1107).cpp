//#include <iostream>
//#include <cmath>
//using namespace std;
//
//int near_ch(int now, int prev);
//bool button[10] = { false, };
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int M, temp, prev = 0, now = 100, ch, ch2;
//	int result1, result2 = 0;
//
//	cin >> ch;
//	ch2 = ch;
//	
//
//	cin >> M;
//	if (M == 10)
//	{
//		while (M--)
//		{
//			cin >> temp;
//			button[temp] = true;
//		}
//
//		cout << abs(ch - 100);
//	}
//	else
//	{
//		while (M--)
//		{
//			cin >> temp;
//			button[temp] = true;
//		}
//
//		int count = 0;
//		while (ch2)
//		{
//			temp = ch2 % 10;
//			ch2 /= 10;
//			prev = near_ch(temp, prev);
//			result2 += prev * (int)pow(10, count++);
//		}
//		result1 = abs(ch - 100);
//		cout << "ch : " << ch << "result1 : " << result1 << "result2 : " << result2 << endl;
//		result2 = count + abs(ch - result2);
//		cout << "ch : " << ch << "result1 : " << result1 << "result2 : " << result2 << endl;
//		
//		if (result1 < result2)
//			cout << result1;
//		else
//			cout << result2;
//	}
//	system("pause");
//	return 0;
//}
//int near_ch(int now, int prev)
//{
//	if (!button[now])
//		return now;
//	else
//	{
//		int count = 1;
//		while (1)
//		{
//			int high = -1, low = -1;
//
//			if (!button[(now + count) % 10])
//				high = (now + count) % 10;
//			if (!button[(now - count + 10) % 10])
//				low = (now - count+10) % 10;
//
//			if ((high != -1) && (low != -1))
//			{
//				if (now - prev > 0)
//					return high;
//				else
//					return low;
//			}
//			else if (high != -1)
//				return high;
//			else if (low != -1)
//				return low;
//
//			count++;
//		}
//	}
//}