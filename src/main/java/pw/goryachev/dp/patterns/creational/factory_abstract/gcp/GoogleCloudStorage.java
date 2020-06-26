package pw.goryachev.dp.patterns.creational.factory_abstract.gcp;

import pw.goryachev.dp.patterns.creational.factory_abstract.Storage;

/**
 * Created by morgan on 26.06.2020
 */

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        //Use gcp api
        System.out.println("Allocated "+capacityInMib+" on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }
}