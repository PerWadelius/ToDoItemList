import java.time.LocalDate;


public class ToDoItem implements Comparable<ToDoItem>  {
	
	private static int sortingType;



	public static int getSortingType() {
		return sortingType;
	}

	public static void setSortingType(int sortingType) {
		ToDoItem.sortingType = sortingType;
	}

	public static void setTotalNumberOfItems(int totalNumberOfItems) {
		ToDoItem.totalNumberOfItems = totalNumberOfItems;
	}



	public static int totalNumberOfItems;
	
	public static int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}



	private int ID;
	
	public int getID() {
		return ID;
	}



	private String itemName;
	private boolean done;
	private String timeStamp;
	private String plannedReadyDate;
	
	public String getReadyDate() {
		return plannedReadyDate;
	}

	public void setReadyDate(String plannedReadyDate) {
		this.plannedReadyDate = plannedReadyDate;
	}

	public ToDoItem(){
		
		totalNumberOfItems++;
		
		this.ID = totalNumberOfItems;

	}
	
	public ToDoItem(String itemName, Boolean isTempObject){
		this.itemName = itemName;
		this.done = false;
		this.timeStamp = LocalDate.now().toString();
		this.plannedReadyDate = LocalDate.parse(timeStamp).plusDays(7).toString();
		this.ID = totalNumberOfItems;
		
		
		if(isTempObject == false){
			totalNumberOfItems++;
		} 
	}
	
	public ToDoItem(String itemName) {
		this.itemName = itemName;
		this.done = false;
		this.timeStamp = LocalDate.now().toString();
		this.plannedReadyDate = LocalDate.parse(timeStamp).plusDays(7).toString();
		totalNumberOfItems++;
		this.ID = totalNumberOfItems;
		
		
	}
	


	public boolean isDone() {
		return done;
	}



	public void setDone(boolean done) {
		this.done = done;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}



	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}



	public String getItemName() {
		return itemName;
	}





	@Override
	public String toString() {
		return "ID: " + ID + " Item name = " + itemName + "               Done = " + done + "         Created: " + timeStamp + "     Planned ready date: " + plannedReadyDate ;
	}



	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDoItem other = (ToDoItem) obj;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}



	public String getName() {
		
		
		return this.itemName;
	}

	
	  // Overriding the compareTo method
	   public int compareTo(ToDoItem a) {
		   
		   if(sortingType == 1){
			   
			   return this.itemName.compareTo(a.itemName);
				  
			   
		   } else if(sortingType == 2){
			   
			   if(this.ID < a.ID ){
				   return -1;
			   } else if (this.ID == a.ID){
				   return 0;
			   } else {
				   return 1;
			   }
			   
		   } else if(sortingType == 3){
			   
			   return this.plannedReadyDate.compareTo(a.plannedReadyDate);
			   
		   } else {
			   return this.itemName.compareTo(a.itemName);

		   }
		   
		   
		   
	   }


	
	
}
