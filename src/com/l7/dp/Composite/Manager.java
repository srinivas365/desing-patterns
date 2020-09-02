package com.l7.dp.Composite;

public class Manager implements Employee {
	private String name; 
    private long empId; 
        private String position; 
  
    public Manager(long empId, String name, String position) 
    { 
        this.empId = empId; 
        this.name = name; 
                this.position = position; 
    } 
      

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println(empId+" "+name);
		
	}

}
