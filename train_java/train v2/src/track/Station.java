package track;

public class Station {
	private String station_Name;
	private String station_Code;
	private Track[] tracks = new Track[0];
	
	public Station(String station_Name,String station_Code) {
		this.station_Code = station_Code;
		this.station_Name = station_Name;
	}
	
	public String getTracks() {
		String out = "--"+station_Name+" station tracks--\n";
		for(Track t: tracks) {
			out+= t.gettrack_Name()+ "|";
		}
		return out;
	}
	
	public void addTracks(Track newTrack) {//track 클래스에서 만약 station을 추가를 했다면 이 메서드를 이용하여 여기에 저장시킨다.
		Track[] newTrackList = new Track[tracks.length+1];
		for(int i=0; i<tracks.length; i++) {
			newTrackList[i] = tracks[i];
		}
		newTrackList[tracks.length] = newTrack;
		tracks = newTrackList;
	}
	public void delTracks(Track delTrack) {
		boolean w = false;
		int a=0;
		for(int i=0; i<tracks.length;i++) {
			if(tracks[i]==delTrack) {
				a=i;
				w = true;
			}
		}
		if(w) {
			Track[] newTrackList = new Track[tracks.length-1];
			for(int i=0; i<a; i++) {
				newTrackList[i] = tracks[i];
			}
			for(int i=a+1; i<tracks.length; i++) {
				newTrackList[i-1] = tracks[i];
			}
			tracks = newTrackList;
		}else {
			System.out.println("Station not included");
		}
		
	}
	
	
	public String toString() {
		return "Station: "+ station_Name + "\t StationCode: "+ station_Code;
	}
}
