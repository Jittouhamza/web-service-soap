import proxy.BanqueService;
import proxy.BanqueWS;



public class Client {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(8500));

    }
}
