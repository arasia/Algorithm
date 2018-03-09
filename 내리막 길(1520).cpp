//#include <iostream>
//using namespace std;
//
//int height, wide;
//int map[502][502];
//int result[502][502] = { 0, };
//int visit[502][502] = { 0, };
//int next_x[4] = { 0, -1, 0, 1 };
//int next_y[4] = { -1, 0, 1, 0 };
//int func(int x, int y);
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	cin >> height >> wide;
//
//	fill_n(&map[0][0], 502 * 502, 10001);
//	result[height][wide] = 1;
//
//	for (int i = 1; i <= height; i++)
//		for (int j = 1; j <= wide; j++)
//			cin >> map[i][j];
//
//	func(1, 1);
//	cout << result[1][1];
//	system("pause");
//	return 0;
//}
//int func(int x, int y)
//{
//	if (visit[y][x])
//		return result[y][x];
//	visit[y][x]++;
//
//	for (int i = 0; i < 4; i++)
//	{
//		if (map[y][x] > map[y + next_y[i]][x + next_x[i]])
//		{
//			if (result[y + next_y[i]][x + next_x[i]])
//				result[y][x] += result[y + next_y[i]][x + next_x[i]];
//			else
//				result[y][x] += func(x + next_x[i], y + next_y[i]);
//		}
//	}
//	return result[y][x];
//}