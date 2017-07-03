import java.io.*;

public class UI {
	
	public void printMenu(){
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("Menu");
		System.out.println("------------------------------------------------");
		System.out.println("(A) - Add a new item to the To Do list");
		System.out.println("(P) - Print out the whole To Do list");
		System.out.println("(D) - Mark a To Do item as Done");
		System.out.println("(R) - Remove a To Do item");
		System.out.println("(I) - Remove all done items");
		System.out.println("(S) - Search for a To Do item");
		System.out.println("(E) - Edit a To Do item");
		System.out.println("(N) - Mark a To Do item as not done");
		System.out.println("(clear) - Empty the list");
		System.out.println("(save) - Save the list to a xml file");
		System.out.println("(load) - Load the list from a xml file");
		System.out.println("(sort name) - Sort the list on name");
		System.out.println("(sort ID) - Sort the list on ID");
		System.out.println("(sort ready date) - Sort the list on ready date");
		System.out.println("(X) Exit program");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}
	
	
	public ToDoItem addNewItem() throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter the name of the Item.");
		str = br.readLine();
		
		return new ToDoItem(str);
	}
	
	public String readInputFromUser() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
		
		return str;
	}
	
	
	
	
	
	public void printToDoItem(ToDoItem toDoItem){
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("ID: " + toDoItem.getID());
		System.out.println("Name: " + toDoItem.getItemName());
		System.out.println("Created: " + toDoItem.getTimeStamp());
		System.out.println("Planned ready date: " + toDoItem.getReadyDate());
		System.out.println("Status: " + (toDoItem.isDone()? "Done" : "Not done" ));
		System.out.println("---------------------------------------------------");

	
	}

}
