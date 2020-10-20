package v1;

public class Commande implements Visitable, PrePostVisitable {
    private String name;

    public Commande(String name){
        this.name=name;
    }

    public void addLigne(Ligne ln){

    }

    @Override
    public void accept(PrePostVisitor ppv) {

    }

    @Override
    public void accept(Visitor v) {

    }
}
