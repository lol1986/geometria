/**
 * Rectangulo_LOL Clase para manejar las figuras tipo rect�ngulo.
 * @version 1.2
 * @author Laura Ortiz Luque
 */
public class Rectangulo_LOL extends FiguraGeometrica_LOL {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase.
	 * @param tipoFigura texto que da nombre a la figura.
	 * @param lG longitud del lado m�s largo del rect�ngulo.
	 * @param lP longitud del lado m�s peque�o del rect�ngulo.
	 */
	public Rectangulo_LOL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el �rea del rect�ngulo.
	 * @return �rea del rect�ngulo.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perimetro del rect�ngulo.
	 * @return perimetro del rect�ngulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}
}
