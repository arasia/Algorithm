//#include <iostream>
//#include <vector>
//#include <string>
//#include <cmath>
//#include <algorithm>
//using namespace std;
//
///*
//* Time complexity: O(n^2)
//* Space complexity: O(n)
//*/
//struct shop {
//	double x, y;
//	int cupon, dist;
//	string name;
//	shop(double x, double y, string name, int cupon, int dist)
//	{
//		this->x = x;
//		this->y = y;
//		this->name = name;
//		this->cupon = cupon;
//		this->dist = dist;
//	}
//};
//void print(vector<shop> shop)
//{
//	for (int i = 0; i < shop.size(); i++)
//	{
//		cout << shop[i].x << " " << shop[i].y << " " << shop[i].name << " " << shop[i].cupon << "\n";
//	}
//}
//bool cmp(const shop &a, const shop &b)
//{
//	if (a.dist < b.dist)
//		return 1;
//	else if (a.dist > b.dist)
//		return 0;
//	else
//	{
//		if (a.cupon < b.cupon)
//			return 0;
//		else if (a.cupon > b.cupon)
//			return 1;
//		else if (a.name.compare(b.name) < 0)
//			return 1;
//		else
//			return 0;
//	}
//}
//int main(int argc, const char *argv[]) {
//	double my_x, my_y;
//	int shop_count;
//	vector<shop> shop_list;
//
//	cin >> my_x >> my_y >> shop_count;
//
//	for (int i = 0; i < shop_count; i++)
//	{
//		double temp_x, temp_y;
//		int temp_cupon, temp_dist;
//		string temp_name;
//		cin >> temp_x >> temp_y >> temp_name >> temp_cupon;
//		temp_dist = sqrt(pow(my_x - temp_x, 2) + pow(my_y - temp_y, 2));
//		temp_dist -= temp_dist % 100;
//		shop temp_shop(temp_x, temp_y, temp_name, temp_cupon, temp_dist);
//		shop_list.push_back(temp_shop);
//	}
//	sort(shop_list.begin(), shop_list.end(), cmp);
//	print(shop_list);
//	return 0;
//}
