package com.pratik.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyRequestAttributeListener
 *
 */
@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {
	
	//attributeRemoved() method
	
	public void attributeRemoved(ServletRequestAttributeEvent e) { 
		
		System.out.println("Attribute Removed["+e.getName()+","+e.getValue()+"]");
		}
	//attributeAdded() method
		public void attributeAdded(ServletRequestAttributeEvent e) { 
			
		System.out.println("Attribute Added["+e.getName()+","+e.getValue()+"]");
		
		}
		
		//AttributeReplaced() method
		public void attributeReplaced(ServletRequestAttributeEvent e) { 
			
		System.out.println("Attribute Replaced["+e.getName()+","+e.getValue()+"]");
		
		}
}
