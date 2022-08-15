package classe;

public class Usuario {
    String name;
    String email;

    public boolean equals(Object obj) {

        if (obj instanceof Usuario) {
            Usuario other = (Usuario) obj;

            boolean sameName = other.name.equals(this.name);
            boolean sameEmail = other.email.equals(this.email);

            return sameName && sameEmail;
            } else {
                return false;
            }
        }
    }