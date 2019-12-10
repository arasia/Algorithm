/*#include<iostream>
#include<cstdio>

using namespace std;

int main()
{
	int num;
	cin >> num;
	int arr[8001] = {0,};
	int avg = 0, min = 5000, max = -5000;
	int mid, count = 0, mid_flag = 0;
	int com1 = 0, com2 = 0, com_count = 0, com_flag = 0; 
	
	for(int i = 0 ; i < num ; i++)
	{
		int temp;
		cin >> temp;
		arr[temp+4000]++;
		avg += temp;
		if(min > temp)
			min = temp;
		if(max < temp)
			max = temp;
	}
	
	for(int i = 0 ; i < 8001 ; i++)
	{
		count += arr[i];
		if((mid_flag == 0)&&(count >= (num+1)/2))
		{
			mid = i-4000;
			mid_flag = 1;
		}
			
		if(com_count < arr[i])
		{
			com1 = i-4000;
			com_count = arr[i];
			com_flag = 1;
		}
		else if((com_flag == 1)&&(com_count == arr[i]))
		{
			com2 = i-4000;
			com_flag = 2;
		}
	}
	
	if(com_flag == 2)
		com1 = com2;
	
	printf("%0.0f\n%d\n%d\n%d", (double)avg/num, mid, com1, max-min);
	return 0;
}*/