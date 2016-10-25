package ly.generalassemb.drewmahrt.shoppinglistver2;

/**
 * Created by ds on 10/25/16.
 */

public class Shopping_List {
    private int mID;
    private String mItem_name;
    private String mDescription;
    private double mPrice;
    private String mFood_type;

    public Shopping_List(int id, String item_name, String description, double price, String food_type) {
        mID = id;
        mItem_name = item_name;
        mDescription = description;
        mPrice = price;
        mFood_type = food_type;
    }

    public int getId() {
        return mID;
    }

    public void setId(int id) {
        mID = id;
    }

    public String getItem_name() {
        return mItem_name;
    }

    public void setItem_name(String item_name) {
        mItem_name = item_name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getFood_type() {
        return mFood_type;
    }

    public void setFood_type(String food_type) {
        mFood_type = food_type;
    }
}
