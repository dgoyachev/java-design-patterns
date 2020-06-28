package pw.goryachev.dp.patterns.structural.adapter;

/**
 * Created by morgan on 28.06.2020
 */

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}