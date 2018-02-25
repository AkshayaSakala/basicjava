
public class Math {

	int getAbsoluteValue(int number) {

		if (number >= 0) {
			return number;
		} else {
			return number * -1;
		}

	}

	int getMax(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
}
