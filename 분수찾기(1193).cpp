/*#include<iostream>
using namespace std;

int main()
{
	int num;
	int count = 0;
	int range = 1;
	int result;
	cin >> num;

	while (1)
	{
		count++;
		range = (count * (count+1))/2;
		if (num <= range)
			break;
	}

	if (count % 2 == 1)
	{
		result = 1 + (range - num);
	}
	else
	{
		result = count - (range - num);
	}

	cout << result << "/" << (count+1)-result;
	//system("pause");
	return 0;
}*/