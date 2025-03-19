import org.junit.Assert;
import org.junit.Test;
import pl.programujodpodstaw.Main;

public class MainTest {

    String userWord1 = "hola";
    String userWord2 = "pierogi";
    String userWord3 = "pustka";
    String userWord4 = "moc";
    String userWord5 = "świeżak";

    @Test
    public void testMain1(){
        Assert.assertEquals("4652", Main.wordToNumber(userWord1));
    }
    @Test
    public void testMain2(){
        Assert.assertEquals("7437644", Main.wordToNumber(userWord2));
    }
    @Test
    public void testMain3(){
        Assert.assertEquals("787852", Main.wordToNumber(userWord3));
    }
    @Test
    public void testMain4(){
        Assert.assertEquals("662", Main.wordToNumber(userWord4));
    }
    @Test
    public void testMain5(){
        Assert.assertEquals("94325", Main.wordToNumber(userWord5));
    }
}
