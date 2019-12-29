class Driver {
  public static void main(String args[]) {
    int numb_books = 4;

    // create a book array and initialize the values for variables
    Book b[] = new Book[numb_books];
    b[0] = new Book("B0001","The Snowball","Alice Schroeder", "Biographies");
    b[1] = new Book("B0002","The Total","Dave", "Business");
    b[2] = new Book("B0003","The Hunger Games","Collins", "Science");
    b[3] = new Book("B0004","The Intelligent","Graham", "Business");
    
    Library sciLib = new Library("Science Library", "Peradeniya", 20, b);
    
    Student stu1 = new Student("S0001");
    
    // search books by author name
    String book_id = sciLib.searchByAuthor("Collins");
    System.out.println(book_id);
    
    // display all book details
    sciLib.displayAllBooks();
    // checkout
    sciLib.checkOutBook(stu1, "B0003");
    sciLib.checkOutBook(stu1, "B0003");
    // display all book details
    sciLib.displayAllBooks();
   
  }
}