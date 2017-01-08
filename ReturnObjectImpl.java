
public class ReturnObjectImpl implements ReturnObject {
	private boolean isThereAnError = false;
	private Object successful;
	private char er;
	// Constructor for successful operation
		ReturnObjectImpl (Object c){
			successful = c;
			 hasError();
		}

		// Constructor for error
		ReturnObjectImpl (ErrorMessage error){
			isThereAnError = true;
			if(error == ErrorMessage.INDEX_OUT_OF_BOUNDS){
				er = 'A';
			} else if (error == ErrorMessage.EMPTY_STRUCTURE){
				er = 'B';
			} else if (error == ErrorMessage.INVALID_ARGUMENT){
				er = 'C';
			} else if (isThereAnError == false){
				er = 'D'; 
			}
			hasError();
		}

	
	public boolean hasError() {
		if(isThereAnError == true){
			getError();
			return isThereAnError;
		} else {
			getReturnValue();
		}
		return isThereAnError;
	}

	
	public ErrorMessage getError() { 
		if(isThereAnError == true){
			switch(er) {
			case 'A' :
				System.out.println("The index is out of bounds");
				return ErrorMessage.INDEX_OUT_OF_BOUNDS;
			case 'B' : 
				System.out.println("The structure is empty and the index cannot be returned");
				return ErrorMessage.EMPTY_STRUCTURE;
			case 'C' : 
				System.out.println("Invalid argument");
				return ErrorMessage.INVALID_ARGUMENT;
			} 
		}
		return ErrorMessage.NO_ERROR;
	}


	
	public Object getReturnValue() {
		System.out.println("Operation successful, object returned");
		return successful;
	}

}
