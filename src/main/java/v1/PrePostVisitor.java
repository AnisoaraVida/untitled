package v1;


public interface PrePostVisitor extends AbstractVisitor {
    void preVisit(GroupeClient gc);
    void preVisit(Client cl);
    void preVisit(Commande cm);
    void preVisit(Ligne ln);
    void postVisit(GroupeClient gc);
    void postVisit(Client cl);
    void postVisit(Commande cm);
    void postVisit(Ligne ln);
}
