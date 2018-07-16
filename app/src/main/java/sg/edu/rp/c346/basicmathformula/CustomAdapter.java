package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16038911 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    // Create variable for Context, Resource and Objects
    Context parent_context;
    int layout_id;
    ArrayList<FormulaItem> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaItem> objects) {
        super(context, resource, objects);

        // Initialize the variables
        parent_context = context;
        layout_id = resource; // formula.xml
        formulaList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);

        // Get the position of the row using .get(position)
        FormulaItem currentItem = formulaList.get(position);

        // Use the get___() method defined in FormulaItem Class to retrieve the name/date
        String title = currentItem.getTitle();
        String formula = currentItem.getFormula();
        String type = currentItem.getType();

        // Set the title, formula and type to textView using setText()
        tvTitle.setText(title);
        tvFormula.setText(formula);
        tvType.setText(type);

        return rowView;
    }
}
