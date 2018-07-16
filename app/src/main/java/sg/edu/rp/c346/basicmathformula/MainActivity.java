package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    // Create ArrayList variable with Data Type <FormulaItem>* - the class
    ArrayList<FormulaItem> alFormulaList;
    // Create CustomAdapter variable*
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);

        alFormulaList = new ArrayList<>();
        FormulaItem f1 = new FormulaItem("Area of rectangle", "Length x Length", "Formula Type: Area");
        FormulaItem f2 = new FormulaItem("Area of triangle", "(Length of base x Length) /2", "Formula Type: Area");
        FormulaItem f3 = new FormulaItem("Volume of cube", "Length x Length x Length", "Formula Type: Volume");

        alFormulaList.add(f1);
        alFormulaList.add(f2);
        alFormulaList.add(f3);

        // Constructor, Same parameters as the one in CustomAdaper*
        caFormula = new CustomAdapter(this, R.layout.formula, alFormulaList);

        lvFormula.setAdapter(caFormula);
    }
}
