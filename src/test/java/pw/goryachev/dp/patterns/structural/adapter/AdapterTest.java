package pw.goryachev.dp.patterns.structural.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {

    private BusinessCardDesigner designer;

    @BeforeEach
    public void init() {
         designer = new BusinessCardDesigner();
    }

    @Test
    public void adapterTest() {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);

        assertTrue(adapter instanceof Employee);
        assertTrue(adapter instanceof Customer);

        String card1 = designer.designCard(adapter);
        System.out.println(card1);


        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);

        assertEquals(employee.getFullName(), objectAdapter.getName());
        assertEquals(employee.getJobTitle(), objectAdapter.getDesignation());
        assertEquals(employee.getOfficeLocation(), objectAdapter.getAddress());

        String card2 = designer.designCard(objectAdapter);
        System.out.println(card2);

        assertEquals(card1, card2);
    }

    public static void main(String[] args) {
        /** Using Class/Two-way adapter **/
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("************************************************************");
        /** Using Object Adapter **/
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}