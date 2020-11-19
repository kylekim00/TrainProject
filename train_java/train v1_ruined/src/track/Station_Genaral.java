package track;
public class Station_Genaral implements station {
	private int numStation;
	private String stationName;
	private int[] track = {};
	public Station_Genaral(String stationName, int numStation) {
		this.numStation = numStation;
		this.stationName = stationName;
	}
	@Override
	public void setNumStation(int numStation) {
		// TODO Auto-generated method stub
		this.numStation = numStation;
	}
	@Override
	public int getNumStation() {
		
		return numStation;
	}

	@Override
	public String getStationName() {
		// TODO Auto-generated method stub
		return stationName;
	}

	@Override
	public void setStationName(String stationName) {
		// TODO Auto-generated method stub
		this.stationName = stationName;
	}
	//////////////////트랙 추가와 삭제(main에서는 건드리지 않고 Track에서 추가할 때 건드림.)/////////////////
	public void addTrack(int x) {
		int[] newTrack = new int[track.length+1];
		for(int i=0; i<track.length; i++) {
			newTrack[i] = track[i];
		}
		newTrack[track.length] = x;
		track = newTrack;
		System.out.println(getStationName()+": Track "+ x + " added\n\n");
	}
	
	public void delTrack(int x) {
		int a = 0;
		boolean c = false;
		for(int i=0; i<track.length;i++) {
			if(track[i]==x) {
				a = i;
				c= true;
			}
		}
		if(!c) {
			System.out.println("this track does not pass this Station\n\n");
		}else {
			int[] newTrack = new int[track.length-1];
			for(int i=0; i<a; i++) {
				newTrack[i] = track[i];
			}
			for(int i=a+1; i<track.length;i++) {
				newTrack[i-1] = track[i];
			}
			System.out.println(getStationName()+"Track deleted\n\n");
		}
		
	}
	
	public String getTrack() {
		String out = "";
		for(int i =0; i<track.length;i++) {
			out += ((i==0)?" ":", ");
			out += track[i];
		}
		return out;
		
	}
	public String toString() {
		return "--Station--\nStation Name: "+ getStationName()+ "\nStation: Num: " + getNumStation()+ "\nStation tracks: "+ getTrack()+"\n\n";
	}
}
