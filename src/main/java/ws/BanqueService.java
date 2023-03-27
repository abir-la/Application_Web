package ws;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService(serviceName="BanqueWs")
public class BanqueService {
    @WebMethod(operationName="conversionEutotoDh")
    public double conversion(@WebParam(name="montant") double mt){
        return mt*11.3;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code") int code){
        return new Compte(code, Math.random()*65000, new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random()-65000, new Date()),
                new Compte(2, Math.random()-65000, new Date()),
                new Compte(3, Math.random()-65000, new Date())


        );
    }

}
