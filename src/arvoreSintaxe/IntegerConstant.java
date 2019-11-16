package arvoreSintaxe;

public class IntegerConstant extends Constant {
	
	public int value;

	public IntegerConstant(int newvalue) {
		value = newvalue;
		erroSemantico = false;
		tipo = Type.INTEGER;
	}
}
