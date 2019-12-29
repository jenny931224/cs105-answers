class Book {
  String book_id;
  String book_name;
  String author_name;
  String category;
  int quantity;
  
  Book(String id, String b_name, String a_name, String cat) {
    this.book_id = id;
    this.book_name = b_name;
    this.author_name = a_name;
    this.category = cat;
    this.quantity = 1;
  }
}