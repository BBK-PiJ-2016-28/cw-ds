
public class ArrayList implements List{
	public static final int CAPACITY=16;
	public int lengthOfData;
	public int size;
	public int elements = size + 1;
	public Object[] data;
	ReturnObjectImpl ro;
	
	
	//constructors
	public ArrayList() { //Constructs arraylist with default capacity
		 data = new Object[CAPACITY]; 
		 lengthOfData = data.length;
		} 							  
	public ArrayList(int capacity) { //Constructs arraylist with given capacity
		data = new Object[capacity];
		System.out.println("Created an ArrayList of capacity " + capacity);
	}
	

	
	public boolean isEmpty(){
		return (size == 0);
	}

	public int size(){
		System.out.println("The ArrayList is not full, but currently has " + size + " indexs");
		return size;
	}

	public ReturnObject get(int index){
		if (index > data.length || index < data.length - data.length) {
		return ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (data[index] == null){
			return ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		return ro = new ReturnObjectImpl(data[index]);
	}

	public ReturnObject remove(int index){
		return null;

	}

	public ReturnObject add(int index, Object item){ 
		/**
		 * Returns ErrorMessage if data[] is full
		 */
		if (index >= data.length){
			return	ro = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		/**
		 * If the Object is null, returns Invalid argument
		 */
		if (item == null){
			return ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		/**
		 * Adds object to the first (0) index if data[] is empty at the given index and pushes
		 * all others back, lengthening the arraylist.
		 */
		if(index <= size && index < data.length){
			for (int x = size-1; x >= index; x--){
				data[x+1] = data[x];
				size++;	
			}
			data[index] = item;
			System.out.println("Added to array at " + index);
			return ro = new ReturnObjectImpl(item);
		}
		return null; 
	}

	public ReturnObject add(Object item){
		/**
		 * Returns ErrorMessage if data[] is full
		 */
		if (elements == data.length){
		return	ro = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		/**
		 * If item is not an instance of Object, returns Invalid argument
		 */
		if(!(item instanceof Object) || item == null){
			return ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		/**
		 * Adds object to the first (0) index if data[] is empty 
		 */
		if (data[0] == null){
			data[0] = item;
			System.out.println("Added item to index " + size + " and the size of the array is currently " + elements);
		return	ro = new ReturnObjectImpl(item);
		} 
		/**
		 * If data[0] is full but data[] has capacity, this adds the elements are the logical position
		 */
		if(elements < data.length && item != null){
		size++;
		data[size] = item;
		elements++;
		System.out.println("Added item to index " + size + " and the size of the array is currently " + elements);
		return ro = new ReturnObjectImpl(item);
		} 
		
		return null;
	}
	


}
