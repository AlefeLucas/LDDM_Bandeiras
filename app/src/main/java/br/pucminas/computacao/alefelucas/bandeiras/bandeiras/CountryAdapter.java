package br.pucminas.computacao.alefelucas.bandeiras.bandeiras;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alefelucas on 21/02/18.
 */

public class CountryAdapter extends ArrayAdapter<Pais> {

    private List<Pais> paises;
    Context context;
    static TextView selectedTextView;

    public CountryAdapter(@NonNull Context context, @NonNull List<Pais> paises, TextView selectedTextView)  {
        super(context, R.layout.botao_pais, paises);
        this.paises = paises;
        this.context = context;
        this.selectedTextView = selectedTextView;
    }

    private static class BotaoPaisHolder{
        ImageButton imageButton;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       final Pais pais = getItem(position);
        BotaoPaisHolder holder;

        final View result;

        if(convertView == null){
            holder = new BotaoPaisHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.botao_pais, parent, false);
            holder.imageButton = (ImageButton) convertView.findViewById(R.id.flagImageButton);

            result = convertView;
            convertView.setTag(holder);

        } else{
            holder = (BotaoPaisHolder) convertView.getTag();
            result = convertView;
        }

        holder.imageButton.setImageResource(pais.getImageId());
        holder.imageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTextView.setText(pais.getNome());
            }
        });

        return convertView;
    }
}
