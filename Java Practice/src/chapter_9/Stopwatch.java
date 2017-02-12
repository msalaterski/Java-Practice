package chapter_9;

public class Stopwatch {

	private long startTime;
	private long endTime;
	
	Stopwatch() {
		this.startTime = System.currentTimeMillis();
	}
	
	// Return Start Time
	long getStartTime() {
		return this.startTime;
	}
	
	// Return End Time
	long getEndTime() {
		return this.endTime;
	}
	// Reset Start Time to the current time
		void start() {
			this.startTime = System.currentTimeMillis();
		}
	
	// Set End Time to the current time
		void end() {
			this.endTime = System.currentTimeMillis();
		}
		
	// Return elapsed time
		long getElapsedTime() {
			return this.endTime - this.startTime;
		}
}
