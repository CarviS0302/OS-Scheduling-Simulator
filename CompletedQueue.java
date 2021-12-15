package Simulation;

import java.util.ArrayList;

//over
public class CompletedQueue{
	
	private ArrayList<Process> array;
	
	public CompletedQueue() {
		this.array = new ArrayList<Process>();
	}

	public void add(Process process) {
		array.add(process);
	}
	public Process getNext() {
		return array.remove(0);
	}
	public int getSize() {
		return array.size();
	}
	public boolean isEmpty() {
		return array.isEmpty();
	}

}
