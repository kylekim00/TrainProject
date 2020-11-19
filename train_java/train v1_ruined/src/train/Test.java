package train;
import track.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Station_Genaral shibuya = new Station_Genaral("Shibuya", 001);
		Station_Genaral tokyo = new Station_Genaral("Tokyo", 002);
		Station_Genaral nagoya = new Station_Genaral("Nagoya", 003);

		
		
		
		Track line1 = new Track(1, shibuya, tokyo);
		System.out.println(line1);
		System.out.println(shibuya);
		line1.addStation(nagoya, 1);
		System.out.println(line1);
		
	}

}
