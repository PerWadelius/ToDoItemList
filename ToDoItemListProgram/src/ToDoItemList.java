import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class ToDoItemList {
	
	public ArrayList<ToDoItem> itemList;
	
	
	public ToDoItemList(){
		
		itemList = new ArrayList<ToDoItem>();
	}
	
	public void addItem(ToDoItem item){
		
		itemList.add(item);
		
	}
	
	public void clearList(){
		
		itemList.clear();
	}
	
	public void addItem(String item){
		
		ToDoItem newItem = new ToDoItem(item);
		
		itemList.add(newItem);
		
	}
	
	public void removeItem(String item){
		
		ToDoItem itemToRemove = new ToDoItem(item, true);

		itemList.remove(itemToRemove);
		
		
		
		
	}
	
	public void removeAllDoneItems(){
		
		
		
		Iterator<ToDoItem> it = itemList.iterator();
		while (it.hasNext()){
		
			if(it.next().isDone()){			
				it.remove();
			}
		
		}
		

			
	}
	
	public void markItemDone(String item){
		
		for(ToDoItem toDoItem : itemList ){
			
			if(toDoItem.getName().equalsIgnoreCase(item)){
				
				toDoItem.setDone(true);
				
			}
		}
	}
	
	public void markItemNotDone(String item){
		
		for(ToDoItem toDoItem : itemList ){
			
			if(toDoItem.getName().equalsIgnoreCase(item)){
				
				toDoItem.setDone(false);
				
			}
		}
	}
	
	public void editItem(ToDoItem item, String newName){
		
		for(ToDoItem toDoItem : itemList ){
			
			if(toDoItem.equals(item)){
				
				toDoItem.setItemName(newName);
				
			}
		}
		
	}
	
	public void setReadyDate(ToDoItem item, String readyDate){
		
		for(ToDoItem toDoItem : itemList ){
			
			if(toDoItem.equals(item)){
				
				toDoItem.setReadyDate(readyDate);
				
			}
		}
		
	}
	
	
	
	public void printToDoItemList(){
		
		
		if(itemList.size() == 0 ){
			
			System.out.println("List is empty");
		}
		
		for(ToDoItem toDoItem : itemList ){
			
			//System.out.println(toDoItem.toString());
			
			System.out.println("---------------------------------------------------");
			System.out.println("ID: " + toDoItem.getID());
			System.out.println("Name: " + toDoItem.getItemName());
			System.out.println("Created: " + toDoItem.getTimeStamp());
			System.out.println("Planned ready date: " + toDoItem.getReadyDate());
			System.out.println("Status: " + (toDoItem.isDone()? "Done" : "Not done" ));
			System.out.println("---------------------------------------------------");

			
		}
		
	}
	
	
	public ToDoItem findByName(String item) throws ToDoItemNotFoundException {
		
		
		
		for(ToDoItem toDoItem : itemList ){
			
			if(toDoItem.getName().equalsIgnoreCase(item)){
				
				return toDoItem;
				
			}
		}
		
		throw new ToDoItemNotFoundException();
	
	}
	
	public ToDoItem findByID(int ID) throws ToDoItemNotFoundException {
		
		
		for(ToDoItem toDoItem : itemList ){
			
			
			if(toDoItem.getID() == ID){
				
				return toDoItem;
				
			}
		}
		
		throw new ToDoItemNotFoundException();
	
	}
	

	public void writeToFile(String fileName, ToDoItemList todo) throws IOException {
			XmlIO.saveObject(fileName, todo);
	
	}
	public void writeToFile(String fileName) throws IOException {
		XmlIO.saveObject(fileName, this);

	}
	
	public ToDoItemList loadFromFile(String fileName) throws FileNotFoundException{
		

		
		try {

			return XmlIO.loadObject(fileName, ToDoItemList.class);
		} catch (IOException e) {
			
			throw new FileNotFoundException();
		}
	}

	public void sort() {
		
		Collections.sort(itemList, new MyComparator() );
	}
	
	

	
}
