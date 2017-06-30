import java.util.Comparator;

public class MyComparator implements Comparator<ToDoItem> {

	
	private static int sortingType;
	
	
	public static int getSortingType() {
		return sortingType;
	}


	public static void setSortingType(int sortingType) {
		MyComparator.sortingType = sortingType;
	}


	@Override
	public int compare(ToDoItem o1, ToDoItem o2) {
		 if(sortingType == 1){
			   
			   return o1.getItemName().compareTo(o2.getItemName());
				  
			   
		   } else if(sortingType == 2){
			   
			   if(o1.getID() < o2.getID() ){
				   return -1;
			   } else if (o1.getID() == o2.getID()){
				   return 0;
			   } else {
				   return 1;
			   }
			   
		   } else if(sortingType == 3){
			   
			   return o1.getReadyDate().compareTo(o2.getReadyDate());
			   
		   } else {
			   return o1.getItemName().compareTo(o2.getItemName());

		   }
		   
		   
	}

}
