import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		
		ToDoItemList itemList = new ToDoItemList();
		UI ui = new UI();
		
		
		try {
			System.out.println("Try to load file...");
			itemList= ui.loadFromFile("ToDoItemList.xml");
			System.out.println("File loaded...");

		} catch (FileNotFoundException e){
			
			System.out.println("File not found");
		}
		
		System.out.println(ToDoItem.getTotalNumberOfItems());
		
				
		
		boolean exitProgram = false;
		
		while(!exitProgram){
			
			ui.printMenu();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			str = br.readLine();
			
			str = str.toLowerCase();
			
//			System.out.println("Add a new item to the To Do list (A)");
//			System.out.println("Print out the whole To Do list (P)");
//			System.out.println("Mark a To Do item as Done (D)");
//			System.out.println("Remove a To Do item (R)");
//			System.out.println("Remove all done items (I)");
//			System.out.println("Search for a To Do item (S)");
//			System.out.println("Edit a To Do item (E)");
//			System.out.println("Mark a To Do item as not done (N)");
//			System.out.println("Exit program (X)");
			
			switch (str){
			
				 
				case "a":
				case "add":
						itemList.addItem(ui.addNewItem());
						
						break;
				case "p": 
						itemList.printToDoItemList();
				
						break;
				case "d": 
						System.out.println("Which Item do you want to mark as Done? ");
						itemList.markItemDone(ui.readInputFromUser());
				
						break;
				case "r": 
						System.out.println("Which Item do you want to remove from the list? ");
						itemList.removeItem(ui.readInputFromUser());
						break;
				case "i": 
						itemList.removeAllDoneItems();  
					
						break;
				case "s": 
						System.out.println("Which Item do you search for? ");
						try {
								ui.printToDoItem(itemList.findByName(ui.readInputFromUser()));
						} catch (ToDoItemNotFoundException e) {
								System.out.println("Item not found");
						}
					
						break;
				case "save": 
						System.out.println("Which file do you want to save to? ");
						itemList.writeToFile(ui.readInputFromUser());
						break;
				
				case "clear":
					
						itemList.clearList();
						
						break;
				case "load":
					
						break;
				case "e":
				
						System.out.println("Which Item do you want to edit? ");
						String itemToEdit = ui.readInputFromUser();
						System.out.println("What is the new name of the Item?");
						String newName = ui.readInputFromUser();
						try {
							itemList.editItem(itemList.findByName(itemToEdit), newName);
						} catch (ToDoItemNotFoundException e) {
							System.out.println("Item not found in the To Do list");
						}
						break;
						
				case "n": 
						System.out.println("Which Item do you want to mark as not Done? ");
						itemList.markItemNotDone(ui.readInputFromUser());
					
						break;
				case "x": 
						exitProgram = true;
						//itemList.writeToFile("ToDoItemList.xml", itemList);
						itemList.writeToFile("ToDoItemList.xml");
						System.out.println("Program will exit ...");
						break;
						
				case "ready":
						System.out.println("Which Item do you want to set ready date on? ");
						String itemToSetReadyDate = ui.readInputFromUser();
						System.out.println("What is the ready date for the item? use yyyy-mm-dd format");
						String readyDate = ui.readInputFromUser();
						try {
							itemList.setReadyDate(itemList.findByName(itemToSetReadyDate), readyDate);
						} catch (ToDoItemNotFoundException e) {
							System.out.println("Item not found in the To Do list");
						}
						break;
					
				default: 
					
						break;
						
				
			}	
		}
		
			
	}

}
