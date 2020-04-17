package com.kamal.co777682_w2020_mad3125_fp;

import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.Models.HydroBill;
import com.kamal.co777682_w2020_mad3125_fp.Models.InternetBill;
import com.kamal.co777682_w2020_mad3125_fp.Models.MobileBill;

import java.util.ArrayList;

public class DataStorage {
    public static DataStorage dataStorage = new DataStorage();
    public ArrayList<Customers> customers = new ArrayList<>();
    public ArrayList<Bill> bill = new ArrayList<>();

    public DataStorage() {
    }

    public static DataStorage getInstance() {
        return dataStorage;
    }

    public ArrayList<Customers> getCustomers() {
        return this.customers;
    }

    public ArrayList<Bill> getBill() {
        return bill;
    }


    /*func addBill( bill: Bill)
       {
          let billId = bill.billId
         customerBills.updateValue(bill, forKey: billId)
       }*/
    public void loadCustomerDetails() {
       Customers c1 = new Customers("C001", "Kamalpreet", "Kaur", "Kamal1234@gmail.com", "Brampton");
        Customers c2 = new Customers("C002", "Nikita", "Sandhu", "niksandhu23@gmail.com", "Missisauga");
        Customers c3 = new Customers("C003", "Jyoti", "Thomas", "jyotiT@outlook.com", "Scorborough");

        InternetBill i1 = new InternetBill("I001",  "20/02/2019", 40.00, "Rogers",  10);
        InternetBill i2 = new InternetBill("I002",  "30/5/2020", 150.00, "Freedom",  15);
        InternetBill i3 = new InternetBill("I003",  "14/6/2020", 200.00, "Fido",  20);
        HydroBill h1 =  new HydroBill("H001", "26/04/2018", 110.00, "Planet Energy",  200.00);
        HydroBill h2 = new HydroBill("H002", "03/09/2019", 50.00,  "OntarioHydro",  700.00);
        MobileBill m1 = new MobileBill( "M001","07/09/2019",  45.00,"Apple Inc.", "4.5GB + 1000 Min",
                "4504500577",  4,  100);

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        c1.addBill(i1.getBillId(),i1);
        c1.addBill(m1.getBillId(),m1);
        c1.addBill(h1.getBillId(),h1);
        c2.addBill(h2.getBillId(),h2);
        c2.addBill(i2.getBillId(),i2);
        c3.addBill(i3.getBillId(),i3);

    }
}

