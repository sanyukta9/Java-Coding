
//Go to eclipse->Run(Drop down)->Run Configuration->select java file name->Arguments Tab-> Enter 
//values in Program argument textbox--->10 20 30


public class CommandLine {
		public static void main(String[] args) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);//print strings taken in command line
			}
		}
}