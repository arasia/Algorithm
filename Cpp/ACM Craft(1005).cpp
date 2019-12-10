//#include <iostream>
//#include <algorithm>
//#include <vector>
//#include <queue>
//using namespace std;
//
//int main(void)
//{
//	ios::sync_with_stdio(false);
//	int test_case;
//	cin >> test_case;
//	while (test_case--)
//	{
//		int N, K, W;
//		cin >> N >> K;
//		vector<int> build = { 0 };
//		vector< vector<int> > build_tree;
//		vector<int> result;
//		queue<int> queue;
//		result.resize(1001);
//		build_tree.resize(N + 1);
//		while (N--)
//		{
//			int temp;
//			cin >> temp;
//			build.push_back(temp);
//		}
//		while (K--)
//		{
//			int start, finish;
//			cin >> start >> finish;
//			build_tree[finish].push_back(start);
//		}
//		cin >> W;
//		queue.push(W);
//		result[W] = build[W];
//		while (!queue.empty())
//		{
//			int pos = queue.front();
//			queue.pop();
//
//			for (auto iter : build_tree[pos])
//			{
//				result[iter] = max(result[iter], result[pos] + build[iter]);
//				queue.push(iter);
//			}
//		}
//		auto max_value = max_element(result.begin(), result.end());
//		cout << *max_value << endl;
//	}
//	system("pause");
//	return 0;
//}