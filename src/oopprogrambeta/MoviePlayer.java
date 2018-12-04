/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : MoviePlayer.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This is a subclass of Product and implememtns the interface MultimediaControl. Moreover,
 * 				  this class allows us to capture details of movie player items. 
 ************************************************************************************************************/

package oopprogrambeta;

//It sets characteristics and functions of an movie player product.
public class MoviePlayer extends Product implements MultimediaControl {

	Screen screenType;							//Screen type object named screenType to hold the screen specs (resolution, refresh rate, and response time)
	MonitorType monitorType;					//MonitorType object named monitorType to hold the monitor type (LCD or LED)
	
	/**
     * This constructor sets the product's name into variable from its superclass. Also,
     * it creates a screen object and select the type of monitor of the product.
     * @param: name, the name of the move player product.
     */
	public MoviePlayer (String name) {
		super(name);								// variable name from superclass Product
		screenType = new Screen("1040X768",120,10);	// create and instant of the object Screen named screenType
		monitorType= MonitorType.LCD;				
	}
	
	/**
     * This overloaded constructor sets details of the movie player product. 
     * @param: name. It is the name of the movie player product.
     * @param: screenType. It isthe screen specs (resolution, refresh rate, and response time).
     * @param: monitorType. It is the type of monitor of the movie player product (LCD or LED).
     */
	public MoviePlayer(String name, Screen screenType, MonitorType monitorType) {
		super(name);							//Variable name from superclass Product
		this.screenType=screenType;				
		this.monitorType=monitorType;			
	}

	@Override
	public void play() {
		System.out.println("playing");			//to emulate play instruction
	}

	@Override
	public void stop() {
		System.out.println("stop");				//to emulate stop instruction
	}

	@Override
	public void previous() {
		System.out.println("previous");			//to emulate previous instruction
	}

	@Override
	public void next() {
		System.out.println("next");				//to emulate next instruction
	}

	/**
     * A toString method will print information about the movie player product.
     * @return:The screen specs (resolution, refresh rate, and response time)
     * @return:the monitor type
     */
	public String toString() {
		return
				super.toString()+ "\n"+
				"Screen : " + screenType+ "\n"+
				"Monitor Type : " + monitorType;
	}
} //end of MoviePlayer class
