// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	
	int width = 0;
	cout << "Please enter box width: ";
	cin >> width;
	
	char border = 0;
	cout << "Please enter border char: ";
	cin >> border;
	
	int height = 0;
	cout << "Please enter box height: ";
	cin >> height;
	
	int x = 0;
	cout << "Please enter line x coordinate: ";
	cin >> x;
	
	int y = 0;
	cout << "Please enter line y coordinate: ";
	cin >> y;
	
	for(int h = 1; h <= height; h++) {
		for(int s = 1; s <= width; s++) {
			gotoxy(x + s, y + h);
		    cout << border;
		}
	}
	
	
}
