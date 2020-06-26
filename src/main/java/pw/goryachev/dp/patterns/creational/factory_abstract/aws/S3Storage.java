package pw.goryachev.dp.patterns.creational.factory_abstract.aws;

import pw.goryachev.dp.patterns.creational.factory_abstract.Storage;

/**
 * Created by morgan on 26.06.2020
 */

//Represents a concrete product in a family "Amazon Web Services"
public class S3Storage implements Storage {

    public S3Storage(int capacityInMib) {
        //Use aws s3 api
        System.out.println("Allocated "+capacityInMib+" on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}