/*#include <iostream>
#include <cstring>
#include <deque>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	int test_case;
	cin >> test_case;
	deque<int> deque;

	while (test_case--)
	{
		char ch[11];
		cin >> ch;

		if (!strcmp(ch, "push_front"))
		{
			int num;
			cin >> num;
			deque.push_front(num);
		}
		else if (!strcmp(ch, "push_back"))
		{
			int num;
			cin >> num;
			deque.push_back(num);
		}
		else if (!strcmp(ch, "pop_front"))
		{
			if (deque.empty())
			{
				cout << "-1\n";
			}
			else
			{
				int num = deque.front();
				deque.pop_front();
				cout << num << "\n";
			}
		}
		else if (!strcmp(ch, "pop_back"))
		{
			if (deque.empty())
			{
				cout << "-1\n";
			}
			else
			{
				int num = deque.back();
				deque.pop_back();
				cout << num << "\n";
			}
		}
		else if (!strcmp(ch, "size"))
		{
			cout << deque.size() << "\n";
		}
		else if (!strcmp(ch, "empty"))
		{
			cout << deque.empty() << "\n";
		}
		else if (!strcmp(ch, "front"))
		{
			if (deque.empty())
				cout << "-1\n";
			else
				cout << deque.front() << "\n";
		}
		else if (!strcmp(ch, "back"))
		{
			if (deque.empty())
				cout << "-1\n";
			else
				cout << deque.back() << "\n";
		}
	}
	system("pause");
	return 0;
}*/