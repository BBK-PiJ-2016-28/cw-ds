
public class StackImpl extends AbstractStack {
	
	
	public int size;
	ReturnObjectImpl ro;

	public StackImpl(List list) {
		super(list);
		size = list.size();
	}

	
	public boolean isEmpty() {
		return (size == 0);
	}

	
	public int size() {
		System.out.println("The stack currently has a size of " + size);
		return size;
	}

	@Override
	public void push(Object item) {
		super.internalList.add(item);
		size = super.internalList.size();
		
	}

	@Override
	public ReturnObject top() {
		if(isEmpty() == false){ return super.internalList.get(0); }
		else {return ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);}
	}

	@Override
	public ReturnObject pop() {
		if (isEmpty() == true){
			ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			super.internalList.get(0);
			super.internalList.remove(0);
			size = super.internalList.size();
		}
		return null;
	}
	

}
