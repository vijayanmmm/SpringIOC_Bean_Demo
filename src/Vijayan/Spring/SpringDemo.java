package Vijayan.Spring;

//import javax.annotation.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class SpringDemo {

	public static void main(String[] args) {
		
		//METHOD 1 -  Using Traditional method
		// TODO Auto-generated method stub
		Employee objEmp = new Employee();
		
		objEmp.setEmpID(100);
		objEmp.setEmpName("Vijay");
		objEmp.setEmpAdd("South China");
		
		System.out.print("Employee object details:" + objEmp.toString());;
	
		////METHOD 2 - Using Spring, Ioc-Inversion of Control
		Resource rs = new ClassPathResource("Employee.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
		Employee objEmp1 = bf.getBean("employeeBean1",Employee.class);
		System.out.println("Employee object details:" + objEmp1.toString());;
		
		Employee objEmp2 = bf.getBean("employeeBean2",Employee.class);
		System.out.println("Employee object details:" + objEmp2.toString());;	
		
		//METHOD 3 - Using Spring, IOC - using Application Context
		ApplicationContext con = new ClassPathXmlApplicationContext("Employee.xml");
		Employee objE1 = (Employee) con.getBean("employeeBean1");
		Employee objE2 = (Employee) con.getBean("employeeBean2");
		System.out.println("Employee object details:" + objE1);
		System.out.println("Employee object details:" + objE2);
		ClassPathXmlApplicationContext conObj = (ClassPathXmlApplicationContext)con;
		conObj.close();
		
		//IOC with Dependency injection
		ApplicationContext con1 = new ClassPathXmlApplicationContext("Employee2.xml");
		Employee2 objEmp2_1 = (Employee2) con1.getBean("employeeBean1");
		Employee2 objEmp2_2 = (Employee2) con1.getBean("employeeBean2");	
		System.out.println("Employee object details:" + objEmp2_1);
		System.out.println("Employee object details:" + objEmp2_2);
		ClassPathXmlApplicationContext con1Obj = (ClassPathXmlApplicationContext) con1;
		con1Obj.close(); 
	}
}

