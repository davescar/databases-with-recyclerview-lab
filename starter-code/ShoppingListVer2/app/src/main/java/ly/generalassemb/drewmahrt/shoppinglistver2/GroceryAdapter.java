package ly.generalassemb.drewmahrt.shoppinglistver2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ds on 10/25/16.
 */

public class GroceryAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    private List <String> mGroceryList;

    public GroceryAdapter(List<String> groceryList) {
        mGroceryList = groceryList;
    }

    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_item, parent, false);
        GroceryViewHolder viewHolder = new GroceryViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, int position) {
        holder.getFoodNameTV().setText(mGroceryList.get(position));


    }

    @Override
    public int getItemCount() {
        return mGroceryList.size();
    }
}
