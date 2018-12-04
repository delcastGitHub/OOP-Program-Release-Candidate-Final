/***************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : AudioPlayerDriver.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class tests the AudioPlayer class, it prints the details to the console.
 ***************************************************************************************************************/

package oopprogrambeta;

//This class tests the AudioPlayer class, it prints the details to the console.
public class AudioPlayerDriver {

	public static void main(String[] args) {
		
		//call overloaded constructor from AudioPlayer class
		AudioPlayer audioPlayerTest1 = new AudioPlayer("apple", "apple spec");
		
		System.out.println(audioPlayerTest1);
		
		audioPlayerTest1.play();
		audioPlayerTest1.previous();
		audioPlayerTest1.next();
		audioPlayerTest1.stop();
	}
}//end of AudioPlayerTest


	
	
