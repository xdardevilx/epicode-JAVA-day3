package esercizio3;

public class Articolo {
    private int articleCode;
    private String articleDescription;
    private double articlePrice;
    private int numberOfPieces;

    public Articolo(int articleCode, String articleDescription, int numberOfPieces, double articlePrice) {
        this.articleCode = articleCode;
        this.articleDescription = articleDescription;
        this.numberOfPieces = numberOfPieces;
        this.articlePrice = articlePrice;
    }

    public int getArticleCode() {
        return articleCode;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public double getArticlePrice() {
        return articlePrice;
    }

    @Override
    public String toString() {
        return "{" +
                " articleCode='" + getArticleCode() + "'" +
                ", articleDescription='" + getArticleDescription() + "'" +
                ", articlePrice='" + getArticlePrice() + "'" +
                ", numberOfPieces='" + getNumberOfPieces() + "'" +
                "}";
    }

}
