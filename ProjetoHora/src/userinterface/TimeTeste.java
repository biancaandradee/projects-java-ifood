package userinterface;
import core.Time;

public class TimeTeste {

	public static void main(String[] args) {
		
		Time t = new Time();
		
		t.setTime(10, 12, 00);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());

	}

}
