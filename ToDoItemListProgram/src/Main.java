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
					
						break;
				case "E": 
					
						break;
				case "N": 
					
						break;
				case "X": 
						exitProgram = true;
						System.out.println("Program will exit");
						break;
				default: 
					
						break;
						
				
			}	
		}
		
		
		
//		itemList.addItem(newItem);
//		
//		itemList.addItem("Item A");
//		itemList.addItem("Item B");
//		itemList.addItem("Item C");
//		
		
//		System.out.println("Nu ser att g�ra listan ut s� h�r: ");
//		itemList.printToDoItemList();
//				
//		System.out.println("Nu tar vi bort ett item fr�n listan");
//		itemList.removeItem("Item B");
//			
//		System.out.println("D� ser listan ut s� h�r: ");
//		itemList.printToDoItemList();
//		
//		System.out.println("Nu markerar vi ett item som done");
//		itemList.markItemDone("Item C");
//		itemList.markItemDone("Item D");
//
//		
//		System.out.println("D� ser listan ut s� h�r: ");
//		itemList.printToDoItemList();
//		
//		System.out.println("Nu tar vi bort all gjorda items");
//		itemList.removeAllDoneItems();
//		
//		System.out.println("D� ser listan ut s� h�r: ");
//		itemList.printToDoItemList();
//		
//		System.out.println("Nu markerar vi ett item som not done");
//		itemList.markItemNotDone("Item C");
//		
//		System.out.println("D� ser listan ut s� h�r: ");
//		itemList.printToDoItemList();
		
		
		

//		try {
//			ToDoItem temp;
//			temp = itemList.findByName("Item B");
//			System.out.println("Item found");
//			System.out.println(temp.toString());
//			itemList.removeItem(temp.getName());
//			System.out.println("Item removed");
//		}
//		catch (ToDoItemNotFoundException e){
//			
//			System.out.println("Exception: Item not found");
//		}
//		
		
//		try {
//			ToDoItem temp;
//			temp = itemList.findByName("Item B");
//			System.out.println("Item found");
//			System.out.println(temp.toString());
//			
//		}
//		catch (ToDoItemNotFoundException e){
//			
//			System.out.println("Exception: Item not found");
//		}
//		
//		
	
	}

}
