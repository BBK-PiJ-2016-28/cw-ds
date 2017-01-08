
public class FunctionalArrayList extends ArrayList implements FunctionalList{
	private int count;
	FunctionalArrayList emptyList;
	
	public ReturnObject head() {
		if(data[0] == null){
			return ro = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return ro = new ReturnObjectImpl(data[0]);
		}
		
	}

	
	public FunctionalList rest() { 
		if (data[1] == null){
			System.out.println("rest() function called and is empty so returning empty list"); 
			return emptyList = new FunctionalArrayList();
		} else{
			for (int x = 1; x < data.length; x++){
				if(data[x] != null){
				System.out.println(data[x]);
				}
			}
		}
		
		return null;
	}

}
