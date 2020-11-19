//이 클래스를 쓰기 전에는 먼저 Track을 생성한 후에 만들어야 합니다.
package train;
import track.*;
public class RunningTrain {
	private Track track;
	private Train_Normal train;
	private Station_Genaral station;
	private int departure_Time;
	
	public RunningTrain(Train_Normal t, Track track, Station_Genaral station){
		this.track = track;
		this.train = train;
		this.station = station;
		
	}

	
}
