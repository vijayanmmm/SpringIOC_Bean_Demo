# SpringIOC_Bean_Demo
This is the demo for spring IOC with dependency injection

There are three POJO Employee, Employee2 and Address

##SpringDemo.cs
1. First demo is to create the object in the traditional way
2. Spring IOC creating object for us - using Bean Factory-  in this method Employee object will be created only when its called - Lazy loading
3. Spring IOC creating object for us - using ApplicationContext - in this method all Employeenobjects will be created at first
4. Spring IOC creating object for us with Dependancy injection - using ApplicationContext - The Employee2 object will be created and wired with Address class
5. in Emplyee and Employee2 class "myinit" method will be called when the object is initiazlied, "mydestroy" Method will be called when its destroyed.
