package bjcc_idrn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.*;
import visitor.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 No pacote visitor há uma classe denominada PrettyPrintVisitor, 
		 que você pode utilizar para testar o seu parser e programa. 
		 Na classe Main, você deverá colocar a chamada ao parser gerado por ANTLR, 
		 armazenando o resultado em um objeto do tipo Program, com o nome prog. 
		 Uma vez feito o parsing do arquivo, 
		 em seguida chame o método accept passando o PrettyPrintVisitor, 
		 como ilustrado abaixo: 
		 
		//programa na forma de AST
		Program prog; //obter objeto usando parser ANTLR definido
		//chama o visitor de pretty print
		prog.accept(new PrettyPrintVisitor());
		 */
		
		
		InputStream arquivo = new FileInputStream("entrada.txt");
		
		ANTLRInputStream inputStream = new ANTLRInputStream(arquivo);
		
		bjcc_idrnLexer lexer = new bjcc_idrnLexer(inputStream);
        
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        
		bjcc_idrnParser parser = new bjcc_idrnParser(tokenStream);
		
		bjcc_idrnBaseVisitor Ast = new bjcc_idrnBaseVisitor();
		
		
		Program prog = (Program) Ast.visitGoal(parser.goal());
		
//		prog.accept(new PrettyPrintVisitor());
		
		
		
		//programa na forma de AST - obter objeto a partir do parser...
//		Program prog = ... ;
		
		
		BuildSymbolTableVisitor stVis = new BuildSymbolTableVisitor();
		//construindo tabela de símbolos
		prog.accept(stVis); 
		//fazendo a checagem de tipos
		prog.accept(new TypeCheckVisitor(stVis.getSymbolTable())); 
	
		
	}

}
