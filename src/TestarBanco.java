public class TestarBanco {
    public static void main(String[] args) {
        Cliente asafe = new Cliente();
        asafe.setNome("Asafe Amâncio Soares de Oliveira");
        asafe.setCpf("108.648.026-09");
        asafe.setProfissao("Desenvolvedor de Sistemas Mobile");

        Conta contaDoAsafe = new Conta();
        contaDoAsafe.deposita(150);

        contaDoAsafe.setTitular(asafe);
        System.out.println(contaDoAsafe.getTitular().getNome());
        System.out.println(contaDoAsafe.getTitular());
        System.out.println(contaDoAsafe.getTitular().getCpf());
    }
}
