package Simulation;

public class Event {
	
	
	private String type;
	private long timestamp;
	
	public Event(String type, long timestamp){
		this.type = type;
		this.timestamp = timestamp;
	}
	
	public String getType() {
		return this.type;
	}
	public long getTimestamp() {
		return this.timestamp;
	}
	public char getType_char() {
		switch(this.type) {
		case "New Process":
			return 'N';	
		case "Ready -> CPU":
			return 'R';
		case "Quantum Expired":
			return 'Q';
		case "Process Finished":
			return 'F';
		case "I/O Call":
			return 'I';
		case "I/O Completed":
			return 'O';				
		}
		return 0;
			
	}
	

}
