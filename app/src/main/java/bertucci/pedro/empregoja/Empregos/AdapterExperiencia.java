package bertucci.pedro.empregoja.Empregos;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import bertucci.pedro.empregoja.R;
import bertucci.pedro.empregoja.models.Experiencia;

/**
 * Created by pedro on 20/06/17.
 */

public class AdapterExperiencia extends RecyclerView.Adapter<AdapterExperiencia.ViewHolder> {

    private ArrayList<Experiencia> experiencia;


    @Override
    public AdapterExperiencia.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_experiencia, viewGroup, false);
        return new ViewHolder(view);
    }


    public AdapterExperiencia(ArrayList<Experiencia> experiencia) {
        this.experiencia = experiencia;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return experiencia.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nome_vaga, nome_empresa, nome_cidade, inicio, cargo, finalTrabalho;

        public ViewHolder(View view) {
            super(view);

            cargo = (TextView) view.findViewById(R.id.cargo);
            nome_empresa = (TextView) view.findViewById(R.id.nome_empresa);
            inicio = (TextView) view.findViewById(R.id.inicio);
            finalTrabalho = (TextView) view.findViewById(R.id.finalTrabalho);
        }
    }
}