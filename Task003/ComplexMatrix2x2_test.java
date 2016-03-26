import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class ComplexMatrix2x2_test {
    private static ComplexMatrix2x2 cm0, cm1;
    private static ComplexNumber cn0;

	@BeforeClass
    public static void createComplexMatrix2x2() {
        cn0 = mock(ComplexNumber.class);
        cm0 = new ComplexMatrix2x2(cn);
        cm1 = new ComplexMatrix2x2(cn);
    }
	
    @Test
    public void matrixValueCheck() {
        Assert.assertEquals(cm0.getA00(), cn);
		Assert.assertEquals(cm0.getA01(), cn);
		Assert.assertEquals(cm0.getA10(), cn);
		Assert.assertEquals(cm0.getA11(), cn);
    }

    @Test
    public void matrixAddCheck() {
		Assert.assertEquals(cm0.add(cm1), new ComplexMatrix2x2(cn));
    }
	
	@Test
    public void matrixMultNumberCheck() {
		Assert.assertEquals(cm0.mult(cm1), new ComplexMatrix2x2(cn));
    }
	
	@Ignore
    @Test
    public void matrixDetCheck() {
		Assert.assertEquals(cm0.det(), cn0);
    }
	
	@Ignore
	@Test
    public void matrixMultVectorCheck() {
        ComplexVector2D cv0 = mock(ComplexVector2D.class);
		Assert.assertEquals(cm0.multVector(cv0), cv0);
    }
}