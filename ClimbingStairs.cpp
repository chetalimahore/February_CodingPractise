#include<iostream>
#include<string>


class Solution{
	public:

		bool check(int i){
			for(int j= 1 ; j < sizeof(a) / sizeof(int); j++){
				if(i == a[j])
					return true;
			}
			return false;
		}

		int result(int i){ 
			int sum = 0;
			for(int j = 1; j < sizeof(a) / sizeof(int) ; ++j){
				if(i - b[j] > 0){
					sum += b[i - b[j]];
				}
			}
			return sum;
		}

		int climbStairs(int n) {
		 // std::cout << sizeof(a) / sizeof(int) << std::endl;
		  b = new int[n+1];
          for(int i = 1; i <= n ; ++i){
          	 if(check(i)){
          	 	b[i] = 1 + result(i);
          	 }
          	 else b[i] = result(i);
          }
          return b[n];
    }
	
	private:
		int a[3]=  {0, 1, 2};
		int *b;

};

int main(){
	Solution s;
	std::cout << s.climbStairs(38) << std::endl;

	return 0;
}

