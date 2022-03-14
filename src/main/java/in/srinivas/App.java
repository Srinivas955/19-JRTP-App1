package in.srinivas;

import in.srinivas.security.service.PasswordService;

public class App {
  public static void main(String[] args) {
	  PasswordService service = new PasswordService();
	  String encrypt = service.encrypt("Srinvias@1991");
	      System.out.println(encrypt);
	      String decrypt = service.decrypt(encrypt);
	      System.out.println(decrypt);
  }
}
