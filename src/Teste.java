

import java.math.BigInteger;


public class Teste {

	static String hexToBin(String s) {
		  return new BigInteger(s, 16).toString(2);
	}
	
	static String binToHex(String s) {
		  return new BigInteger(s, 2).toString(16);
	}
	
	static String hexToDec(String s){
		return new BigInteger(s,16).toString(10);
	}
	
	static String binToDec(String s) {
		  return new BigInteger(s, 2).toString(10);
	}
	
	static String decToASCII(String s){
		return ""+((char) Integer.parseInt(s));
	}
	
	public static void main(String args[]){
		
		String msg1 = "32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb85ccb8f3315f4b52e301d16e9f52f904";
		String msg2 = "466d06ece998b7a2fb1d464fed2ced7641ddaa3cc31c9941cf110abbf409ed39598005b3399ccfafb61d0315fca0a314be138a9f32503bedac8067f03adbf3575c3b8edc9ba7f537530541ab0f9f3cd04ff50d";

		
		BigInteger msg1Bin = new BigInteger(hexToBin(msg1),2);
		BigInteger msg2Bin	= new BigInteger(hexToBin(msg2),2);
		
		String msg3 = msg1Bin.xor(msg2Bin).toString(2);
		
		int cont = 0;
		
		while(msg3.length()%8 != 0 && msg3.length() < msg1.length()*4)
			msg3 = "0"+msg3;
		
		while(cont < msg3.length()){
			System.out.print(decToASCII(binToDec(msg3.substring(cont, cont+8))));
			cont+=8;
		}
	}
}

