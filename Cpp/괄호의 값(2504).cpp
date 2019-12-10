/*#include <iostream>
#include <cstring>
#include <string>
#include <stack>

using namespace std;

int check_braket(stack<string> stack, char ch);

int main()
{
	ios::sync_with_stdio(false);
	stack<string> stack;
	string input;
	bool success = true;

	cin >> input;

	for (int i = 0; i < input.length(); i++)
	{
		char ch = input.at(i);

		if ((ch == '(') || (ch == '['))
		{
			stack.push(ch+"");
		}
		else
		{
			if (stack.empty())
			{
				success = false;
				break;
			}

			switch (check_braket(stack, ch))
			{
				case 0:
					success = false;
					break;
				case 1:
				case 2:

			}
		}
	}

	if ((success == false) || (stack.empty() != 1))
		cout << 0;
	else
		cout << "YES\n";

	system("pause");
	return 0;
}

int check_braket(stack<string> stack, char ch)
{
	string first = stack.top();
	int result = 0;
	if(is_num(first))

	if (first == "(")
	{
		return 1;
	}

	if (first == "[")
	{
		return 3;
	}

}

bool is_num(string str)
{
	try
	{
		if (isdigit(stoi(str)))
			return true;
	}
	catch (const std::invalid_argument& ia)
	{
		return false;
	}
}*/