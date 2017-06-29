package com.trevor.android.tracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trevor.android.tracker.data.StringHelper;

/**
 * Created by Trevor on 6/22/2017.
 */

public class DataUIAdapter2 extends RecyclerView.Adapter<DataUIAdapter2.NumberViewHolder> {

    private static final String TAG = DataUIAdapter2.class.getSimpleName();
    //The number of ViewHolders that have been created.
    private static int viewHolderCount;
    /*
     * An on-click handler that we've defined to make it easy for an Activity to interface with
     * our RecyclerView
     */
    private final ListItemClickListener mOnClickListener;
    private int mNumberItems;
    private ViewGroup vGroup;

    /**
     * Constructor for GreenAdapter that accepts a number of items to display and the
     * specification for the ListItemClickListener.
     *
     * @param numberOfItems Number of items to display in list
     * @param listener
     */
    public DataUIAdapter2(int numberOfItems, ListItemClickListener listener) {
        mNumberItems = numberOfItems;
        mOnClickListener = listener;
        viewHolderCount = 0;
    }

    /**
     * This gets called when each new ViewHolder is created. This happens when the RecyclerView
     * is laid out. Enough ViewHolders will be created to fill the screen and allow for scrolling.
     *
     * @param viewGroup The ViewGroup that these ViewHolders are contained within.
     * @param viewType  If your RecyclerView has more than one type of item (which ours doesn't) you
     *                  can use this viewType integer to provide a different layout. See
     *                  {@link RecyclerView.Adapter#getItemViewType(int)}
     *                  for more details.
     * @return A new NumberViewHolder that holds the View for each list item
     */
    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        vGroup = viewGroup;
        Context context = viewGroup.getContext();
        //int layoutIdForListItem = R.layout.activity_enter_booleans;
        //int layoutIdForListItem = R.layout.number_list_item;
        int layoutIdForListItem = R.layout.activity_scale_entry;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        NumberViewHolder viewHolder = new NumberViewHolder(view);

        return viewHolder;
    }

    /**
     * OnBindViewHolder is called by the RecyclerView to display the data at the specified
     * position. In this method, we update the contents of the ViewHolder to display the correct
     * indices in the list for this particular position, using the "position" argument that is
     * conveniently passed into us.
     *
     * @param holder   The ViewHolder which should be updated to represent the contents of the
     *                 item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        holder.bindHelper(vGroup, position);
    }

    /**
     * This method simply returns the number of items to display. It is used behind the scenes
     * to help layout our Views and for animations.
     *
     * @return The number of items available in our db
     */
    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    public interface ListItemClickListener {
        void onListItemClicked(int ClickedItemIndex);
    }

    // A class called NumberViewHolder that extends RecyclerView.ViewHolder

    /**
     * Cache of the children views for a list item.
     */
    class NumberViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        // Will display field names
        TextView labelView;
        // Button labelView;
        // Will display which ViewHolder is displaying this data
        TextView entryView;
        //Button entryView;

        /**
         * Constructor for our ViewHolder. Within this constructor, we get a reference to our
         * TextViews and set an onClickListener to listen for clicks. Those will be handled in the
         * onClick method below.
         *
         * @param itemView The View that you inflated in
         *                 {@link DataUIAdapter2#onCreateViewHolder(ViewGroup, int)}
         */
        public NumberViewHolder(View itemView) {
            super(itemView);

            //BP 3
            labelView = (TextView) itemView.findViewById(R.id.text_view_get_scale_zero);
            entryView = (TextView) itemView.findViewById(R.id.text_view_get_scale_one);

            //Call setOnClickListener on the View passed into the constructor (use 'this' as the
            // OnClickListener)
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClicked(clickedPosition);
        }

        /**
         * This method will take an integer and the ViewGroup as input and
         * display the appropriate text within a list item.
         *
         * @param listIndex Position of the item in the list
         */
        public void bindHelper(ViewGroup viewGroup, int listIndex) {
            Context context = viewGroup.getContext();
            String[] menstruationColumnNames = StringHelper.getMenstruationLabels();
            //BP 3
            labelView.setText(String.valueOf(menstruationColumnNames[listIndex]));

            int backgroundColorForViewHolder = ColorUtils
                    .getViewHolderBackgroundColorFromInstance(context, listIndex);
            itemView.setBackgroundColor(backgroundColorForViewHolder);
        }
    }
}
