/*
 * Program: NFL Draft
 * File: NFL_payers.java
 * Summary: Modified NFL Player class
 * Author: Nicholas Thomas
 * Date: January 14, 2018
 * This is my own work
 */

package NFL_Final_Project;

 public abstract class NFL_Players {
	
	//Declare variables
			String name;
			private String position;
			private String team;
			private int height;
			private int weight;
			private int age;
			private int experience;
			private String college;
			
			//Constructor without parameters
			public NFL_Players() {
				super();
			}
			
			//Constructor that accepts all of the variables as parameters except BMI and rookieAge
			public NFL_Players(String name, String position, String team, int height, int weight,
					int age, int experience, String college) {
				super();
				this.name = name;
				this.position = position;
				this.team = team;
				this.height = height;
				this.weight = weight;
				this.age = age;
				this.experience = experience;
				this.college = college;
			
			}
			// getters and setters
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
			
			public String getPosition() {
				return position;
			}
			
			public void setPosition(String position) {
				this.position = position;
			}
			
			public int getHeight() {
				return height;
			}
			
			public void setHeight(int height) {
				this.height = height;
			}
			
			public int getWeight() {
				return weight;
			}
			
			public void setWeight(int weight) {
				this.weight = weight;
			}
			
			public int getAge() {
				return age;
			}
			
			public void setAge(int age) {
				this.age = age;
			}

			public int getExperience() {
				return experience;
			}

			public void setExperience(int experience) {
				this.experience = experience;
			}

			public String getCollege() {
				return college;
			}

			public void setCollege(String college) {
				this.college = college;
			}

			public String getTeam() {
				return team;
			}

			public void setTeam(String team) {
				this.team = team;
			}

}
