package school;

public class Book {
  String title;
  String author;
  int pages;
  
  Book( String title,String author,int pages){
    this.title = title;
    this.author = author;
    this.pages = pages;
  }
  public static void main(String[] args) {
    Book[] bookDetails = {
      new Book("Blossoms", "Felix",200),
      new Book("Kings","Joseph",150)
    };
    for(int i =0;i<bookDetails.length;i++){
    System.out.println("title: "+ bookDetails[i].title + ", author: " + bookDetails[i].author + " pages: "+ bookDetails[i].pages );
    
    
    }

  }
}
