/*#include<iostream>
#include<cstdio>
#include<vector>
using namespace std;

int main()
{
	int test_case;
	cin >> test_case;

	for (int test_count = 0; test_count < test_case; test_count++)
	{
		int student_num;
		double avg = 0;
		vector<int> student;
		int count=0;

		cin >> student_num;
		for (int i = 0; i < student_num; i++)
		{
			int temp;
			cin >> temp;
			student.push_back(temp);
			avg += temp;
		}
		avg /= student_num;

		for (auto iter : student)
		{
			if (iter > avg)
				count++;
		}
		printf("%0.3f%%\n", (double)count / student_num * 100);
	}
	return 0;
}*/