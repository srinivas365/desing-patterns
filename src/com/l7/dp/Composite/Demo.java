package com.l7.dp.Composite;

public class Demo {
	public static void main(String[] args) {
		Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer"); 
        CompositeDirectory engDirectory = new CompositeDirectory(); 
        engDirectory.addEmployee(dev1); 
        engDirectory.addEmployee(dev2); 
          
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager"); 
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager"); 
          
        CompositeDirectory accDirectory = new CompositeDirectory(); 
        accDirectory.addEmployee(man1); 
        accDirectory.addEmployee(man2); 
        
        CompositeDirectory directory = new CompositeDirectory(); 
        directory.addEmployee(engDirectory); 
        directory.addEmployee(accDirectory); 
        directory.getDetails();
        
	}
}
