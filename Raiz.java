class Raiz {

	// El valor 'aprox' puede ser un número fijo, pero cuanto más alejado esté de la raiz,
	// o pertenezca a un entorno del 0 que haga la división arbitariamente grande,
	// más iteraciones serán necesarias.
	public static double f(double aprox, double c) {
		return (aprox + c/aprox)/2;
	}

	/* 
	 * Recibe por parámetro al menos el radicando
	 */
	public static void main(String[] args) {
		double radicando = Float.parseFloat(args[0]);
		double raiz_aproximada = radicando; 
		double raiz = Math.sqrt(radicando);
		double iteraciones = 100;
		double diferencia_anterior = 1;
		double diferencia = 0;

		if(args.length == 2) 
			iteraciones = Float.parseFloat(args[1]);

		for (double i = 0; i < iteraciones ; i++)
		{
			diferencia_anterior = diferencia;
			raiz_aproximada = f(raiz_aproximada, radicando);
			diferencia = raiz - raiz_aproximada;

			System.out.println(i + ") " + raiz_aproximada + "   diferencia: " + diferencia );
			if (diferencia == 0 || diferencia == diferencia_anterior)
				break;
		}
		
	}
}


