package Simulation;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.PriorityQueue;

public class EventQueue {
	
	private PriorityQueue<Event> queue;
	
	public EventQueue() {
		this.queue = new PriorityQueue<Event>(new Comparator<Event>() {
			public int compare(Event a, Event b) {
				if (a.getTimestamp() < b.getTimestamp()) {
					return -1;
				}else if (a.getTimestamp() == b.getTimestamp()){
					return 1;
				}else{
					return 1;
				}
			}
		});
	}
	//for: when a new event is created, add it to this event holder
	public void addEvent(Event event) {
		queue.add(event);
	}
	//for: execute the first event
	public Event runEvent() {
		return queue.remove();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public int getSize() {
		return queue.size();
	}
	public String toString() {
		String str = "";
		String temp;
		PriorityQueue<Event> tempQueue = new PriorityQueue<Event>(this.queue);
		int size = tempQueue.size();
		
		
		if(size != 0) {
			for(int i=0; i<size; i++) {
				Event curEvent = tempQueue.poll();
				double time =  curEvent.getTimestamp()  * 1.0 / 1000000L;
				BigDecimal T = new BigDecimal(time+""); 
				temp = "(" +  curEvent.getType_char() + ": " + T + ") ";
				str = str + temp;
			}
		}
		
		return str;
	}
	
	
	
	
}

/*
//custom the comparator, the smarter the timestamp, the higher the priority
class CustomComparator{
	public int compare(Event a, Event b) {
		if (a.getTimestamp() < b.getTimestamp()) {
			return 1;
		}else if (a.getTimestamp() == b.getTimestamp()){
			return 0;
		}else{
			return -1;
		}
	}
}
*/