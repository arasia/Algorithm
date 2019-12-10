/*#include<iostream>
#include<cmath>
using namespace std;

int main()
{
	int test_case;
	cin >> test_case;
	while (test_case--)
	{
		int x, y;
		cin >> x >> y;

		int sub = y - x;
		int count = 0;
		int result;

		count = sqrt((double)sub);

		int temp = count * (count + 1);
		
		if (sub <= temp)
			count--;
		result = count * 2;

		sub -= count * (count + 1);

		if (sub > (count + 1))
			result += 2;
		else if (sub != 0)
			result += 1;

		cout << result << endl;
	}
	//system("pause");
	return 0;
}*/