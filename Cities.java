import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Cities extends JFrame {
    private JPanel Main_frame;
    private JComboBox climate_combobox;
    private JSpinner salestaxspinner;
    private JSlider averagerentslider;
    private JLabel cityMoveLabel;
    private JLabel salary;
    private JLabel climate_Region;
    private JLabel sales_Tax;
    private JLabel average_Rent;
    private JLabel economic_growth;
    private JLabel diversity_Label;
    private JRadioButton econ_high;
    private JRadioButton econ_med;
    private JRadioButton econ_low;
    private JRadioButton divsity_high;
    private JRadioButton dvsity_med;
    private JRadioButton dvsity_low;
    private JTextField salary_textfield;
    private JButton Submit_button;
    private JTextField Name_textfield;
    private JButton Submit_Button;
ButtonGroup Diversity_group;
ButtonGroup Economic_Group;
    public Cities() {
        Diversity_group = new ButtonGroup();
        Diversity_group.add(divsity_high);
        Diversity_group.add(dvsity_med);
        Diversity_group.add(dvsity_low);
        divsity_high.setActionCommand("High");
        dvsity_med.setActionCommand("Medium");
        dvsity_low.setActionCommand("Low");
        Economic_Group= new ButtonGroup();
        Economic_Group.add(econ_high);
        Economic_Group.add(econ_low);
        Economic_Group.add(econ_med);
        econ_high.setActionCommand("High");
        econ_med.setActionCommand("Medium");
        econ_low.setActionCommand("Low");
List<CitiesSelector>availble_cities;
availble_cities= new ArrayList<>();
setContentPane(Main_frame);
setSize(400,400);
setVisible(true);
Submit_Button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String user_selected_salary= salary_textfield.getText();
            String user_selected_economic=Economic_Group.getSelection().getActionCommand();
            String user_selected_diversity=Diversity_group.getSelection().getActionCommand();
            String user_selected_climate=climate_combobox.getSelectedItem().toString();
            String user_selected_sales_tax=salestaxspinner.getValue().toString();
            String user_selected_average_rent=averagerentslider.getValue();
            int number_of_matches=0;
          for (CitiesSelector eachcities:availble_cities){
            if (econ_high.isSelected())
            {
                user_selected_economic = "High";
            }
            else if (econ_med.isSelected())
            {
                user_selected_economic = "Medium";
            }
            else if (econ_low.isSelected())
            {
                user_selected_economic = "Low";
            }
            if (divsity_high.isSelected())
            {
                user_selected_diversity = "High";
            }
            else if (dvsity_med.isSelected()) {
                user_selected_diversity = "Medium";
            }
            else if (dvsity_low.isSelected()) {
                user_selected_diversity = "Low";
            }

                if(eachcities.econ_growth.equals(user_selected_economic)
            {
                number_of_matches++;
            }
            if(eachcities.diversity.equals(user_selected_diversity))
            {
                number_of_matches++;
            }
            if(eachcities.climate_region.equals(user_selected_climate))
            {
                number_of_matches++;
            }
            if (eachcities.sales_tax.
            {
                number_of_matches++;
            }
            if(eachcities.salary.
            {
                number_of_matches++;
            }
            if(eachcities.average_rent.equals(user_selected_average_rent))
            {
                number_of_matches++;
            }
            if (eachcities.salary.)

        }
        }
        catch (){}
    }
});


    }
}


