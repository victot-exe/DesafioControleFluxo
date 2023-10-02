package controle;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception{
	
	public ParametrosInvalidosException() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	}
}
