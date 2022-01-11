// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	//tree
	gotoxy(5, 11);
	cout << "|";
	gotoxy(6, 11);
	cout << "|";
	gotoxy(2, 10);
	cout << "*";
	gotoxy(3, 10);
	cout << "*";
	gotoxy(4, 10);
	cout << "o";
	gotoxy(5, 10);
	cout << "*";
	gotoxy(6, 10);
	cout << "*";
	gotoxy(7, 10);
	cout << "*";
	gotoxy(8, 10);
	cout << "o";
	gotoxy(9,10);
	cout << "*";
	gotoxy(3, 9);
	cout << "*";
	gotoxy(4, 9);
	cout << "*";
	gotoxy(5, 9);
	cout << "o";
	gotoxy(6, 9);
	cout << "*";
	gotoxy(7, 9);
	cout << "o";
	gotoxy(8,9);
	cout << "*";
	gotoxy(4, 8);
	cout << "o";
	gotoxy(5, 8);
	cout << "*";
	gotoxy(6, 8);
	cout << "o";
	gotoxy(7, 8);
	cout << "*";
	gotoxy(5, 7);
	cout << "*";
	gotoxy(6, 7);
	cout << "*";
	
	while(true){
		for(int s = 1; s < 8; s++){
		gotoxy(1, 2 + s);
		cout << "*" << endl;
		sleep(1);
		gotoxy(1, 2 + s);
		cout << " " << endl;
		gotoxy(1, 3 + s);
		cout << "*" << endl;
		sleep(1);
		gotoxy(1, 3 + s);
		cout << " " << endl;
		gotoxy(10, 2 + s);
		cout << "*" << endl;
		sleep(1);
		gotoxy(10, 2 + s);
		cout << " " << endl;
		gotoxy(10 , 3 + s);
		cout << "*" << endl;
		sleep(1);
		gotoxy(10, 3 + s);
		cout << " " << endl;
	
		}
	
		for(int n = 1; n < 5; n ++){
		gotoxy(3, 3 + n);
		cout << "*" << endl;
		sleep(1);
		gotoxy(3, 3 + n);
		cout << " "<< endl;
		}
		
		for(int c = 1; c < 3; c ++){
			gotoxy(6, 3 + c);
			cout << "*" << endl;
			sleep(1);
			gotoxy(6, 3 + c);
			cout << " " << endl;
		}
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	gotoxy(1, 30);

}
