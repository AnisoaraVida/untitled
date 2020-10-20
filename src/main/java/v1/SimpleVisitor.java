package v1;

public class SimpleVisitor implements Visitor {
    @Override
    public void visit(GroupeClient gc) {
        System.out.println("je visite un groupe");
    }

    @Override
    public void visit(Client cl) {
        System.out.println(String.format("je visite un client ", cl.getName()));
    }

    @Override
    public void visit(Commande cm) {
        System.out.println(String.format("je visite une commande ", cm.getName()));
    }

    @Override
    public void visit(Ligne ln) {
        System.out.println(String.format("je visite une ligne %s", ln.getName()));
    }
}
