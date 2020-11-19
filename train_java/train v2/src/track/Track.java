//this class receives Stations and connects it.
package track;

public class Track {
	private String track_Name;
	private Station[] stations;
	
	
	public Track(String track_Name,Station...stations) {
		this.stations = stations;
		for(Station s:stations) {
			s.addTracks(this);
		}
		this.track_Name = track_Name;
	}
	
	public String gettrack_Name() {
		return track_Name;
	}
	
	public String printStations() {
		String out = "--station list-- \n";
		for(int i=0; i< stations.length; i++) {
			out += i + ". "+stations[i] + "\n";
		}
		return out;
	}
	
	public Station[] getStations(int st, int en) {//이건 나중에 running train에서 써먹을 길 알려주기, 거꾸로 쓰면 리버스되도록 작성함
		if(st>en) {
			Station[] out = new Station[st-en+1];
			for(int i=en; i<st; i++) {
				for(int j=0; j<out.length; j++) {
					out[j] = stations[i];
				}
			}
			return out;
		}else {
			Station[] out = new Station[en-st+1];
			for(int i=st; i<=en;i++) {
				for(int j=0; j<out.length; j++) {
					out[j] = stations[i];
				}
			}
			return out;
		}
		
		
	}
	
	public void addStation(Station newStation, int index) {//index로 추가하는 것도 좋지만 이전역이 뭔지로 결정을 할 수 있도록도 한번 해보자.
		if(index<0||index>stations.length+1) {
			System.out.println("out of boundary while adding Station.");
		}else {
			Station[] newTrack = new Station[stations.length+1];
			for(int i=0;i<index; i++) {
				newTrack[i] = stations[i];
			}
			newTrack[index] = newStation;
			for(int i = index+1; i<newTrack.length; i++) {
				newTrack[i] = stations[i-1];
			}
			stations = newTrack;
			newStation.addTracks(this);//그리고 만약 하나의 라인이 같은 역을 두번 지날 경우에는 배열에 두번 추가가 되고 지울 때는 하나가 아니라 두개 모두 지워지지만 어느 것이 지워지는지 모르
			
		}
	}
	
	
	public void delStation(int index) {//index를 이용해서 지우지만 나중에는 직접 서치를 시켜서 지우게 만드는 걸 오버로딩으로 만들자.
		if(index<0||index>=stations.length) {
			System.out.println("out of boundary while adding Station.");
		}else {
			Station[] newTrack = new Station[stations.length-1];
			for(int i=0;i<index; i++) {
				newTrack[i] = stations[i];
			}
			for(int i = index+1; i<stations.length; i++) {
				newTrack[i-1] = stations[i];
			}
			stations[index].delTracks(this);
			stations = newTrack;
			
		}
	}
	
	public String toString() {
		return "---Track : "+ track_Name + "---\n" + printStations();
		
	}

	
	
	
}

