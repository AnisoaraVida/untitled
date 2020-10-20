package main;


import com.sun.tools.javac.code.Types;
import v1.*;

public class Main {
    public static void main(String[] args){
        AbstractVisitor xmlVisitor = new XMLRapportCommandes();
        AbstractVisitor printVisitor = new PrintRapportCommandes();
        AbstractVisitor simpleVisitor = new SimpleVisitor();


    }

}
