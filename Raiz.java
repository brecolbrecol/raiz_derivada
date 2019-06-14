class Raiz {

	// El valor a puede ser un número fijo, pero cuanto más alejado esté de la raiz,
	// o pertenezca a un entorno del 0 que haga la división arbitariamente grande,
	// más iteraciones serán necesarias.
	public static double f(double a, double c) {
		return (a + c/a)/2;
	}

	public static void main(String[] args) {
		double radicando = Float.parseFloat(args[0]);
		double raiz = Math.sqrt(radicando);
		double a = radicando; 
		double i;
		double iteraciones = 10;

		if(args.length == 1)
		{
			iteraciones = Float.parseFloat(args[1]);
		}


		for (i = 1; i < iteraciones ; i++)
		{
			a = f(a, radicando);
			if ((i % 1) == 0)
			{
				System.out.println(i + ") " + a + "   diferencia: " + (raiz - a) );
			}
		}
		System.out.println(i + ") " + a + "   diferencia: " + (raiz - a) );
		
	}
}


