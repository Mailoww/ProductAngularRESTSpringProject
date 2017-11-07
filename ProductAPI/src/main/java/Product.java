public class Product {

    private final String name;
    private final String code;
    private final String date;
    private final String description;
    private final double price;
    private final double rating;
    private final String imageUrl;

    public Product(String name, String code, String date, String description, double price, double rating, String imageUrl) {
        this.name = name;
        this.code = code;
        this.date = date;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (Double.compare(product.rating, rating) != 0) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (code != null ? !code.equals(product.code) : product.code != null) return false;
        if (date != null ? !date.equals(product.date) : product.date != null) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        return imageUrl != null ? imageUrl.equals(product.imageUrl) : product.imageUrl == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }
}
