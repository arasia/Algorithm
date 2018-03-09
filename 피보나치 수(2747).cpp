/*#include<iostream>
#include<cstdio>
#include<cstring>
using namespace std;
int N, arr[47];
int func(int a)
{
	if (a == 0 || a == 1)
		return a;
	int& ans = arr[a];
	if (ans != -1)
		return ans;
	return ans = func(a - 1) + func(a - 2);
}
int main()
{
	memset(arr, -1, sizeof(arr));
	scanf("%d", &N);
	printf("%d", func(N));
	return 0;
}*/