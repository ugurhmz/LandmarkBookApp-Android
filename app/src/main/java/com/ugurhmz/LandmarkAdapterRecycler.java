package com.ugurhmz;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ugurhmz.databinding.RecyclerRowBinding;

import java.util.ArrayList;



public class LandmarkAdapterRecycler extends RecyclerView.Adapter<LandmarkAdapterRecycler.LandmarkHolder> {


   ArrayList<Landmark> landmarkArrayList;

   public LandmarkAdapterRecycler(ArrayList<Landmark> landmarkList){
        this.landmarkArrayList = landmarkList;
   }


    @NonNull
    @Override   //ViewHolder sınıfından obje oluşturulunca çağrılacak metod. XML'i bağalamayı burda.
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandmarkHolder(recyclerRowBinding);
    }



    @Override   //ViewHolder sınıfı bağlandığında neler olacak onun için. Layout içinde hangi verileri gösterceksek
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {
        holder.binding.recyclerViewTextView.setText(landmarkArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
//                        intent.putExtra("landmark", landmarkArrayList.get(position));

                        Singleton singleton = Singleton.getInstance();
                        singleton.setSentLandMark(landmarkArrayList.get(position));
                        holder.itemView.getContext().startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;


        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
