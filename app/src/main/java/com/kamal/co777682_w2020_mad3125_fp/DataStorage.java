package com.kamal.co777682_w2020_mad3125_fp;

import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;

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
        return customers;
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
       /* let i1 = Internet(billId: "I001", billDate: "20/02/2019", billType: .Internet, totalBill : 40, internetProvider: "Rogers", internetGBUsed: 10)

        let i2 = Internet(billId: "I002", billDate: "14/03/2019", billType: .Internet, totalBill: 20 , internetProvider: "Freedom", internetGBUsed: 5)
        let h1 = Hydro(billId: "H001", billDate: "26/04/2018", billType: .Hydro, totalBill: 110, agencyName: "Planet Energy", unitConsumed: 200)
        let h2 = Hydro(billId: "H002", billDate: "03/09/2019", billType: .Hydro, totalBill: 50, agencyName: "OntarioHydro", unitConsumed: 700)
        let m1 = Mobile(billId: "M001", billDate: "07/09/2019", billType: .Mobile, totalBill: 45, manufacturerName: "Apple Inc.", mobilePlan: "4.5GB + 1000 Min", mobileNumber: "4504500577", internetGBUsed: 4, minuteUsed: 100)

        // let m2 = Mobile(billId: "M002", billDate: "08/09/2019", billType: .Mobile, manufacturerName: "Apple Inc.", mobileNumber: "78947800", mobilePlan:"4.5GB + 1000 Min", internetGBUsed: 2, minuteUsed: 200, planRate: 0.95, internetRate: 5)

        c1.addBill(bill: i1, billId: i1.billId)
        c1.addBill(bill: h1, billId: h1.billId)
        c1.addBill(bill: m1, billId: m1.billId)
        c2.addBill(bill: i2, billId: i2.billId)
        c3.addBill(bill: h2, billId: h2.billId)
        c3.addBill(bill: i2, billId: i2.billId)*/
       customers.add(c1);
       customers.add(c2);
       customers.add(c3);

    }
}

