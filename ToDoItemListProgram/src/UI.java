import java.io.*;

public class UI {
	
	public void printMenu(){
		
		System.out.println("");
		System.out.println("What do you wanna do?");
		System.out.println("-----------------------------------------");
		System.out.println("Menu");
		System.out.println("-----------------------------------------");
		System.out.println("Add a new item to the To Do list (A)");
		System.out.println("Print out the whole To Do list (P)");
		System.out.println("Mark a To Do item as Done (D)");
		System.out.println("Remove a To Do item (R)");
		System.out.println("Remove all done items (I)");
		System.out.println("Search for a To Do item (S)");
		System.out.println("Edit a To Do item (E)");
		System.out.println("Mark a To Do item as not done (N)");
		System.out.println("Exit program (X)");
		System.out.println("-----------------------------------------");
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
	
	public ToDoItemList loadFromFile(String fileName) throws FileNotFoundException{
		
		
		//System.out.println("Inside the loadFromFile method");
		
		try {

			return XmlIO.loadObject(fileName, ToDoItemList.class);
		} catch (IOException e) {
			
			throw new FileNotFoundException();
		}
	}
	

}
