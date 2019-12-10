/*#include <iostream>
#include <cstring>
#include <queue>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	int test_case;
	cin >> test_case;
	queue<int> queue;

	while (test_case--)
	{
		char ch[6];
		cin >> ch;

		if (!strcmp(ch, "push"))
		{
			int num;
			cin >> num;
			queue.push(num);
		}
		else if (!strcmp(ch, "pop"))
		{
			if (queue.empty())
			{
				cout << "-1\n";
			}
			else
			{
				int num = queue.front();
				queue.pop();
				cout << num << "\n";
			}
		}
		else if (!strcmp(ch, "size"))
		{
			cout << queue.size() << "\n";
		}
		else if (!strcmp(ch, "empty"))
		{
			cout << queue.empty() << "\n";
		}
		else if (!strcmp(ch, "front"))
		{
			if (queue.empty())
				cout << "-1\n";
			else
				cout << queue.front() << "\n";
		}
		else if (!strcmp(ch, "back"))
		{
			if (queue.empty())
				cout << "-1\n";
			else
				cout << queue.back() << "\n";
		}
	}
	system("pause");
	return 0;
}*/