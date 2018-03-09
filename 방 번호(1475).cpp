/*#include<iostream>
using namespace std;

int main()
{
	int arr[10] = { 0, };
	int num;
	int result = 0;
	cin >> num;
	if (num == 0)
		arr[0]++;
	while (num > 0)
	{
		arr[num % 10]++;
		num /= 10;
	}

	int temp = (arr[6] + arr[9] + 1) / 2;
	arr[6] = temp;
	arr[9] = temp;

	for (int i = 0; i < 10; i++)
	{
		if (arr[i] > result)
			result = arr[i];
	}
	cout << result;
	//system("pause");
	return 0;
}*/