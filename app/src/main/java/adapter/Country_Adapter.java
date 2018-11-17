package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.country_fifa_uikit.R;
import model.Country_Model;

public class Country_Adapter extends RecyclerView.Adapter<Country_Adapter.MyViewHolder> {

    private Context context;
    private ArrayList<Country_Model> countryModelArrayList;

    public Country_Adapter(Context context, ArrayList<Country_Model> countryModelArrayList) {
        this.context = context;
        this.countryModelArrayList = countryModelArrayList;
    }

    @NonNull
    @Override
    public Country_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country_name, parent, false);


        return new Country_Adapter.MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull Country_Adapter.MyViewHolder holder, int position) {
        Country_Model modelfoodrecycler = countryModelArrayList.get(position);

        holder.image.setImageResource(modelfoodrecycler.getImage());
        holder.image1.setImageResource(modelfoodrecycler.getImage1());
        holder.text.setText(modelfoodrecycler.getText());
    }

    @Override
    public int getItemCount() {
        return countryModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image, image1;
        TextView text;

        public MyViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            image1 = itemView.findViewById(R.id.image1);
            text = itemView.findViewById(R.id.text);

        }
    }
}
