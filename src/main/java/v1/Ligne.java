package v1;

public class Ligne implements PrePostVisitable, Visitable{
    private String name;
    private int sum;

    public Ligne(String name, int sum){

    }
    public Ligne(String name){

    }

    @Override
    public void accept(Visitor v) {

    }

    @Override
    public void accept(PrePostVisitor ppv) {

    }
}
