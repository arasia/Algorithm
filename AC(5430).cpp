/*#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <deque>
#include <string>
#include <cstring>

using namespace std;

int main()
{
	//ios::sync_with_stdio(false);
	
	int T;
	cin >> T;
	while (T--)
	{
		deque<int> deque;
		int n, p_len, flag = 1;
		string p;
		char arr[400004];
		bool success = true;

		cin >> p >> n;
		cin >> arr;
		p_len = p.length();

		char *tok = strtok(arr, "[,]");
		while (tok != NULL) {
			deque.push_back(atoi(tok));
			tok = strtok(NULL, "[,]");
		}

		for (int i = 0; i < p_len; i++)
		{
			char ch = p.at(i);
			
			if (ch == 'R')
			{
				flag *= -1;
			}
			else
			{
				if (deque.empty())
				{
					success = false;
					break;
				}

				if (flag > 0)
					deque.pop_front();
				else
					deque.pop_back();
			}
		}

		if (success)
		{
			int index, size = deque.size();
			
			if (flag > 0)
				index = 0;
			else
				index = size - 1;

			cout << "[";
			while (size--)
			{
				cout << deque.at(index);
				if (size != 0)
					cout << ",";
				index += 1 * flag;
			}
			cout << "]\n";
		}
		else
			cout << "error\n";
	}
	system("pause");
	return 0;
}*/