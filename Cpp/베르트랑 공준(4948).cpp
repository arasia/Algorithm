/*#include <iostream>

using namespace std;

int prime_num_array[246913] = { 1, 1, 0, };

int main()
{
	for (int i = 2; i < 501; i++)
	{
		if (prime_num_array[i] == 1)
			continue;

		int not_prime = i + i;
		while (not_prime < 246913)
		{
			prime_num_array[not_prime] = 1;
			not_prime += i;
		}
	}

	while (1)
	{
		int start, finish, count = 0;
		cin >> start;
		if (start == 0)
			break;
		finish = start * 2;

		for (int i = start + 1; i <= finish; i++)
		{
			if (prime_num_array[i] == 0)
				count++;
		}
		cout << count << endl;
	}
	system("pause");
	return 0;
}*/