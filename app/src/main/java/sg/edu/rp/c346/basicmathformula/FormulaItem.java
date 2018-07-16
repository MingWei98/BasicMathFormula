package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 16038911 on 16/7/2018.
 */

// Class - FormulaItem
public class FormulaItem {
    private String title;
    private String formula;
    private String type;

    // Generate Constructor
    public FormulaItem(String title, String formula, String type) {
        this.title = title;
        this.formula = formula;
        this.type = type;
    }

    // Generate Get and Set Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FormulaItem{" +
                "title='" + title + '\'' +
                ", formula='" + formula + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
