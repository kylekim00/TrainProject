package train;
import passenger.Passenger_General;
public class Train_Normal implements Train {
	private int trainNum;
	private String trainType;
	public boolean active = false;
	private Passenger_General[][][] seats = new Passenger_General [8][4][7];
	
	
	
	public Train_Normal(String trainType, int trainNum) {
		this.trainNum = trainNum;
		this.trainType = trainType;
	}
	
	@Override
	public int getTrainNum() {
		// TODO Auto-generated method stub
		return trainNum;
	}

	@Override
	public void setTrainNum(int trainNum) {
		// TODO Auto-generated method stub
		this.trainNum = trainNum;
	}

	@Override
	public String getTrainType() {
		// TODO Auto-generated method stub
		return trainType;
	}

	@Override
	public void setTrainType(int trainNum) {
		// TODO Auto-generated method stub
		this.trainNum = trainNum;
	}
	
	public void activate(int track, String starting_Point ) {
		if(active) {
			System.out.println("Activating train "+ trainNum + "on Lane " + track + " starting at "+ starting_Point);
		}
	}
}
