package v1;

import java.util.Collection;

public class GroupeClient implements PrePostVisitor, Visitor {
    private  String name;
    private Collection<Client> clients;


    @Override
    public void preVisit(GroupeClient gc) {

    }

    @Override
    public void preVisit(Client cl) {

    }

    @Override
    public void preVisit(Commande cm) {

    }

    @Override
    public void preVisit(Ligne ln) {

    }

    @Override
    public void postVisit(GroupeClient gc) {

    }

    @Override
    public void postVisit(Client cl) {

    }

    @Override
    public void postVisit(Commande cm) {

    }

    @Override
    public void postVisit(Ligne ln) {

    }

    @Override
    public void visit(GroupeClient gc) {

    }

    @Override
    public void visit(Client cl) {

    }

    @Override
    public void visit(Commande cm) {

    }

    @Override
    public void visit(Ligne ln) {

    }
}
