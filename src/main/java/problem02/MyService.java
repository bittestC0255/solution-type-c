package problem02;

public class MyService extends BaseService {
	
	public void service(String state) {
		
		String result = state.equals("낮") ? day() : night() ;
		
		if(state.equals("오후")) {
			System.out.println(afternoon());
		}else {
			System.out.println(result);
		}
		
	}
	
	public String afternoon() {
		return "오후서비스시작";
	}
	
	public String day() {
		return "낯서비스시작";
		
	}
	
	public String night() {
		return "밤서비스시작";
	}
}
