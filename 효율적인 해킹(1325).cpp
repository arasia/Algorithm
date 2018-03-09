//#include <iostream>
//#include <vector>
//using namespace std;
//
//vector<vector<int> > vt;
//int count_array[10001];
//int func(int start_pos);
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int M, N, max_hack_count = 0;
//	vector<int> max_hack_node;
//	cin >> N >> M;
//	
//	vt.resize(N+1);
//
//	while (M--)
//	{
//		int A, B;
//		cin >> A >> B;
//		vt[B].push_back(A);
//	}
//
//	int start_pos = 0;
//	while (start_pos++ < N)
//	{
//		fill_n(count_array, 10001, -2);
//		int result = func(start_pos);
//		if (result > max_hack_count)
//		{
//			max_hack_node.clear();
//			max_hack_node.push_back(start_pos);
//			max_hack_count = result;
//		}
//		else if (result == max_hack_count)
//		{
//			max_hack_node.push_back(start_pos);
//		}
//	}
//
//	for (auto iter : max_hack_node)
//	{
//		cout << iter << " ";
//	}
//
//	system("pause");
//	return 0;
//}
//
//int func(int current_pos)
//{
//	int count = 0;
//	count_array[current_pos]++;
//	for (auto iter : vt[current_pos])
//	{
//		if (iter && (count_array[iter] == -2))
//		{
//			count_array[iter]++;
//			count  = count + func(iter) + 1;
//		}
//	}
//	return count;
//}