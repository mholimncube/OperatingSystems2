import java.util.concurrent.Semaphore;

public class WetDishRack {
	// add variables
	int rackSize;
	int dirtyDish;
	int wetDish;
	int cleanedDish;
	int[] tempArray;
	Semaphore mutex;
	Semaphore emptyRack;
	Semaphore fullRack;
	
	

	WetDishRack(int rackSize) {
	    // add correct code here 
		this.rackSize = rackSize;
		dirtyDish = 0;
		wetDish = 0;
		cleanedDish = 0;
		mutex = new Semaphore(1);
		tempArray = new int [rackSize];
		emptyRack = new Semaphore(0);
		fullRack =  new Semaphore(rackSize);
	}
	
	public void addDish(int dish_id){ //if dish is dirty is is added to rack
		// add correct code here
		try{
			fullRack.acquire(); //dish added to rack
			mutex.acquire(); 
			
			mutex.release(); //tells threads to continue to what process they are doing
			emptyRack.release();
		}
		catch(InterruptedException e){e.printStackTrace();}
		
		tempArray[dirtyDish] = dish_id;
		dirtyDish = (dirtyDish + 1)%rackSize;
	}
	
	public int removeDish(){  //if dish is washed it is removed from rack
		// replace with correct code here
		try{
			emptyRack.acquire();
			mutex.acquire();
			
			mutex.release();
			fullRack.release();
		}
		catch(InterruptedException e){e.printStackTrace();}
		cleanedDish = tempArray[wetDish%rackSize];
		wetDish++;
		return cleanedDish; 	}
	
}



