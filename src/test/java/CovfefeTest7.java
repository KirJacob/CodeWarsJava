import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CovfefeTest7 {
    @Test
    public void test(){
        assertEquals("covfefe", Covfefe.covfefe("coverage"));
        assertEquals("covfefe covfefe", Covfefe.covfefe("coverage coverage"));
        assertEquals("nothing covfefe", Covfefe.covfefe("nothing"));
        assertEquals( "double space  covfefe" ,Covfefe.covfefe("double space "));
        assertEquals("covfefe covfefe", Covfefe.covfefe("covfefe"));
    }
}
