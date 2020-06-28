package pw.goryachev.dp.patterns.structural.adapter;

/**
 * Created by morgan on 28.06.2020
 */

public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}