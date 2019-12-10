/*#include<iostream>
#include<cmath>
using namespace std;

int func_gcd(int a, int b);
int func_lcm(int a, int b);

int main()
{
	int test_case;
	cin >> test_case;

	while (test_case--)
	{
		int M, N, x, y;
		int flag;
		bool success = false;

		cin >> M >> N >> x >> y;

		int count = x;
		int num = x;
		int sub = abs(M - N);
		int lcm = func_lcm(M, N);

		if (M > N)
			flag = 1;
		else
			flag = -1;
        

		while (count <= lcm)
		{
			//cout << num <<" " <<  count << endl;
			if (num < 1)
				num += N;
			if (num > N)
				num = (num-1)%N +1;
			if (num == y)
			{
				success = true;
				break;
			}
			count += M;
			num += flag * (sub%N);

			
		}

		if (success)
			cout << count << endl;
		else
			cout << "-1" << endl;

	}
	//system("pause");
	return 0;
}

int func_gcd(int a, int b)
{
	int c;
	while (b != 0)
	{
		c = a % b;
		a = b;
		b = c;
	}
	return a;
}

int func_lcm(int a, int b)
{
	return a * b / func_gcd(a, b);
}*/