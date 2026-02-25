public class EvalVisitor extends CalculadoraBaseVisitor<Integer> {

    @Override
    public Integer visitPrintExpr(CalculadoraParser.PrintExprContext ctx) {
        int value = visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Integer visitBlank(CalculadoraParser.BlankContext ctx) {
        return 0;
    }

    @Override
    public Integer visitExpr(CalculadoraParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        }

        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            return visit(ctx.expr(0));
        }

        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        String op = ctx.op.getText();

        switch (op) {
            case "*":
                return left * right;
            case "/":
                return left / right;
            case "+":
                return left + right;
            case "-":
                return left - right;
        }

        return 0;
    }
}
