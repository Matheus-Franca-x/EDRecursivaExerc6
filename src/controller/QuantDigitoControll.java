package controller;

public class QuantDigitoControll 
{
	public QuantDigitoControll()
	{
		super();
	}
	
	public int quant(int first, int second) //inicio
	{
		if(first / 10 == 0) //termino da recursiva
		{
			return first == second ? 1 : 0; //ternario para testar se o ultimo valor e igual ao second, retornando 1 ou 0
		}
		return first % 10 == second ? 1 + quant(first / 10, second) : quant(first / 10, second);
		//operador ternario, onde caso o first tenha como resto igual a second, retornara verdadeiro com a
		//recursiva sendo somado, caso seja falso, retornara apenas o valor anterior, fazendo toda a conta
		//de digitos que o second pede.
	}
}
