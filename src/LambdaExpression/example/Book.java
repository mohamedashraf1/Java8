package LambdaExpression.example;

public class Book {
    private int id;
    private String name;
    private int pages;

    public Book(int id, String name, int pages){
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    public Book(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                "} \n";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return id == book.id && pages == book.pages && Objects.equals(name, book.name);
//    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + id;
////        result = prime * result + {(name == null) ? 0 : name.hashCode()};
//        result = prime * result + pages;
//        return result;
//    }
}
