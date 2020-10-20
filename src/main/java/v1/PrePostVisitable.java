package v1;

public interface PrePostVisitable extends AbstractVisitor {
    void accept(PrePostVisitor ppv);
}
