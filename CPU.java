package Simulation;

import java.util.ArrayList;

public class CPU {
	private ArrayList<Process> array;
	
	public CPU() {
		this.array = new ArrayList<Process>(1);
	}
	
	public void runProcess(Process process) {
		array.add(process);
	}
	public Process throwProcess() {
		return array.remove(0);
	}
	public boolean isEmpty() {
		return array.isEmpty();
	}
	public int getSize() {
		return array.size();
	}
	public Process getCurProcess() {
		return array.get(0);
	}
}
