package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jdk.dynalink.Operation;

import java.util.Date;
import java.util.List;

@WebService(serviceName="BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")

    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11.30;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 9856, new Date());

    }

    @WebMethod
    public List<Compte> listComptes() {

        return List.of(
                new Compte(1, Math.random() * 9856, new Date()),
                new Compte(2, Math.random() * 9856, new Date()),
                new Compte(3, Math.random() * 9856, new Date())
        );
    }
}