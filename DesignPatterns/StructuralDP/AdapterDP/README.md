# ADAPTER DESIGN PATTERN

- This is structural Design Pattern 
- Here basically we try to make a bridge between incompatible interfaces 
- Basically the 3rd party incompatible is made to collaborate with the existing interface
- This can be done by creating a Adapter class which will inherit from our existing interface and has the incomptaible class (inherited from incompatible interfce) as an adaptee and in this class we will write a method which will convert from incompatible to compatible


**E.g.** Memory Card reader is an adapter which bridges the memory chip and laptop.

<img src="C:\Users\Sahil Kumar Naik\Desktop\Pvt\LLD\images\AdapterDP.png">