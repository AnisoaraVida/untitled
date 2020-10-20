package v1;

import java.util.Collection;

public class Commande implements Visitable, PrePostVisitable {
    private String name;
    private Collection<Ligne> lignes;


    public Commande(String name){

        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void addLigne(Ligne ln){
        lignes.add(ln);
    }

    @Override
    public void accept(PrePostVisitor ppv) {
        ppv.preVisit(this);



    }

    @Override
    public void accept(Visitor v) {

    }
}
