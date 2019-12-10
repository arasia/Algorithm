/*#include <iostream>
#include <stack>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	int test_case;
	cin >> test_case;
	int max = 0, top, success = 1, count = 0;
	stack<int> stack;
	char result[200001];
	
	while (test_case--)
	{
		int num;
		cin >> num;
		if (max < num)
		{
			for (int i = max; i < num; i++)
			{
				stack.push(++max);
				result[count++] = '+';
			}
			top = num;
		}

		if (top == num)
		{
			stack.pop();
			if (stack.empty())
				top = 0;
			else
				top = stack.top();
			result[count++] = '-';
		}
		else
		{
			success = 0;
			break;
		}
	}

	if (success == 1)
	{
		for (int i = 0 ; i < count ; i++)
		{
			cout << result[i] << "\n";
		}
	}
	else
	{
		cout << "NO";
	}
	system("pause");
	return 0;
}*/