import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		ToDoItemList itemList = new ToDoItemList();
		
		ToDoItem newItem = new ToDoItem("Item D");
		
		UI ui = new UI();
		
		
		System.out.println("Testar en uppdatering med Git");
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean exitProgram = false;
		
		while(!exitProgram){
			
			ui.printMenu();
			
//			System.out.println("Add a new item to the To Do list (A)");
//			System.out.println("Print out the whole To Do list (P)");
//			System.out.println("Mark a To Do item as Done (D)");
//			System.out.println("Remove a To Do item (R)");
//			System.out.println("Remove all done items (I)");
//			System.out.println("Search for a To Do item (S)");
//			System.out.println("Edit a To Do item (E)");
//			System.out.println("Mark a To Do item as not done (N)");
//			System.out.println("Exit program (X)");
			
			switch (sc.next()){
			
				case "A": 
						ui.addNewItem();
					
						break;
				case "P": 
						itemList.printToDoItemList();
				
						break;
				case "D": 
				
						break;
				case "R": 
					
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
		
		
		itemList.addItem(newItem);
		
		itemList.addItem("Item A");
		itemList.addItem("Item B");
		itemList.addItem("Item C");
		
		
		System.out.println("Nu ser att göra listan ut så här: ");
		itemList.printToDoItemList();
				
		System.out.println("Nu tar vi bort ett item från listan");
		itemList.removeItem("Item B");
			
		System.out.println("Då ser listan ut så här: ");
		itemList.printToDoItemList();
		
		System.out.println("Nu markerar vi ett item som done");
		itemList.markItemDone("Item C");
		itemList.markItemDone("Item D");

		
		System.out.println("Då ser listan ut så här: ");
		itemList.printToDoItemList();
		
		System.out.println("Nu tar vi bort all gjorda items");
		itemList.removeAllDoneItems();
		
		System.out.println("Då ser listan ut så här: ");
		itemList.printToDoItemList();
		
//		System.out.println("Nu markerar vi ett item som not done");
//		itemList.markItemNotDone("Item C");
//		
//		System.out.println("Då ser listan ut så här: ");
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
