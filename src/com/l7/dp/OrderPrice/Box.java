package com.l7.dp.OrderPrice;

import java.util.ArrayList;
import java.util.List;

public class Box implements Entity {
	private List<Entity> entities=new ArrayList<Entity>();
	
	public void addEntity(Entity entity) {
		entities.add(entity);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		double temp=0;
		for (Entity entity : entities) {
			temp+=entity.getPrice();
		}
		
		return temp;
	}
	
}
