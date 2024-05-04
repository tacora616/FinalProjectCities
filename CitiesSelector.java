public class CitiesSelector {

    String city_name, climate_region, diversity, econ_growth;
    double sales_tax, salary;
    int average_rent;


    CitiesSelector(String C_name, String C_climate_region, String C_diversity, double C_sales_tax, double C_salary, int C_average_rent, String C_economic_growth) {
        city_name = C_name;
        climate_region = C_climate_region;
        diversity = C_diversity;
        sales_tax = C_sales_tax;
        salary = C_salary;
        average_rent = C_average_rent;
        econ_growth = C_economic_growth;
    }
}
