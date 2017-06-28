import java.util.Date;

public class ToDoItem {

	private String itemName;
	private boolean done;
	private Date timeStamp;
	
	
	public ToDoItem(String itemName) {
		this.itemName = itemName;
		this.done = false;
		this.timeStamp = new Date();
		
//		System.out.println("Creating item with name: " + this.itemName + " isDone: " + this.done + " timeStamp = " + this.timeStamp.toString());
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


//	public void setItemName(String newName) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public String toString() {
		return "itemName= " + itemName + ", is done= " + done + ", Item created on= " + timeStamp;
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



	
	
	
	
	
	
	
}
