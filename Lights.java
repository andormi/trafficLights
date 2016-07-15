package trafficLights;


public class Lights {
	
	int timeRate;
	String name;
	
	public Lights() {
	}
	
	public Lights(int timeRate){
		this.timeRate = timeRate;
	}
	
	void setTimeRate(int time){
		timeRate = time;
	}
	
	int getTimeRate(){
		return timeRate;
	}

	void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
