package com.neotech.lesson10;

public class PrintingHours {

	public static void main(String[] args) {

		// print the whole combination of hours and mins in a digital clock
		// 00:00
		// 00:01
		// ....
		// ....
		// 23:59

		for (int hour = 0; hour < 24; hour++)

		{
			for (int min = 0; min < 60; min++) {

				// System.out.println(hour + ":" + min);

				if (hour < 10 && min < 10) {

					System.out.println("0" + hour + ":" + "0" + min);
				} else if (hour >= 10 && min < 10) {

					System.out.println(hour + ":" + "0" + min);
				} else if (hour<10 && min>=10) {
					System.out.println("0"+hour+":"+min);
				}
				
				else {
					System.out.println(hour+":"+min);
				}

			}

		}

	}

}
