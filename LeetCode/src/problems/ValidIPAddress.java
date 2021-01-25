package problems;

public class ValidIPAddress {

	public static void main(String[] args) {

		String IP = "20EE:FGb8:85a3:0:0:8A2E:0370:7334";
		System.out.print(validIPAddress(IP));
	}

	private static String validIPAddress(String ip) {
		if(validIPv4(ip)) return "IPv4";
		if(validIPv6(ip)) return "IPv6";
		return "Neither";
	}

	private static boolean validIPv6(String IP) {
		String[] str = IP.split("\\.");
		if(str.length != 4) return false;
		if(IP.charAt(IP.length()-1) == '.')return false;
		for(int i = 0; i < str.length; i++){
			try{
				int number = Integer.parseInt(str[i]);
				if(number > 255) return false;
				if((number < 10 && str[i].length()>1) || (number < 100 && str[i].length()>2))return false;
			}
			catch (Exception e){
				return false;
			}
		}
		return true;
	}

	private static boolean validIPv4(String IP) {
        String[] str = IP.split(":");
        if(str.length != 8) return false;
        if(IP.charAt(IP.length()-1) == ':')return false;
        for(int i = 0; i < str.length; i++){
            String currentStr = str[i].toLowerCase();
            if(currentStr.length() >4 || currentStr.length() < 1) return false;
            int count = 0;
            for(int j = 0; j < currentStr.length(); j++){
                char c = currentStr.charAt(j);
                if( ((c >= 48 && c<= 57) || (c >= 97 && c <= 102 ))){
                    if(c == 48)count++;
                    else if(count  == 4) return false; 
                }
                else return false;
            }
        }
        return true;
	}
}
