package tsm01_J_CSVFPI;

final class Publisher {

	static volatile Publisher published; 
	int num;

	Publisher(int number) { 
		// Initialization 
		this.num = number;
		// ...

		published = this; 
	}
}