public class reverser {
	public static void main(String[] args) {
		new reverser().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		StringBuilder string = new StringBuilder("fjHUejdA39D\\moc.ebutuoy");
		StringBuffer buffer = new StringBuffer();
		int length = string.length();
		for(int i = length - 1; i > -1; i--)
		{
			buffer.append(string.charAt(i));
		}
		System.out.println(buffer + "");
	}
}

