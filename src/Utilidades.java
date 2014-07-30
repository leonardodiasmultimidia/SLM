


public class Utilidades {
	
	public static String binarioToDecimal(String binario){
		
		int output = 0;
		while(binario.length()>0){
			output += Integer.parseInt(""+binario.charAt(0))*((Math.pow(2, binario.length()-1)));
			binario = binario.substring(1);
		}
		return ""+output;
	}
	
	public static char decimalToASCII(int decimal){
		return (char) decimal;
	}
	
	public static String hexaToBinario(String hexa){
		
		String output = "";
		char[] hexaChar = hexa.toCharArray();
		int cont = 0;
		while(cont < hexaChar.length)
			switch(hexaChar[cont++]){
				case '1':
					output += "0001";
				break;
				
				case '2':
					output += "0010";
				break;

				case '3':
					output += "0011";
				break;
				
				case '4':
					output += "0100";
				break;
				
				case '5':
					output += "0101";
				break;
				
				case '6':
					output += "0110";
				break;
				
				case '7':
					output += "0111";
				break;
				
				case '8':
					output += "1000";
				break;
				
				case '9':
					output += "1001";
				break;
				
				case 'a':
					output += "1010";
				break;
				
				case 'b':
					output += "1011";
				break;
				
				case 'c':
					output += "1100";
				break;
				
				case 'd':
					output += "1101";
				break;
				
				case 'e':
					output += "1110";
				break;
				
				case 'f':
					output += "1111";
				break;
				
			}
		return output;
	}
	
	public static void main(String args[]){
		
		System.out.println(decimalToASCII(97));
	}
}
