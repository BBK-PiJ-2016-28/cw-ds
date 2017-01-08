
public class LinkedList implements List{
	public int size;
	public Object firstLink = null; //Made a link class to manage each object, this class is the linkedlist (manager) of the objec	private 
	public ReturnObjectImpl ro;
	
	
	public boolean isEmpty() {
		if (firstLink == null){return true;}
		return false;
	}

	
	public int size() {
		System.out.println(size);
		return size;
	}

	
	public ReturnObject get(int index) {
		if (index > size || index < size - size){
			return ro = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		Object current;
		if (index <= size && index >= 0){
			current = firstLink; 
			while (current.getIndex() != index){ 
				current = current.getNextNode();
			}
			System.out.println("info for object = " + current.getInfo());
			System.out.println("info for object = " + current.getNextNode());
			 ro = new ReturnObjectImpl(current);
		} 
		return ro;
	}

	
	public ReturnObject remove(int index) {
		/**
		 * Our of bounds error if index is too large or too small.
		 */
		if (index > size || index < size - size){
			return ro = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		/**
		 * If the list is empty, there is nothing to return.
		 */
		if (firstLink == null) {
			 return ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		
		/**
		 * If the firstlink is equal to index, remove the first link
		 */
		if(firstLink.getIndex() == index){
			firstLink = firstLink.getNextNode();
			firstLink.setIndex(0);
			size--;
		}
		/**
		 * Failing the others, loops through and find the correct 
		 * node, delete it and attach the others. 
		 */
			Object current = firstLink;
			while (current.getNextNode() != null) {
					if (current.getNextNode().getIndex() == index && current.getNextNode() != null) {
						current.setNextNode(current.getNextNode().getNextNode());
						return ro = new ReturnObjectImpl(current.getNextNode());
					}
					if(current.getNextNode() == null){
						ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
						break;
					}
				current = current.getNextNode();
				
			}
			size--;
			return null;
	}
	
	
	public ReturnObject add(int index, Object item) { //TO COMPLETE
		if (!(item instanceof Object) || item == null){
			return ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		Object current = firstLink;
		while(current.getIndex() != index){
			current = current.getNextNode();
		}
		if(index <= size && index > -1){
		current.setIndex(size+1);
		int in = index;
		item.setIndex(in);
		add(item);
		System.out.println("Added the new object to index " + index + " and added the old object at the given index to " + size);
		}
		return null;
	}

	
	public ReturnObject add(Object item) {
		if (this.firstLink == null){
			firstLink = item;
			size++;
			firstLink.setIndex(0);
		System.out.println("Added linkedlink at 0");
		} else if (firstLink != null){
			Object current = firstLink; 
			while (current.getNextNode() != null){ 
				current = current.getNextNode();
			} 
			current.setNextNode(item);
			size++;
				if(item.getIndex() == 0){
				current.getNextNode().setIndex(size - 1);
				}
			System.out.println("Added a new link to the existing linkedlist at " + current.getNextNode().getIndex());	
		}
		return null;
	}

}
