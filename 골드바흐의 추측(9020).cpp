/*#include <iostream>

using namespace std;

int prime_num_array[10001] = { 1, 1, 0, };

int main()
{
	for (int i = 2; i < 101; i++)
	{
		if (prime_num_array[i] == 1)
			continue;

		int not_prime = i + i;
		while (not_prime < 10001)
		{
			prime_num_array[not_prime] = 1;
			not_prime += i;
		}
	}

	int test_case;
	cin >> test_case;

	while (test_case--)
	{
		int n;
		cin >> n;
		

		while (1)
		{
			for (int i = n; i > 1; i--)
			{
				if (prime_num_array[i] == 0)
				{
					cout << i;
					n -= i;
					break;
				}
			}

			if (n != 0)
				cout << " ";
			else
				break;
		}
	}
	system("pause");
	return 0;
}*/