// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;

	
	for(int i = 0; i < 5; i++){
		gotoxy(3 + i,6 + i);
		cout << "%" << endl;
		
	}
}	
