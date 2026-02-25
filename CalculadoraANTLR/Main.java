import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Uso: java Main archivo.txt");
            return;
        }

        CharStream input = CharStreams.fromFileName(args[0]);

        CalculadoraLexer lexer = new CalculadoraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculadoraParser parser = new CalculadoraParser(tokens);

        ParseTree tree = parser.prog();

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
