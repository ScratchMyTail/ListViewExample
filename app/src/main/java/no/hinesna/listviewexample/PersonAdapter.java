package no.hinesna.listviewexample;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by christerhansen on 26.02.15.
 */
public class PersonAdapter extends ArrayAdapter<Person> {
    Context context;
    List<Person> personList;

    public PersonAdapter(Context context, int itemResourceId, List<Person> personList){
        super(context, itemResourceId, personList);
        this.context = context;
        this.personList = personList;
    }

    public PersonAdapter(Context context, int layoutId, int itemResourceId, List<Person> personList){
        super(context, layoutId, itemResourceId, personList);
        this.context = context;
        this.personList = personList;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if(v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_item, null);
        }

        TextView etterNavn = (TextView) v.findViewById(R.id.etternavn);
        TextView forNavn = (TextView) v.findViewById(R.id.fornavn);
        Person person = personList.get(position);
        forNavn.setText(person.getFornavn());
        etterNavn.setText(person.getEtternavn());

        return v;
    }
}
