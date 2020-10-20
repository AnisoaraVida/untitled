package v1;

public interface Visitor extends AbstractVisitor{
    void visit(GroupeClient gc );
    void visit(Client cl );
    void visit(Commande cm);
    void visit(Ligne ln);
}
