package v1;

public class Client implements Visitable, PrePostVisitable  {
    private String name;

    public Client(String name){
        this.name=name;
    }

    public void addCommande(Commande cm){

    }

    public void addLigne(String name, Ligne ln){

    }

    @Override
    public void accept(Visitor v) {

    }

    @Override
    public void accept(PrePostVisitor ppv) {

    }
}
