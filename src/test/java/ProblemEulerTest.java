import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class ProblemEulerTest {

    @Test
    public void shouldReturn2520(){
        //given
        ProblemEuler problemEuler = new ProblemEuler();
        //when
        int result = problemEuler.giveNumber(10);
        //then
        Assert.assertThat(result, CoreMatchers.is(2520));
    }

    @Test
    public void shouldReturn232792560(){
        //given
        ProblemEuler problemEuler = new ProblemEuler();
        //when
        int result = problemEuler.giveNumber(20);
        //then
        Assert.assertThat(result, CoreMatchers.is(232792560));
    }
}


