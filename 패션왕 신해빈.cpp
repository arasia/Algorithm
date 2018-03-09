//#include <iostream>
//#include <string>
//#include <map>
//using namespace std;
//
//int main(void)
//{
//	int test_case;
//	cin >> test_case;
//	while (test_case--)
//	{
//		int n, result = 1;
//		map<string, int> wearable;
//		pair<map<string, int>::iterator, bool> pr;	
//		cin >> n;
//		
//		while (n--)
//		{
//			string temp1, temp2;
//			cin >> temp1 >> temp2;
//
//			pr = wearable.insert(make_pair(temp2, 1));
//			if (pr.second == false)
//				wearable[temp2]++;
//		}
//		for (auto iter : wearable)
//		{
//			result *= (iter.second + 1);
//		}
//		cout << result - 1 << endl;
//	}
//	system("pause");
//	return 0;
//}