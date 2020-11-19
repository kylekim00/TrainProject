package train;
import passenger.Passenger;
public class Train {
	private String train_Type;
	private Passenger[][][] passengers;
	
	public Train(String train_Type, int kan, int row, int col) {
		this.train_Type = train_Type;
		this.passengers = new Passenger[kan][row][col];
	}
	//나중에 running train 만들때 비어있는 좌석을 어떻게 처리할 것인가 생각을 해야할듯하다.(Null이면...튜라이도 쓸만 할까??? 아님 그냥 if 문도 가능하지 않을까?)

	public void addPassenger(Passenger p, int kan, int row, int col) {
		
	}
}
