package main;

import model.Cliente;
import model.Endereco;
import processadorXML.XMLProcessor;

public class MainClass {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setId(12332);
        c.setNome("Vinicius");
        c.setTelefone("132333223");
        c.setEmail("vinicius@gmail.com");

        Endereco e = new Endereco();
        e.setTipo("Rua");
        e.setLogradouro("Almirante Bandeira");
        e.setNumero(987);
        e.setBairro("Centro");
        e.setCidade("Itapipoca do Norte");
        e.setComplemento("Ap 102 - Torre A");
        e.setUf("SP");
        e.setCep("01234-323");

        c.setEndereco(e);

        try{
            System.out.println(XMLProcessor.generateXML(c));
        }
        catch(Exception ex){
            System.out.println("Deu Ruim!!!");
            ex.printStackTrace();
        }
    }
}
