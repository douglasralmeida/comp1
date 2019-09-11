package pacotePrincipal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class Compilador {

	public static void main(String[] args) throws IOException {
		StringReader sr = null;
		
		if (args.length < 1) {
			System.out.println("A sintaxe do comando está incorreta.");
			System.out.println("Use: java -p bin\\ -m compilador/pacotePrincipal.Compilador <arquivoentrada>");
			System.exit(1);
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    br.close();
		    sr = new StringReader(sb.toString());
		} catch (IOException ex) {
			System.out.println("Ocorreu um erro ao carregar o arquivo.");
			System.exit(1);
		}		
		try {    
			AnalisadorLexico lex = new AnalisadorLexico(sr);
	        lex.yylex();
		} catch (IOException ex) {
			System.out.println("Ocorreu um erro ao processar o arquivo.");
			System.exit(1);
		}
		
		System.exit(0);
	}
}
