/*#include <iostream>
#include <queue>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	int check[1001] = { 0, };
	int N, M, size = 0;
	queue<int> queue;
	
	cin >> N >> M;

	for (int i = 1; i <= N; i++)
	{
		queue.push(i);
	}

	while (N--)
	{
		for (int i = 1; i < M; i++)
		{
			int temp = queue.front();
			queue.push(temp);
			queue.pop();
		}

		check[size++] = queue.front();
		queue.pop();
	}

	cout << "<";
	for (int i = 0; i < size; i++)
	{
		cout << check[i];
		if (i != (size-1))
			cout << ", ";
	}
	cout << ">\n";

	system("pause");
	return 0;
}*/