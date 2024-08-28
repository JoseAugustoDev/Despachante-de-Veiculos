package projetotelas;

import javax.swing.*;

/**
 * A classe <tt>leDadosWin</tt> permite a leitura de dados de tipos nativos e de
 * inst?ncias da classe <tt>String</tt> a partir do teclado, atrav?s de uma
 * janela. Basicamente esta classe encapsula o funcionamento dos m?todos da clase
 * <tt>JOptionPane</tt>, que pode ser usado como entrada padr?o de dados.
 * <ul>
 * <li>Os m?todos s?o est?ticos para facilitar o uso da classe
 * <li>Cria??o de m?todos sobrecarregados para que valores <i>default</i> possam ser 
 *     usados
 * <li>Tratamento das exce??es
 *   
 * @author Cinthia Cristina Lucio Caliari
 * @version 1.1
 */

public class InOut {
	/**
	 * Este m?todo ? para entrada de uma String. Tem como par?metro de entrada
	 * uma String que indicar? para o usu?rio qual o dado que ser? lido naquele
	 * momento por aquela caixa de texto e retorna a String lida
	 * 
	 * @param frase que ser? usada para o usu?rio saber qual dado ser? lido
	 * @return String que foi lida
	 */
	public static String leString (String frase){
		String Entrada;
		
		Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
											   JOptionPane.QUESTION_MESSAGE);
		return Entrada;
	}
	
	/**
	 * Este m?todo ? para entrada de um objeto do tipo byte. Tem como par?metro 
	 * de entrada uma String que indicar? para o usu?rio qual o dado que ser? 
	 * lido naquele momento por aquela caixa de texto. 
	 * L? ent?o uma String e a converte para um objeto do tipo byte. 
	 * Se na convers?o ocorrer algum erro, o processo ser? feito novamente, 
	 * ou seja, ser? lida outra String e convertida para byte. O processo s? 
	 * p?ra quando a convers?o for bem sucedida.  
	 * 
	 * @param frase que ser? usada para o usu?rio saber qual dado ser? lido
	 * @return um objeto do tipo byte
	 */
	public static byte leByte (String frase){
		byte num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Byte.parseByte(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N?MERO DO TIPO " +
											  "BYTE", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}
	
	/**
	 * Este m�todo � para entrada de um objeto do tipo short. Tem como parametro
	 * de entrada uma String que indicar para o usu�rio qual o dado que ser
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e a converte para um objeto do tipo short.
	 * O processo so para quando a conversao for bem sucedida.
	 * 
	 * @param frase que ser usada para o usu�rio saber qual dado sera lido
	 * @return um objeto do tipo short
	 */
	public static short leShort (String frase){
		short num=0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Short.parseShort(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N?MERO DO TIPO " +
											  "SHORT", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}
	
	/**
	 * Este m?todo ? para entrada de um objeto do tipo int. Tem como par?metro 
	 * de entrada uma String que indicar? para o usu?rio qual o dado que ser? 
	 * lido naquele momento por aquela caixa de texto. 
	 * L? ent?o uma String e a converte para um objeto do tipo int. 
	 * O processo s? p?ra quando a convers?o for bem sucedida.  
	 * 
	 * @param frase que ser? usada para o usu?rio saber qual dado ser? lido
	 * @return um objeto do tipo int
	 */
	public static int leInt (String frase){
		int num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Integer.parseInt(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N?MERO DO TIPO " +
											  "INTEIRO ", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}
	
	/**
	 * Este m?todo ? para entrada de um objeto do tipo long. Tem como par?metro 
	 * de entrada uma String que indicar? para o usu?rio qual o dado que ser? 
	 * lido naquele momento por aquela caixa de texto. 
	 * L? ent?o uma String e a converte para um objeto do tipo long. 
	 * O processo s? p?ra quando a convers?o for bem sucedida.  
	 * 
	 * @param frase que ser? usada para o usu?rio saber qual dado ser? lido
	 * @return um objeto do tipo long
	 */
	public static long leLong (String frase){
		long num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Long.parseLong(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N?MERO DO TIPO " +
											  "LONG ", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}

	/**
	 * Este m?todo ? para entrada de um objeto do tipo float. Tem como par?metro 
	 * de entrada uma String que indicar? para o usu?rio qual o dado que ser? 
	 * lido naquele momento por aquela caixa de texto. 
	 * L? ent?o uma String e a converte para um objeto do tipo float. 
	 * O processo s? p?ra quando a convers?o for bem sucedida.  
	 * 
	 * @param frase que ser? usada para o usu?rio saber qual dado ser? lido
	 * @return um objeto do tipo float
	 */
	public static float leFloat (String frase){
		float num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   JOptionPane.QUESTION_MESSAGE);
				num = Float.parseFloat(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N?MERO DO TIPO " +
 											  "FLOAT", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}

	/**
	 * Este m?todo ? para entrada de um objeto do tipo double. Tem como par?metro 
	 * de entrada uma String que indicar? para o usu?rio qual o dado que ser? 
	 * lido naquele momento por aquela caixa de texto. 
	 * L? ent?o uma String e a converte para um objeto do tipo double. 
	 * O processo s? p?ra quando a convers?o for bem sucedida.  
	 * 
	 * @param frase que ser? usada para o usu?rio saber qual dado ser? lido
	 * @return um objeto do tipo double
	 */
	public static double leDouble (String frase){
		double num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Double.parseDouble(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N?MERO DO TIPO " +
											  "DOUBLE", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}

	/**
	 * Este m?todo ? para entrada de um objeto do tipo char. Tem como par?metro 
	 * de entrada uma String que indicar? para o usu?rio qual o dado que ser? 
	 * lido naquele momento por aquela caixa de texto. 
	 * L? ent?o uma String e retorna apenas o primeiro caracter da String.  
	 * 
	 * @param frase que ser? usada para o usu?rio saber qual dado ser? lido
	 * @return um objeto do tipo char
	 */
	public static char leChar (String frase){
		String Entrada;
		boolean ERRO;
		
		do{
			Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
					   								JOptionPane.QUESTION_MESSAGE);
			if (Entrada.length()!= 0)
				ERRO = false;
			else
				ERRO = true;
		}while (ERRO);
		return Entrada.charAt(0);
	}
	
	/**
	 * Este m?todo foi criado para mandar uma mensagem com o ?cone de
	 * ERRO
	 *  
	 * @param cabecalho que aparecer? no topo da mensagem
	 * @param frase     que aparecer? dentro da caixa de mensagem
	 */
	public static void MsgDeErro(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho,
				  					  JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Este m?todo foi criado para mandar uma mensagem com o ?cone de
	 * INFORMA??O
	 *  
	 * @param cabecalho que aparecer? no topo da mensagem
	 * @param frase     que aparecer? dentro da caixa de mensagem
	 */
	public static void MsgDeInforma(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho,
				  					  JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Este m�todo foi criado para mandar uma mensagem sem ?cone
	 *  
	 * @param cabecalho que aparecer no topo da mensagem
	 * @param frase     que aparecer dentro da caixa de mensagem
	 */
	public static void MsgSemIcone(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho,
				  					  JOptionPane.PLAIN_MESSAGE);
	}
	
	/**
	 * Este m�todo foi criado para mandar uma mensagem com o �cone de
	 * AVISO
	 *  
	 * @param cabecalho que aparecer no topo da mensagem
	 * @param frase     que aparecer dentro da caixa de mensagem
	 */
	public static void MsgDeAviso (String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho,
				  					  JOptionPane.WARNING_MESSAGE);
	}
}