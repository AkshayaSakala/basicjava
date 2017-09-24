
public class Car {
	String name;
	int horsePower;
	boolean started = false;

	void start() {

		if (started == true) {
			System.out
					.println("Sorry you have already started the car  before. You need to stop before you start again");
		} else {
			System.out.println("starting: " + name + " which has: " + horsePower + " horsepower");

			started = true;
		}

	}

	void stop() {

		if (started == true) {
			System.out.println("Stopping: " + name);
			started = false;
		} else {
			System.out.println("Sorry you have already stopped the car before. You need to start before you stop again");
			
		}

	}

}
