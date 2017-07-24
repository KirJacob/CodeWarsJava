import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplementaryDNATest7 {
    @Test
    public void test(){
        assertEquals("ATTGC", ComplementaryDNA.makeComplement("TAACG"));
        assertEquals("GTAT", ComplementaryDNA.makeComplement("CATA"));
    }
}
