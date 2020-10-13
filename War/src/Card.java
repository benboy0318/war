

 class Card
	{
		static String suit;
		static int number;
		static String type;
		
		public Card(String t, String s, int n)
		{
			type = t;
			number = n;
			suit = s;
		}
		public static String getSuit()
		{
			return suit;
		}

	public static void setSuit(String suit)
		{
			Card.suit = suit;
		}

	public static int getNumber()
		{
			return number;
		}

	public static void setNumber(int number)
		{
			Card.number = number;
		}

	public static String getType()
		{
			return type;
		}

	public static void setType(String type)
		{
			Card.type = type;
		}

		
	}
