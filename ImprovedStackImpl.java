
public class ImprovedStackImpl implements ImprovedStack{
	protected List internalList;
	public int size;
	public int reverseSize;
	ReturnObjectImpl ro;
	List reversedList;
	Object firstLink; 
	
	//constructors
	ImprovedStackImpl(List list){
		this.internalList = list;
		size = internalList.size();
	}
	
	public boolean isEmpty() {
		if(size == 0){
			return true;
		} else {
		return false;
		}
	}

	
	public int size() {
		return size;
	}

	
	public void push(Object item) {
		internalList.add(item);
		internalList.size();
	}

	
	public ReturnObject top() {
		if(isEmpty() == false){ return internalList.get(0); }
		else {return ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);}
		
	}

	@Override
	public ReturnObject pop() {
		if (isEmpty() == true){
			ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			internalList.get(0);
			internalList.remove(0);
			size = internalList.size();
		}
		return null;
	}

	@Override
	public ImprovedStack reverse() {
		for(int revCount = internalList.size(); size > 0; size--){
			System.out.println(internalList.get(size));
		}
		return null;
	}

	@Override
	public void remove(Object object) {
		if(object.equals(firstLink)){
			pop();
		}
		Object current = firstLink;
		while(!current.getNextNode().equals(object)){
			current = current.getNextNode();
		}
		current = current.getNextNode().getNewNode();
		
	}

}
