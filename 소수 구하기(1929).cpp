/*#include <iostream>

using namespace std;

int prime_num_array[1000001] = { 1, 1, 0, };

int main()
{
	for (int i = 2; i < 1001; i++)
	{
		if (prime_num_array[i] == 1)
			continue;

		int not_prime = i + i;
		while (not_prime < 1000001)
		{
			prime_num_array[not_prime] = 1;
			not_prime += i;
		}
	}

	int start, finish;
	cin >> start >> finish;

	for (int i = start; i <= finish; i++)
	{
		if (prime_num_array[i] == 0)
			cout << i << endl;
	}

	system("pause");
	return 0;
}*/