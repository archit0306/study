package tools;
public class Dog extends Animal {
	
	
	@Override
    public void speak() {
        System.out.println("bark bark");
    }
	
	
	public void callParent(){
		super.speak();
	}
	
     
	
}