package com.corejava.memoryAllocation;

import java.awt.Point;

public class MemoryAllocation {
	
	public static void main(String[] args) {
		
	Point p1 = new Point(10,30);

	System.out.println("----point 1-------");
	System.out.println(p1.x);
	System.out.println(p1.y);
	
	
	Point p2 = p1;
	
	
	System.out.println("--------Point 2 ---");
	System.out.println(p2.x);
	System.out.println(p2.y);
	
	p2.x=33;
	p2.y=34;
	
	System.out.println("-----Point 1 -----");
	System.out.println(p1.x);
	System.out.println(p1.y);
	
				
	
	
	
	}

}
