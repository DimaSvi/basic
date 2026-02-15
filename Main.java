public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Little Prince", "Antuan de-cent ekzuperi", 1943, 160, "Fantasy");
        Book b2 = new Book("Ihtiandr", "R. Oleksandr Belyaev", 1928, 250, "Classic");
        Book b3 = new Book("One piece", "Oda", 2022, 24500, "Anime");

        Book[] library = {b1, b2, b3};

        for (Book b : library) {
            System.out.println(b.toString());
            System.out.println("Fantasy: " + b.isGenre("Fantasy"));
        }
    }
}