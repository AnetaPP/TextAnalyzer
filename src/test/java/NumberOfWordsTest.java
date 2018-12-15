import analyzers.NumberOfWordsAnalyzer;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class NumberOfWordsTest {

    NumberOfWordsAnalyzer wordAnalyzer;

    @Before
    public void setUp(){
        wordAnalyzer = new NumberOfWordsAnalyzer();
    }

    @Test
    @Parameters(method = "sentencesToAnalyze")
    public void testCountNumberOfWords(String text, int numberOfWords){
        assertEquals(numberOfWords ,wordAnalyzer.analyze(text).intValue());
    }

    private Object[][] sentencesToAnalyze() {
        return new Object[][]{{"Ala ma kota,3"},
                {" ,0"},
                {"W Szczebrzeszynie chrząszcz brzmi w trzcinie, 6"},
                {"żółć,1"}
        };
    }
}
