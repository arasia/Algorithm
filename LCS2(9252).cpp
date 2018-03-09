//#include <iostream>
//#include <string>
//#include <algorithm>
//using namespace std;
//int comp[1001][1001] = { 0, };
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	string str1, str2, temp, result;
//	int len1, len2;
//	cin >> str1 >> str2;
//	str1 = "1" + str1;
//	str2 = "2" + str2;
//	len1 = str1.length();
//	len2 = str2.length();
//
//	for (int i = 1; i < len1; i++)
//		for (int j = 1; j < len2; j++)
//			if (str1.at(i) == str2.at(j))
//				comp[i][j] = comp[i - 1][j - 1] + 1;
//			else
//				comp[i][j] = max(comp[i - 1][j], comp[i][j - 1]);
//	
//	int x = len2 - 1, y = len1 - 1;
//	cout << comp[y][x] << "\n";
//
//	while (1)
//	{
//		if (comp[y][x] == 0)
//			break;
//		if (comp[y - 1][x] == comp[y][x])
//			y--;
//		else if (comp[y][x - 1] == comp[y][x])
//			x--;
//		else
//		{
//			result += str1.at(y--);
//			x--;
//		}
//	}
//
//	for (int i = result.length() - 1; i >= 0; i--)
//		cout << result.at(i);
//
//	system("pause");
//	return 0;
//}