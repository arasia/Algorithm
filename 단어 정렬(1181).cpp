/*#include <iostream>
#include <algorithm>
#include <string>
using namespace std;
string arr[20000] = {};
bool cmp(const string &a, const string &b)
{
    if(a.length() < b.length())
        return 1;
    else if(a.length() > b.length())
        return 0;
    else if(a.compare(b) < 0)
        return 1;
    else
        return 0;
}
int main()
{
    int N;
    int count = 1;
    cin >> N;
    for(int i = 0 ; i < N ; i++)
        cin >> arr[i];
    sort(arr, arr+N, cmp);
    cout << arr[0] << "\n";
    for(int i = 1 ; i < N ; i++)
    {
        if(arr[i] != arr[i-1])
            cout << arr[i] << "\n";
    }
    return 0;    
}*/