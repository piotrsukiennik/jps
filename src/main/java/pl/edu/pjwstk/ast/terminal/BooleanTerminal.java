package pl.edu.pjwstk.ast.terminal;

import edu.pjwstk.jps.ast.terminal.IBooleanTerminal;
import edu.pjwstk.jps.visitor.ASTVisitor;

public class BooleanTerminal implements IBooleanTerminal {
    private Boolean value;

    public BooleanTerminal(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitBooleanTerminal(this);
    }
}
