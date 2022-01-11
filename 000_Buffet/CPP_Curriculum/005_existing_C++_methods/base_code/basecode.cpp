// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
		while(true) {
		char s;
		char x;
		cout << "Please enter a symbol: ";
		cin >> s;
	
		int num = 0;
		cout << "Please enter line length: ";
		cin >> num;
	
	
		cout << "horizontal or vertical or diagonal? (h or v or d?): ";
		cin >> x; 
		
		int c = 0;
		while(x == 'h') {
			if(c == num) {
			break;
			}
			cout << s;
			c = c + 1;
		}
		
		int b = 0;
		while(x == 'v') {
			if(b == num) {
			break;
			}
			cout << s;
			b = b + 1;
			
		}
		
		int d = 0;
		while(x == 'd') {
			if(d == num) {
				break;
			}
			gotoxy(1 + d ,5  + d);
			cout << s << endl;
			d = d + 3;
		}
		
		
		
	}

}
