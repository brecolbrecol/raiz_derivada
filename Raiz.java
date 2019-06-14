class Raiz {

	// El valor 'c' puede ser un número fijo, pero cuanto más alejado esté de la raiz
	// más iteraciones serán necesarias. <-- va a ser que no, comprobar que debe ser el radicando
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
		double c = radicando;

		if(args.length == 2) 
			c = Float.parseFloat(args[1]);

		System.out.println("i  | raiz_aproximada | diferencia  | diferencia con el cuadrado ");
		for (double i = 0; i < iteraciones ; i++)
		{
			diferencia_anterior = diferencia;
			raiz_aproximada = f(raiz_aproximada, c);
			diferencia = raiz - raiz_aproximada;

			System.out.println(i + ") " + raiz_aproximada + "  " + diferencia  +  "  " + ( radicando - raiz_aproximada*raiz_aproximada) );
			if (diferencia == 0 || diferencia == diferencia_anterior)
				break;
		}
		
	}
}


