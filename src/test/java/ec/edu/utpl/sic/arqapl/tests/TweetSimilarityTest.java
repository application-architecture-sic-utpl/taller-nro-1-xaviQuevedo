package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class TweetSimilarityTest {
    public TweetSimilarityTest() {
    }

    @Test
    public void similarJaccard() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundo";
        TweetSimilarity ts = new TweetSimilarity();
            assertEquals(1.0,
                ts.similarityJaccard(tweet1, tweet2), 0.1);

    }

    @Test
    public void similarCosine(){
         var tweet1  = "Hola mundo";
         var tweet2 = "Hola mundo";
        TweetSimilarity ts = new TweetSimilarity();
        assertEquals(1.0,
                ts.similarityCosine(tweet1, tweet2), 0.0);
    }
    @Test
    public void similarJaro(){
        String tweet1 = "Hola mundo";
        String tweet2 = "Hola mundo";
        TweetSimilarity ts = new TweetSimilarity();
       /* assertEquals(1.0,
                ts.similarityJaro(tweet1, tweet2), 0.1);

        */


        assertEquals(0.92499d, ts.similarityJaro("frog", "frog"), 0.00001d);
        /*assertEquals(0.0d, distance.apply("fly", "ant"), 0.00000000000000000001d);
        assertEquals(0.44166d, distance.apply("elephant", "hippo"), 0.00001d);
        assertEquals(0.90666d, distance.apply("ABC Corporation", "ABC Corp"), 0.00001d);
        assertEquals(0.95251d, distance.apply("D N H Enterprises Inc", "D & H Enterprises, Inc."), 0.00001d);
        assertEquals(0.942d, distance.apply("My Gym Children's Fitness Center", "My Gym. Childrens Fitness"), 0.00001d);
        assertEquals(0.898018d, distance.apply("PENNSYLVANIA", "PENNCISYLVNIA"), 0.00001d);

         */
    }
}
