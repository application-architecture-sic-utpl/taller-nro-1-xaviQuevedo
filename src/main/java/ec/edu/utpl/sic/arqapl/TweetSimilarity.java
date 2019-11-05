package ec.edu.utpl.sic.arqapl;


import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.Jaro;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

public class TweetSimilarity {
    private Similaritable algorithm;
    private Similaritable algorithm2;
    private Similaritable algorithm3;


    public TweetSimilarity() {
        algorithm = new Jaccard();
        algorithm2= new Cosine();
        algorithm3= new Jaro();
    }

    public TweetSimilarity(Similaritable algorithm) {
        this.algorithm = algorithm;
    }

    public double similarityJaccard(String tweet1, String tweet2) {
        return algorithm.similarity(tweet1, tweet2);
    }
    public double similarityCosine(String tweet1, String tweet2) {
        return algorithm2.similarity(tweet1, tweet2);
    }
    public double similarityJaro(String tweet1,String tweet2){return algorithm3.similarity(tweet1,tweet2);
    }
    /*@Override
    public String toString (){
        return Similaritable;
    }*/
}
