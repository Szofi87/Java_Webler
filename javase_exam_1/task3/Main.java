package javase_exam_1.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Book> bookList = new ArrayList<>();
    private static List<Author> authorList = new ArrayList<>();

    public static void main(String[] args) {
        addSampleData();
        menu();
    }

    private static void menu() {
        switch (TerminalInput.select("Library Menu",
                "Add new book",
                "Add new author",
                "Search Books",
                "Search Authors",
                "Exit")) {
            case 0: {
//                Book book = new Book();
//                book.setIsbn(TerminalInput.getString("Please enter ISBN"));
//                if(validateISBN(book.getIsbn())){
//                    if(bookList.stream().noneMatch(b -> b.getIsbn().equals(book.getIsbn()))) {
//                        book.setTitle(TerminalInput.getString("Please enter title"));
//                        book.setAuthor(selectAuthor());
//                        book.setLanguage(selectLanguage());
//                        book.setPublisher(TerminalInput.getString("Please enter publisher name"));
//                        book.setYear(TerminalInput.getInteger("Please enter publishing year"));
//
//                        bookList.add(book);
//                    }
//                }

                Book book = new Book();
                book.setIsbn(TerminalInput.getString("Please enter ISBN"));
                if(validateISBN(book.getIsbn())){
                    boolean isbnTaken = false;

                    for(Book b : bookList){
                        if(b.getIsbn().equals(book.getIsbn())) {
                            isbnTaken = true;
                        }
                    }

                    if(!isbnTaken) {
                        book.setTitle(TerminalInput.getString("Please enter title"));
                        book.setAuthor(selectAuthor());
                        book.setLanguage(selectLanguage());
                        book.setPublisher(TerminalInput.getString("Please enter publisher name"));
                        book.setYear(TerminalInput.getInteger("Please enter publishing year"));

                        bookList.add(book);
                    } else System.out.println("ERROR: Non-unique ISBN");
                } else System.out.println("ERROR: Invalid ISBN");
                break;
            }
            case 1: {

//                Author author = new Author(TerminalInput.getString("Please enter name"));
//                if(authorList.stream().noneMatch(author1 -> author1.getName().equals(author.getName()))){
//                    authorList.add(author);
//                }

                Author author = new Author(TerminalInput.getString("Please enter name"));
                boolean nameTaken = false;
                for(Author a : authorList){
                    if(a.getName().equals(author.getName())){
                        nameTaken = true;
                    }
                }
                if(!nameTaken){
                    authorList.add(author);
                } else System.out.println("ERROR: Non-unique author name");

                break;
            }
            case 2: {

//                String searchTerm = TerminalInput.getString("Search").toLowerCase().trim();
//                bookList.stream().filter(book -> book.toString().toLowerCase().contains(searchTerm)).forEach(System.out::println);

                String searchTerm = TerminalInput.getString("Search").toLowerCase().trim();

                for(Book b : bookList) {
                    if(b.toString().toLowerCase().contains(searchTerm)){
                        System.out.println(b);
                    }
                }
            }
                break;
            case 3:
//                String searchTerm = TerminalInput.getString("Search").toLowerCase().trim();
//                authorList.stream().filter(author -> author.toString().toLowerCase().contains(searchTerm)).forEach(System.out::println);

                String searchTerm = TerminalInput.getString("Search").toLowerCase().trim();

                for(Author a : authorList) {
                    if(a.toString().toLowerCase().contains(searchTerm)){
                        System.out.println(a);
                    }
                }

                break;
            case 4:
                System.exit(0);
                return;
        }

        menu();
    }

    private static void addSampleData(){
        authorList.add(new Author("Joe Grey"));
        authorList.add(new Author("Melinda Carlsson"));
        authorList.add(new Author("Freddie Grande"));
        authorList.add(new Author("Victoria Tailor"));
        authorList.add(new Author("Megan McGriffin"));

        Book b1 = new Book();
        b1.setAuthor(authorList.get(0));
        b1.setIsbn("9790765331");
        b1.setLanguage(Language.ENGLISH);
        b1.setPublisher("Phoenix Publishing");
        b1.setTitle("Anatomy of Cats");
        b1.setYear(2001);

        Book b2 = new Book();
        b2.setAuthor(authorList.get(0));
        b2.setIsbn("9790765332");
        b2.setLanguage(Language.ENGLISH);
        b2.setPublisher("Phoenix Publishing");
        b2.setTitle("Anatomy of Dogs");
        b2.setYear(2007);

        Book b3 = new Book();
        b3.setAuthor(authorList.get(1));
        b3.setIsbn("9790765332");
        b3.setLanguage(Language.CZECH);
        b3.setPublisher("Bookworms Co.");
        b3.setTitle("The English Wizard");
        b3.setYear(2018);

        Book b4 = new Book();
        b4.setAuthor(authorList.get(2));
        b4.setIsbn("9790765333");
        b4.setLanguage(Language.ENGLISH);
        b4.setPublisher("Phoenix Publishing");
        b4.setTitle("Short People");
        b4.setYear(1998);

        Book b5 = new Book();
        b5.setAuthor(authorList.get(3));
        b5.setIsbn("9790765334");
        b5.setLanguage(Language.CHINESE);
        b5.setPublisher("Phoenix Publishing");
        b5.setTitle("Java Programming 1");
        b5.setYear(2012);

        Book b6 = new Book();
        b6.setAuthor(authorList.get(4));
        b6.setIsbn("9790765335");
        b6.setLanguage(Language.ENGLISH);
        b6.setPublisher("Bookworms Co.");
        b6.setTitle("Dad Jokes");
        b6.setYear(2020);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
    }

    // Presents a list of all available languages to the user
    // and returns the one they selected
    private static Language selectLanguage() {
        String[] langNames = new String[Language.values().length];
        for (int i = 0; i < Language.values().length; i++) {
            langNames[i] = Language.values()[i].toString();
        }
        return Language.values()[TerminalInput.select("Please select a language", langNames)];
    }

    // Presents a list of all available authors to the user
    // and returns the one they selected
    private static Author selectAuthor() {
        String[] authorNames = new String[authorList.size()];
        for (int i = 0; i < authorList.size(); i++) {
            authorNames[i] = authorList.get(i).getName();
        }
        return authorList.get(TerminalInput.select("Please select an author", authorNames));
    }

    // Validating regex
    // exactly 10 characters and only contains digits
    private static boolean validateISBN(String isbn) {
        return isbn.matches("[0-9]+") && isbn.length()==10;
    }
}
