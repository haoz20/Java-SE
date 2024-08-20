package com.example.app;

import com.example.model.*;

public class Testing {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("John Doe", 101, 50000.0, 0.0, 20000.0);
        Employee e2 = new PartTimeEmployee("Jane Smith", 102, 0.0, 3, 4000.0);
        Employee e3 = new ContractEmployee("Mark Johnson", 103, 0.0, 2, 10000.0);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
