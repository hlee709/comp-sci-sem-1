// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	int x = 5;
	int y = 15;
	while(x <= 25) {
		cout << x << endl;
		
		x = x + 1;
	}
	
	cout << endl;
	
	while(true) {
		cout << y << endl;
		if(y == 5) {
			break;
		}
		y = y - 1;
	}
	
	cout << endl;
	
	for(int i = 5; i <= 25; i = i + 1){
		cout << i << endl;
	}
	
	cout << endl;
	
	for(int i = 15; i >= 5; i = i - 1){
		cout << i << endl;
	}

}
