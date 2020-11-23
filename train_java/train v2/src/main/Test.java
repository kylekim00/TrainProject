package main;
import track.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Station shibuya = new Station("Shibuya", "a11");
		Station tokyo = new Station("tokyo", "a12");
		Station shinjuku = new Station("shinjuku", "a13");
		
		Track line7 = new Track("line7", shibuya);
		Track line1 = new Track("line1", shibuya);
		System.out.println(line7);
	
		line7.addStation(tokyo, 1);
		System.out.println(line7);
		System.out.println(tokyo.getTracks());
		line7.delStation(1);
		System.out.println(line7);
		System.out.println(tokyo.getTracks());
		System.out.println(shibuya.getTracks());
		line1.delStation(0);
		System.out.println(shibuya.getTracks());
		System.out.println(line1);
		System.out.println(line7);
	}

}
