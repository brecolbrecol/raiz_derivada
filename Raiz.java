class Raiz {

	public static double f(double a, double c) {
		return (a + c/a)/2;
	}


	public static void main(String[] args) {
		double radicando = Float.parseFloat(args[0]);
		double a = radicando;
		double i;
		double raiz = Math.sqrt(a);

		for (i = 1; i < 9 ; i++)
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


