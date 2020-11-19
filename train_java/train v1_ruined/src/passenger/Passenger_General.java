package passenger;

public class Passenger_General implements Passenger {
	
	private String passenger_Name;
	private int train_Num;
	private int passenger_Type;
	
	public Passenger_General(String passenger_Name, int train_Num, int passenger_Type) {
		this.passenger_Name = passenger_Name;
	}

	@Override
	public String getPassengerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPassengerName(String passenger_Name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTrainNum(int train_Num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTrainNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
