/*#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	int test_case;
	cin >> test_case;
	
	while (test_case--)
	{
		string input;
		stack<bool> stack;
		bool success = true;
		cin >> input;

		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.at(i);

			if (ch == '(')
			{
				stack.push(true);
			}
			else
			{
				if (stack.empty())
				{
					success = false;
					break;
				}
				stack.pop();
			}
		}

		if ((success == false) || (stack.empty() != 1))
			cout << "NO\n";
		else
			cout << "YES\n";
	}

	system("pause");
	return 0;
}*/