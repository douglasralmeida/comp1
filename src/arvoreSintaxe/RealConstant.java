package arvoreSintaxe;

public class RealConstant extends Constant {

	public float value;
	
	public RealConstant(float newvalue) {
		value = newvalue;
		erroSemantico = false;
		tipo = Type.REAL;
	}
}
