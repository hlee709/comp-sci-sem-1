// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	
	for(int s = 1; s < 9; s++){
		gotoxy(4, 4 + s);
		cout << "*" << endl;
		sleep(1);
		gotoxy(4, 4 +s);
		cout << " " << endl;
	}
	
	

}
