package test.java.jsf;

import java.sql.SQLException;

import main.java.jsf.App;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
/*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("sample");
		em = emf.createEntityManager();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		em.close();
		emf.close();
	}
	*/
    /**
     * Rigourous Test :-)
     * @throws SQLException 
     */
    @Test(timeout=1000)
    public void test183090602903306() throws SQLException{
    	App.main(new String[]{"183090602903306", "150", "20"});
    	Assert.assertEquals(1, App.EXIT);
     }
}
