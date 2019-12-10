/*#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	int num1[101] = { 1,0 };
	int num2[101] = { 1,0 };
	int count1 = 1;
	int count2 = 1;

	while (1)
	{
		int temp, n;
		cin >> temp;

		if (temp == 0)
		{
			break;
		}
		else if (temp == 1)
		{
			while (1)
			{
				n = rand() % 100 + 1;

				if (num1[n] == 0)
				{
					num1[n] = 1;
					break;
				}
			}

			cout << "보영이의 " << count1 << "번째 질문번호 : " << n << endl;
			count1++;
		}
		else if (temp == 2)
		{
			while (1)
			{
				n = rand() % 100 + 1;

				if (num2[n] == 0)
				{
					num2[n] = 1;
					break;
				}
			}

			cout << "충선이의 " << count2 << "번째 질문번호 : " << n << endl;
			count2++;
		}
	}
	return 0;
}*/