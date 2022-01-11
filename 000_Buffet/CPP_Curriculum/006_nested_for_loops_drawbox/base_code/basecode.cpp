// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	//find width, height , and symbol then make a box/rectangle with the data
	
	int width = 0;
	cout << "Please enter box width: ";
	cin >> width;
	
	char s = 0;
	cout << "Please enter border char: ";
	cin >> s;
	
	int height = 0;
	cout << "Please enter box height: ";
	cin >> height;
	
	for(int x = 1; x <= height; x++) {
		for(int y = 1; y <= width; y++){
			cout << s;
		}
		cout << endl;
	}
	
	
	
	
	
	
}
