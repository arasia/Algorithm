//#include <iostream>
//
//using namespace std;
//int main(void)
//{
//	int M, current_pos = 1, X, Y;
//	cin >> M;
//
//	while (M--)
//	{
//		cin >> X >> Y;
//
//		if ((X < 1) || (Y < 1))
//		{
//			current_pos = -1;
//			break;
//		}
//		else if (X == current_pos)
//			current_pos = Y;
//		else if (Y == current_pos)
//			current_pos = X;
//	}
//	
//	cout << current_pos;
//
//	system("pause");
//	return 0;
//}