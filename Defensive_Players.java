/*
 * Program: NFL Draft
 * File: Defensive_Player.java
 * Summary: Statistics for a Defensive Player
 * Author: Nicholas Thomas
 * Date: January 14, 2017
 * This is my own work
 */

package NFL_Final_Project;

public class Defensive_Players extends NFL_Players {
	
	// defensive player statistics
	private int interceptions;
	private int fumbles;
	private int tackles;
	
	public Defensive_Players() {}
	
	// defensive player constructor
	public Defensive_Players (String name, String position, String team, int height, int weight,
			int age, int experience, String college, int fumbles, int tackles, int interceptions) {
	
	super (name, position, team, height, weight, age, experience, college);
	this.interceptions = interceptions;
	this.fumbles = fumbles;
	this.tackles = tackles;
	}
	
	// getters and setters
	public int getIntersecptions() {
		return interceptions;
	}
	
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	public int getfumbles() {
		return fumbles;
	}
	
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}
	public int getTackles() {
		return tackles;
	}
	
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
}
