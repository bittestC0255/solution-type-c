package problem03;

public class MyStack {
	
	private String[] buffer;
	String[] temp;
	int size;
	int index;
	
	public MyStack( int size ) {
		buffer = new String[size];
		this.size = size;
		index = 0;
	}
	
	public void push(String item) {
		if(index == size) {
			temp = new String[index+1];
			for(int i=0;i<buffer.length;i++) {
				temp[i] = buffer[i];
			}
			
			temp[index] = item;
			
			buffer = new String[index+1];
			for(int i=0;i<buffer.length;i++) {
				buffer[i] = temp[i];
			}
			size = index;
			
		}else if(buffer[index] == null) {
			buffer[index] = item;
			index++;
			
		}
		
	}

	public String pop() {
		index--;
		return buffer[index];
	}

	public boolean isEmpty() {
		if(buffer == null) {
			return true;
		}
		//스택에 값이 있으면
		return false;
	}
	
	public int size() {
		return 0;
	}
}