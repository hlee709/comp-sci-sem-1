// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	int h = 0;
	char a = h;
	while(true){
		cout << "Please enter an integer: ";
		int x;
		cin >> x;

		cout << "Please enter another integer: ";
		int y;
		cin >> y;
	
		cout << "Please enter an opertation: ";
		char z;
		cin >> z;
	
		cout << x << z << y << endl;
		if(z == '/') {
	    cout << x/y << endl;
		}
		else if(z == '+') {
	    cout << x+y << endl;
		}
		else if(z == '-') {
	    cout << x-y << endl;
		}
		else if(x == '*'){
	    cout << x*y << endl;
	    }

	
	
	
	
}
}
