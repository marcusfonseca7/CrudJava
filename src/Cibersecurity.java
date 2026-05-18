public class Cibersecurity extends Pessoa {
        private String distroLinux;

        public Cibersecurity(String nome, int idade, String telefone, String distroLinux) {
            super(nome, idade, telefone);
            this.distroLinux = distroLinux;
        }

    public String getDistroLinux() {
        return distroLinux;
    }

    public void setDistroLinux(String distroLinux) {
        this.distroLinux = distroLinux;
    }

    @Override
        public String toString() {
            return super.toString() + " Distribuição do Linux: " + distroLinux;
        }
}
