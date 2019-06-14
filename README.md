Método de Newton para calcular raices de aplicaciones derivables.

## Cuadrada
Buscamos un método para calcular numéricamente la raíz cuadrada de un número cualquiera.


### Definición de la función 

Sea c \in |R el radicando (número del cual se quiere calcular la raíz).

Entonces, la función 

f: ℝ → ℝ

x ⟼ x² -c

cumple que f(sqrt(c)) = 0

### Aproximación lineal de la función en el punto 
La recta que mejor aproxima a la función en el entorno del punto es la derivada en el punto:

l(x) = f'(a)(x - a) + f(a)

## Valor que hace cero l(x)

Buscamos pues un x₁ que cumpla l(x₁) = 0 :

x₁ = (a + c/a)/2

