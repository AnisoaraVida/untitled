package v1;

import java.util.Collection;
import java.util.Map;

public class Client implements Visitable, PrePostVisitable  {
    private String name;
    private Collection<Commande> commandes;
    private Map<String, Ligne> lignes;


    public Client(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void addCommande(Commande cm){
        commandes.add(cm);
    }

    public void addLigne(String name, Ligne ln){
        lignes.put(name, ln);
    }

    @Override
    public void accept(Visitor v) {

    }

    @Override
    public void accept(PrePostVisitor ppv) {

    }
}
