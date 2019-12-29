class Library {
  String lib_name;
  String loc;
  int numb_books;
  Book book[];
  
  
  Library(String name, String loc, int numb, Book book[]) {
    this.lib_name = name;
    this.loc = loc;
    this.numb_books = numb;
    this.book = book;
  }
  
  String searchByAuthor(String author) {
    for(int i=0; i<book.length; i++) {
      if (author.equalsIgnoreCase(book[i].author_name)) {
        return book[i].book_id;
        //break;
      }
    }
    return "No book Found";
  }
  
  int searchByID(String id) {
    for(int i=0; i<book.length; i++) {
      if (id.equalsIgnoreCase(book[i].book_id) && book[i].quantity !=0) {
        return i;
        //break;
      }
    }
    return -1;
  }
  
  void displayAllBooks() {
    for(int i=0; i<book.length;i++) {
      System.out.println(book[i].book_id +"\t"+book[i].book_name+"\t"+book[i].author_name+"\t"+book[i].category+"\t"+book[i].quantity);
    }
  }
  
  void checkOutBook(Student stu, String book_id) {
    int index = searchByID(book_id);
    if(index!=-1) {
      if (stu.no_books_borrowed < 3) {
        System.out.println("Checkout successful!");
        stu.no_books_borrowed++;
        book[index].quantity--;
      } else {
        System.out.println("Book limit reached!");
      }
    } else {
      System.out.println("Sorry, can't proceed the checkout!");
    }
  }
}