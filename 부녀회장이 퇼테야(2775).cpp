/*#include<iostream>

using namespace std;

int main()
{
	int test_case;
	cin >> test_case;
	
	int arr[15][15] = {0,};
	
	for(int i = 0 ; i < 15 ; i++)
	{
		arr[i][1] = 1;
		arr[0][i] = i;
	}
	
	while(test_case--)
	{
		int k, n;
		cin >> k >> n;
		
		for(int i = 1 ; i <= k ; i++)
		{
			for(int j = 2 ; j <= n ; j++)
			{
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		cout << arr[k][n] << endl;;
	}
	
	return 0;
}*/