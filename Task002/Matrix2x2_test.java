import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Matrix2x2_test {
    public final static double EPS = 1e-9;
	
private static Matrix2x2 m, m1;

    @BeforeClass
    public static void createMatrix2x2() {
		m0 = new Matrix2x2(1, 2, 3, 4);
		m1 = new Matrix2x2(0, 1, 2, 3);
    }
	
    @Test
    public void matrixValueCheck() {
		Assert.assertEquals(1, m0.get00(), EPS);
		Assert.assertEquals(2, m0.get01(), EPS);
		Assert.assertEquals(3, m0.get10(), EPS);
		Assert.assertEquals(4, m0.get11(), EPS);
    }

    @Test
    public void matrixAddCheck() {
		Assert.assertEquals(new Matrix2x2(1, 3, 5, 7), m0.add(m1));
    }

    @Test
    public void matrixSubCheck() {
    	Assert.assertEquals(new Matrix2x2(1, 1, 1, 1), m0.sub(m1)); 
    }

    @Test
    public void matrixMultNumberCheck() {
		Assert.assertEquals(new Matrix2x2(2, 4, 6, 8), m0.multNumber(2));
    }

    @Test
    public void matrixDetCheck() {
		Assert.assertEquals(-2, m0.det(), EPS);
    }

	@Test
    public void inverseOfMatrixShouldBeCorrect() {
		Assert.assertEquals(new Matrix2x2(0, -4, 0, 1), m0.inverseMatrix());
    }

	
    @Test
    public void matrixMultCheck() {
		Assert.assertEquals(new Matrix2x2(4, 7, 8, 15), m0.mult(m1));
    }

}