/*#include <iostream>

using namespace std;

int main()
{
	int prime_num_array[1001] = { 0, };
	prime_num_array[0] = 1;
	prime_num_array[1] = 1;

	for (int i = 2; i < 1001; i++)
	{
		int prime_check = prime_num_array[i];

		if (prime_check == 1)
			continue;

		for (int j = 2; j < i; j++)
		{
			if (i%j == 0)
			{
				prime_check = 1;
				break;
			}
		}

		if (prime_check == 0)
		{
			int not_prime = i + i;
			while (not_prime < 1001)
			{
				prime_num_array[not_prime] = 1;
				not_prime += i;
			}
		}

	}

	int N, count = 0;
	cin >> N;

	while (N--)
	{
		int temp;
		cin >> temp;
		if (prime_num_array[temp] == 0)
			count++;
	}
	cout << count;
	return 0;
}*/