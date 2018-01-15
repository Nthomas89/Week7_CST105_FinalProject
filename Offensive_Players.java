/*
 * Program: NFL Draft
 * File: Offensive_Players.java
 * Summary: Statistics for Offensive players
 * Author: Nicholas Thomas
 * Date: January 14, 2017
 * This is my own work
 */

package NFL_Final_Project;

public class Offensive_Players extends NFL_Players{
	
	// statistics for Offensive Players
	private int receptions;
	private int touchdowns;
	private double averageYards;
	private int interceptions;
	
	// Constructor for offensive Players Variables
	public Offensive_Players (String name, String position, String team, int height, int weight,
			int age, int experience, String college, int receptions, int touchdowns, double averageYards, int interceptions) {
	
	super (name, position, team, height, weight, age, experience, college);
	this.receptions = receptions;
	this.touchdowns = touchdowns;
	this.averageYards = averageYards;
	this.interceptions = interceptions;
	
	}
	
	public Offensive_Players() {}
	
	// setters and getters
	public int getReceptions() {
		return receptions;
	}
	
	public void setReceptions(int receptions) {
		this.receptions = receptions;
	}
	public int getTouchdowns() {
		return touchdowns;
	}
	
	public void settouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	public int getInterceptions() {
		return interceptions;
	}
	
	public void setInterceptions(int interceptions) {
		this.interceptions  = interceptions;
	}
	
	public double getAverageYards() {
		return averageYards;
	}
	
	public void setAverageYards(double averageYards) {
		this.averageYards = averageYards;
	}
}
