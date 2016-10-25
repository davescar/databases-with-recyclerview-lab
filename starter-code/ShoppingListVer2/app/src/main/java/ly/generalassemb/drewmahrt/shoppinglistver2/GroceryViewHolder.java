package ly.generalassemb.drewmahrt.shoppinglistver2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ds on 10/25/16.
 */

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    private TextView mFoodNameTV;

    public TextView getFoodNameTV() {
        return mFoodNameTV;
    }

    public void setFoodNameTV(TextView foodNameTV) {
        mFoodNameTV = foodNameTV;
    }

    public GroceryViewHolder(View itemView) {
        super(itemView);

        mFoodNameTV = (TextView) itemView.findViewById(R.id.grocery_item);

    }
}
