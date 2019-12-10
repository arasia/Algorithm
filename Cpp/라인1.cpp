//#define _CRT_SECURE_NO_WARNINGS
//#include <iostream>
//#include <string>
//using namespace std;
//
///*
//* Time complexity: TODO
//* Space complexity: TODO
//*/
//int main(int argc, const char *argv[]) {
//	int T;
//	cin >> T;
//
//	for (int i = 0; i < T; ++i) {
//		string str, result = "";
//		cin >> str;
//		char pre = str[0], cur;
//		int len = str.length(), count = 1;
//		str += "0";
//		for (int i = 1; i <= len; i++)
//		{
//			cur = str[i];
//			if (pre == cur)
//			{
//				count++;
//			}
//			else
//			{
//				string temp = to_string(count);
//				result += temp;
//				result += pre;
//				count = 1;
//			}
//			pre = cur;
//		}
//		cout << result << "\n";
//	}
//
//	return 0;
//}
