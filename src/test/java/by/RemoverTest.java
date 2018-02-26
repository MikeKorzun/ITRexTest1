package by;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoverTest {

    private String test1 = "suksess";
    private String test2 = "uo";
    private String test3 = "Th";
    private String test4 = "table";
    private String test5 = "kakao and kofi";
    private String test6 = "sukses";

    @Test
    public void execute() {
        String original1 = "success";
        String original2 = "ooo";
        String original3 = "The";
        String original4 = "The table";
        String original5 = "cacao and coffee";
        String original6 = "success";

        Remover testRemover = new Remover();
        original1 = testRemover.stepOne(original1);
        assertEquals(test1, original1);

        original2 = testRemover.stepTwo(original2);
        assertEquals(test2, original2);

        original3 = testRemover.stepThree(original3);
        assertEquals(test3, original3);

        original4 = testRemover.stepFour(original4);
        assertEquals(test4, original4);

        original5 = testRemover.stepOne(original5);
        original5 = testRemover.stepTwo(original5);
        original5 = testRemover.stepThree(original5);
        original5 = testRemover.stepFour(original5);
        assertEquals(test5, original5);

        original6 = testRemover.stepOne(original6);
        original6 = testRemover.stepTwo(original6);
        original6 = testRemover.stepThree(original6);
        original6 = testRemover.stepFour(original6);
        assertEquals(test6, original6);
    }
}