package extra.chap07_02;

public class TimeTest {

	public static void main(String[] args) {
		TimeSet ts = new TimeSet(12, 35, 30);
		
		System.out.println(ts.getTime()+":"+ts.getMin()+":"+ts.getSec());
		ts.setTime(ts.getTime()+1);
		System.out.println(ts.getTime()+":"+ts.getMin()+":"+ts.getSec());
		
		ts.setMin(59);
		ts.setMin(80);
		System.out.println(ts.getTime()+":"+ts.getMin()+":"+ts.getSec());
		
		ts.setMin(60);
		ts.setSec(12);
		System.out.println(ts.getTime()+":"+ts.getMin()+":"+ts.getSec());

	}

}
