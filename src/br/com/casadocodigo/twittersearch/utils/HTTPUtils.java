package br.com.casadocodigo.twittersearch.utils;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HTTPUtils {

	public static String acessar(String endereco) {
		try {
			URL url = new URL(endereco);
			
			URLConnection conn = url.openConnection();
			
			InputStream is = conn.getInputStream();
			
			Scanner scann = new Scanner(is);
			
			String conteudo = scann.useDelimiter("\\A").next();
			
			scann.close();
			
			return conteudo;
		} catch (Exception e ) {
			return null;
		}
	}
}
