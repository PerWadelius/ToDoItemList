import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		
		ToDoItemList itemList = new ToDoItemList();
		
		
		UI ui = new UI();
		
				
		
		boolean exitProgram = false;
		
		while(!exitProgram){
			
			ui.printMenu();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			str = br.readLine();
			
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
			
				case "A": 
						itemList.addItem(ui.addNewItem());
						
						break;
				case "P": 
						itemList.printToDoItemList();
				
						break;
				case "D": 
						System.out.println("Which Item do you want to mark as Done? ");
						itemList.markItemDone(ui.readInputFromUser());
				
						break;
				case "R": 
						System.out.println("Which Item do you want to remove from the list? ");
						itemList.removeItem(ui.readInputFromUser());
						break;
				case "I": 
						itemList.removeAllDoneItems();  
					
						break;
				case "S": 
						System.out.println("Which Item do you search for? ");
						try {
								System.out.println(itemList.findByName(ui.readInputFromUser()));
						} catch (ToDoItemNotFoundException e) {
								System.out.println("Item not found");
						}
					
						break;
				case "E": 
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
						
				case "N": 
						System.out.println("Which Item do you want to mark as not Done? ");
						itemList.markItemNotDone(ui.readInputFromUser());
					
						break;
				case "X": 
						exitProgram = true;
						System.out.println("Program will exit ...");
						break;
				default: 
					
						break;
						
				
			}	
		}
		
			
	}

}
