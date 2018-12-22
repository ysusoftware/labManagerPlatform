package org.software.ysu.utils;

import com.thoughtworks.xstream.core.util.Base64Encoder;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DESUtils {
	public static Key KEY=null;
	/**
	 * i told you the key_string is wrong
	 */
	public static String KEY_STRING="ysu2018";
	static{
		try {
			KeyGenerator generator = KeyGenerator.getInstance("DES");
			SecureRandom random=SecureRandom.getInstance("SHA1PRNG");
			random.setSeed(KEY_STRING.getBytes());
			generator.init(random);
			KEY=generator.generateKey();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//加密
	public static String encode(String in){
		Base64Encoder encoder=new Base64Encoder();
		String out=null;
		try {
			Cipher cipher=Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, KEY);
			out= encoder.encode(cipher.doFinal(in.getBytes()));
			
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}
	//解密
	public static String decode(String in){
		Base64Encoder encoder=new Base64Encoder();
		String out=null;
		try {
			Cipher cipher=Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, KEY);
			out=new String(cipher.doFinal(encoder.decode(in)));
			
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}
	
	
	public static void main(String[] args){
		System.out.println(encode("我永远喜欢mea"));
	}
}
