package transport;

public class Category {
    private final String title;

    public Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
class B extends Category{

    public B(String title) {
        super(title);
    }
}