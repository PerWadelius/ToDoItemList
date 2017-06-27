import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;



public class ToDoItemList {
	
	ArrayList<ToDoItem> itemList;
	
	
	public ToDoItemList(){
		
		itemList = new ArrayList<ToDoItem>();
	}
	
	public void addItem(ToDoItem item){
		
		itemList.add(item);
		
	}
	
	public void addItem(String item){
		
		ToDoItem newItem = new ToDoItem(item);
		
		itemList.add(newItem);
		
	}
	
	public void removeItem(String item){
		
		ToDoItem itemToRemove = new ToDoItem(item);

		itemList.remove(itemToRemove);
		
		
	}
	
	public void removeAllDoneItems(){
		
		
		
		Iterator<ToDoItem> it = itemList.iterator();
		while (it.hasNext()){
		
			if(it.next().isDone()){			
				it.remove();
			}
		
		}
		
		
//		ToDoItem toDoItem;
//		
//		for(int i = 0; i < itemList.size();i++){
//		for(ToDoItem toDoItem : itemList ){
//			
//			toDoItem = itemList.get(i);
//			
//			if(toDoItem.isDone()){
//				
//				itemList.remove(toDoItem);
//			}
//		}
			
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
	
	
	
	public void printToDoItemList(){
		
		for(ToDoItem toDoItem : itemList ){
			
			System.out.println(toDoItem.toString());
			
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
	
}
