package Simulation;

import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IOQueue {
	
	private PriorityQueue<Process> queue;
	
	public IOQueue() {
		this.queue = new PriorityQueue<Process>(new Comparator<Process>() {
			public int compare(Process a, Process b) {
				if (a.getCurIOcompleteTime() < b.getCurIOcompleteTime()) {
					return -1;
				}else if (a.getCurIOcompleteTime() == b.getCurIOcompleteTime()){
					return 0;
				}else{
					return 1;
				}
			}
		});
	}
	
	public void newIOwait(Process process) {
		queue.add(process);
	}
	public Process IOfinished() {
		return queue.remove();
	}
	public int getSize() {
		return queue.size();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public String toString() {
		String str = "";
		String temp;
		PriorityQueue<Process> tempQueue = new PriorityQueue<Process>(this.queue);
		Process curProcess;
		int size = tempQueue.size();
		
		
		if(size != 0) {
			for(int i=0; i<size; i++) {
				curProcess = tempQueue.poll();
				double time = curProcess.getTimeEntered() * 1.0 / 1000000L;
				BigDecimal T = new BigDecimal(time+"");
				temp = "(" +  curProcess.getPid() + ": " + T + ") ";
				str = str + temp;
			}
		}
				
		return str;
	}
	
	
	
	/*FIFO
private ArrayList<Process> array;
	
	public IOQueue() {
		this.array = new ArrayList<Process>();
	}
	
	public void addProcess(Process process) {
		array.add(process);
	}
	public Process removeProcess() {
		return array.remove(0);
	}
	
	public boolean isEmpty() {
		return array.isEmpty();
	}*/
}
