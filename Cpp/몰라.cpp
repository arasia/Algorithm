//#define _CRT_SECURE_NO_WARNINGS
//
//#include <iostream>
//#include <cstdio>
//#include <cstdlib>
//#include <cmath>
//
//using namespace std;
//int main()
//{
//	int T;
//	cin >> T;
//
//	FILE *file = fopen("test.txt", "w+");
//
//	for(int i = 1 ; i <= T ; i++)
//	{
//		long long N, temp, pos = 0, count = 1, num, result;
//		cin >> N;
//		temp = N;
//
//		while (temp)
//		{
//			if ((temp % 10) % 2 == 1)
//			{
//				pos = count;
//				num = temp % 10;
//			}
//			temp /= 10;
//			count++;
//		}
//		//cout << pos << " : " << count << "\n";
//
//		if (pos == 0)
//		{
//			result = 0;
//		}
//		else
//		{
//			if (count == 2 || pos == 1)
//			{
//				result = 1;
//			}
//			else
//			{
//				long long a = pow(10, pos - 1);
//				long long b = a / 10;
//				long long lass = N % a;
//				long long result1, result2, mi = 1;
//
//				//cout << "a : " << a << ", b : " << b << ", lass : " << lass << endl;
//				
//				pos -= 2;
//				while (pos--)
//				{
//					mi = mi * 10 + 1;
//				}
//				mi++;
//				//cout << "mi : " << mi << endl;;
//				result1 = lass + mi;
//				result2 = a - lass;
//				//cout << result1 << " :: " << result2 << endl;
//				if (result2 < result1)
//					result = result2;
//				else
//					result = result1;
//			}
//		}
//		//cout << result << "\n";
//		fprintf(file, "Case #%d: %lld\n", i, result);
//		
//	}
//
//	fclose(file);
//	system("pause");
//	return 0;
//}