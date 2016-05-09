public class MainBici{
    public MainBici(Usuario datos){
    	System.out.println("A");
		DescBici window = new DescBici(datos);
		window.setVisible(true);
    }
}