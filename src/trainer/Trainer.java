package trainer;

import java.util.*;

public class Trainer {
	//HP,Attack(AT),Defense(DF),S.Attack(Sa),S.Defense(SD),Speed(SP),Level(LVL)
	int[] stats;
	ArrayList<Feats> feats;
	Map<String, Integer> skills = new HashMap<String, Integer>();
	String[] classes;
	String Name;
	int Age;
	String Gender;
	int Height;
	int Weight;
	//derived stats
	int MHP;
	int SPE;
	int DFE;
	int SDE;
	//overland,surface,underwater
	int[] capabilities;
	
	
	public int[] getStats() {
		return stats;
	}
	public void setStats(int[] stats) {
		this.stats = stats;
	}
	public ArrayList<Feats> getFeats() {
		return feats;
	}
	public void setFeats(ArrayList<Feats> feats) {
		this.feats = feats;
	}
	public String[] getClasses() {
		return classes;
	}
	public void setClasses(String[] classes) {
		this.classes = classes;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public int[] getCapabilities() {
		return capabilities;
	}
	public void setCapabilities(int[] capabilities) {
		this.capabilities = capabilities;
	}  
	
}
