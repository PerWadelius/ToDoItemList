import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {

		
		ToDoItemList itemList = new ToDoItemList();
		UI ui = new UI();
		
		
		try {
			System.out.println("Try to load file...");
			itemList= itemList.loadFromFile("ToDoItemList.xml");
			System.out.println("File loaded...");

		} catch (FileNotFoundException e){
			
			System.out.println("File not found");
		}
		
				
		
		boolean exitProgram = false;
		
		while(!exitProgram){
			
			ui.printMenu();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			str = br.readLine();
			
			str = str.toLowerCase();
			

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
						
				case "sid":
						System.out.println("Which ID do you search for? ");
						try {
							sc = new Scanner(System.in);
						    int i = sc.nextInt();
							ui.printToDoItem(itemList.findByID(i));
							
						} 
						catch (ToDoItemNotFoundException e) {
							System.out.println("Item not found");
						}
						catch (NullPointerException e){
							System.out.println("NullpointerException");
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
						System.out.println("Which file do you want to load from? ");
						itemList.clearList();
						itemList = itemList.loadFromFile(ui.readInputFromUser());
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
						
				case "sort name":
						MyComparator.setSortingType(1);
						itemList.sort();
						break;
				case "sort ID":
						MyComparator.setSortingType(2);
						itemList.sort();
						break;
				case "sort ready date":
						MyComparator.setSortingType(3);
						itemList.sort();
						break;
					
				default: 
					
						break;
						
				
			}	
		}
		
			
	}

}
