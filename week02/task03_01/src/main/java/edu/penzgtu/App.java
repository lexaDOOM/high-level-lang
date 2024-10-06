package edu.penzgtu;

public class App 
{
    public static void main( String[] args )
    {
        Author tolstoy = new Author();
        Author exupery = new Author();

        tolstoy.setName("Tolstoy Lev Nikolayevich");
        tolstoy.setBirthYear(1828);

        exupery.setName("Antoine de Saint-Exupery");
        exupery.setBirthYear(1900);

        Book warAndPiece = new Book();
        Book theLittlePrince = new Book();

        warAndPiece.setAuthor(tolstoy);
        theLittlePrince.setAuthor(exupery);

        warAndPiece.setBookTitle("War and Piece");
        theLittlePrince.setBookTitle("The Little Prince");

        System.out.println(warAndPiece.getBookInfo());
        System.out.println(theLittlePrince.getBookInfo());
    }
}
