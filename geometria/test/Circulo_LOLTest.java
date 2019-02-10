import static org.junit.Assert.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Circulo_LOLTest {
	private Circulo_LOL circulo;
	private double r;
	private double expectedArea;
	private double expectedPerimetro;
	private double resultado;
	
	@Before
	public void inicioPruebas() {	
	}
	@After
	public void finPruebas() {
		circulo=null;
	}
	
	public Circulo_LOLTest (double r, double expectedArea, double expectedPerimetro) {
		this.r=r;
		this.expectedArea=expectedArea;
		this.expectedPerimetro=expectedPerimetro;
	}
		
	@Parameters 
	public static Collection<Object[]> area(){
		return Arrays.asList(new Object[][] {
		{7,153.938,43.982},{0,0,0},{-3,28.274,18.850}});
	}
	
	@Test
	public void testArea() {
		circulo= new Circulo_LOL(r, "Circulo");
		resultado=circulo.area();
		assertEquals(expectedArea,resultado,0.001);
	}
	
	@Test
	public void testPerimetro() {
		circulo= new Circulo_LOL(r, "Circulo");
		resultado=circulo.perimetro();
		assertEquals(expectedPerimetro,resultado,0.001);
	}

}
