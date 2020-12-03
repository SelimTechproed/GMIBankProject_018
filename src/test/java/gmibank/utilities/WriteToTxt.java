package gmibank.utilities;

import gmibank.pojos.Customer;
import gmibank.pojos.States;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class WriteToTxt {
    public static void saveDataInFileWithSSN(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0;i<customers.length;i++)
                writer.append(customers[i].getSsn()+"\n");
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveDataInFileAllCustomersInfo(String fileName, Customer[] customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i =0; i<customer.length; i++){
                writer.append(customer[i].getId()+" , "+customer[i].getFirstName()+" , "+customer[i].getLastName()+" , "+customer[i].getSsn()+"\n");
                if(customer[i].getUser() != null){
                    writer.append(customer[i].getUser().getFirstName()+" , "+customer[i].getUser().getLastName()+"\n");
                }
                if (customer[i].getCountry() != null){
                    writer.append(customer[i].getCountry().getName()+" , "+customer[i].getCountry().getStates()+"\n");
                }
            }
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveDataInFile(String fileName, Customer customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customer.getSsn());
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveAllStates2(String fileName, States[] states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0; i<states.length; i++){
                writer.append(states[i].getName()+","+states[i].getTpcountry()+"\n");
            }
            writer.close();
        } catch(Exception e){
        }
    }
    public static void saveDataInFileWithJsonListMap(String fileName, List<Map<String,Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i <json.size() ; i++) {
                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("states") + "\n");
            }

            writer.close();
        } catch (Exception e) {

        }
    }
    public static void saveDataInFileWithJsonListMapState(String fileName, List<Map<String,Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i <json.size() ; i++) {
                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("tpcountry") + "\n");
            }

            writer.close();
        } catch (Exception e) {

        }
    }

}