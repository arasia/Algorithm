/*#include <iostream>
#include <deque>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	deque<int> deque;
	int N, M, count = 0;
	cin >> N >> M;

	for (int i = 1; i <= N; i++)
	{
		deque.push_back(i);
	}

	while (M--)
	{
		int num, index, size = deque.size();
		cin >> num;
		
		for (int i = 0 ; i < size ; i++)
		{
			if (deque.at(i) == num)
			{
				index = i;
				break;
			}
		}

		if (index <= (size / 2))
		{
			for (int i = 0 ; i < index ; i++)
			{
				deque.push_back(deque.front());
				deque.pop_front();
				count++;
			}
		}
		else
		{
			for (int i = size ; i > index; i--)
			{
				deque.push_front(deque.back());
				deque.pop_back();
				count++;
			}
		}
		deque.pop_front();
	}
	cout << count;
	system("pause");
	return 0;
}*/