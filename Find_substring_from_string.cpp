
#include <iostream>

using namespace std;

int main()
{
    string str1,str2;
    cin>>str1>>str2;
    
    bool found = str1.find(str2) != string::npos;
    if(found){
        cout<<"Found";
        
    }else{
        cout<<"not found";
    }

    return 0;
}
