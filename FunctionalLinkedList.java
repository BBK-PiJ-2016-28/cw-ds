
public class FunctionalLinkedList extends LinkedList implements FunctionalList{
	int count = 1;
	FunctionalLinkedList emptyList;
	
	public ReturnObject head() {
		if(firstLink == null){
			return ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return ro = new ReturnObjectImpl(firstLink);
		}
	}

	
	public FunctionalList rest() { 
		if(firstLink.getNextNode() == null){
			System.out.println("rest() function called and is empty so returning empty list"); 
			return emptyList = new FunctionalLinkedList();
		} else {
			get(count);
			count++;
		}
		return null;
	}

}
