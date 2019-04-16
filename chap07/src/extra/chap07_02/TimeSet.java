package extra.chap07_02;

public class TimeSet {
	int time;
	int min;
	int sec;
	
	public TimeSet(int t, int m, int s) {
		this.time = t;
		this.min = m;
		this.sec = s;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(min>59) {
			return;
		}else {
			this.min = min;
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
			this.sec = sec;
	}

}