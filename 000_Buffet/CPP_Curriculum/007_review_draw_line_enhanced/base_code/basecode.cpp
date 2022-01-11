// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	int l = 0;
	cout << "Please enter line length: ";
	cin >> l;
	
	char s = 0;
	cout << "Please enter line symbol: ";
	cin >> s;
	 
	int x = 0;
	cout << "Please enter line x coordinate: ";
	cin >> x;
	
	int y = 0;
	cout << "Please enter line y corrdinate: ";
	cin >> y;
	
	int c = 0;
	while(true){
	    if(c == l){
	        break;
	    }
	    c = c + 1;
	    gotoxy(x+c, y);
	    cout << s;
	}
	
	







}
