package fr.lernejo;

import fr.lernejo.Sample;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SampleTest{

    @Test
    public void operationMultiplyTest() throws Exception{
        Sample sample = new Sample();
        Assertions.assertEquals(sample.op(Sample.Operation.MULT, 1, 3), 3);
    }

    @Test
    public void operationAddTest() throws Exception{
        Sample sample = new Sample();
        Assertions.assertEquals(sample.op(Sample.Operation.ADD, 1, 3), 4);
    }
}
