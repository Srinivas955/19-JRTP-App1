package in.srinivas.security.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService 
{
	public String encrypt(String text)
	{
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
	}
	public String decrypt(String encryptedText) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encryptedText);
		return new String(decode);
	}
	
}
