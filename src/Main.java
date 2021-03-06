import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by petrovich on 02.05.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CLexer clexer = new CLexer(CharStreams.fromStream(new FileInputStream(new File("input.txt"))));
        TokenStream ctk = new CommonTokenStream(clexer);
        CParser cpar = new CParser(ctk);
        cpar.start();
    }
}
