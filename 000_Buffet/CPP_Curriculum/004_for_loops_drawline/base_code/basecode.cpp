// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	while(true) {
		char s;
		char x;
		cout << endl;
		cout << "Please enter a symbol: ";
		cin >> s;
	
		int num = 0;
		cout << "Please enter line length: ";
		cin >> num;
	
	
		cout << "horizontal or vertical?(h or v?): ";
		cin >> x; 
		
		int c = 0;
		while(x == 'h') {
			if(c == num) {
			break;
			}
			c = c + 1;
			cout << s;
		}
		
		
		int b = 0;
		while(x == 'v') {
			if(b == num) {
			break;
			}
			cout << s << endl;
			b = b + 1;
			
		}
		
		
		
	}
}
