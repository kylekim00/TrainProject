package track;
//이 클래스를 쓰기 전에는 먼저 Station_Genaral을 생성한 후에 만들어야 합니다.
public class Track {
	private Station_Genaral[] sArr; 
	private int Track_Num;
	public Track(int Track_Num, Station_Genaral...sArr){
		this.sArr = sArr;
		this.Track_Num = Track_Num;
		for(Station_Genaral x: sArr) {
			x.addTrack(Track_Num);
		}
	}
	
	
	public int getTrack_Num() {
		return Track_Num;
	}
	public void setTrack_Num(int track_Num) {
		Track_Num = track_Num;
	}
	
	public void addStation(Station_Genaral s, int x) {
		if(x>= sArr.length) {
			x = sArr.length -1;
		}
		Station_Genaral[] newArr = new Station_Genaral[sArr.length+1];
		for(int i=0; i<x; i++) {
			newArr[i] = sArr[i];
		}
		newArr[x] = s;
		for(int i=x+1; i<sArr.length; i++) {
			newArr[i+1] = sArr[i];
		}
		sArr = newArr;
		s.addTrack(Track_Num);
	}
	public void delStation(Station_Genaral s) {
		s.delTrack(Track_Num);
	}
	
	public String toString() {
		String out="";
		for(Station_Genaral s: sArr) {
			out += "\nStation: "+s.getStationName()+"\tstationNum:"+s.getNumStation();			
		}
		return "--Track--\nTrack_num: "+ getTrack_Num() + "\n stationList: " +out+"\n\n" ;
	
	}
}
