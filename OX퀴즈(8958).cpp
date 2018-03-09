/*#include<iostream>
#include<string>
using namespace std;

int main()
{
	int test_case;
	cin >> test_case;
	while (test_case--)
	{
		string s;
		int point = 0;
		int count = 0;
		cin >> s;

		for (int i = 0; i < s.length(); i++)
		{
			if (s.at(i) == 'O')
			{
				count++;
				point += count;
			}
			else
			{
				count = 0;
			}		
		}
		cout << point << endl;
	}
	return 0;
}*/