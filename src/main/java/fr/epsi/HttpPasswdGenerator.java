package c;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class HttpPasswdGenerator {

    public static void main(String[] args) {
        if(args.length != 2){
            System.err.println("Veuillez passer un identifiant et un mot de passe");
            System.exit(-1);
            return;
        }
        String salt = BCrypt.gensalt(9);
        System.out.println(args[0]+":"+BCrypt.hashpw(args[1], salt));
    }
}
