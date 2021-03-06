package pl.edu.pjwstk.ast.binary;

import edu.pjwstk.jps.ast.IExpression;
import edu.pjwstk.jps.ast.binary.IOrderByExpression;
import edu.pjwstk.jps.visitor.ASTVisitor;

public class OrderByExpression extends BinaryExpression implements IOrderByExpression {

    public OrderByExpression(IExpression leftExpression, IExpression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitOrderByExpression(this);
    }
}
