package pacotePrincipal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ScannerBuffer;

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
			System.out.println(String.format("Ocorreu um erro ao carregar o arquivo %s: %s.", args[0], ex.getMessage()));
			System.exit(1);
		}		
		try {    
			AnalisadorLexico al = new AnalisadorLexico(sr);
			ComplexSymbolFactory csf = new ComplexSymbolFactory();
			ScannerBuffer scanner = new ScannerBuffer(al);
			AnalisadorSintatico sint = new AnalisadorSintatico(scanner, csf);
			System.out.println("Analisando arquivo " + args[0] + "...");
			sint.parse();
	        
		} catch (Exception ex) {
			System.out.println(String.format("Ocorreu um erro ao processar o arquivo: %s.", ex.getMessage()));
			System.exit(1);
		}
		
		System.exit(0);
	}
}
