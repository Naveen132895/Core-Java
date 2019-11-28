package polymorhism;

public class Calories {
	Float calories;
	Float energy;
	void calculateCalories(Integer bread)
	{
		calories = (float) (bread * 74);
	}
	void calculateCalories(Integer bread,Float jam)
	{
		calories = (bread * 74)+(jam * 26);
	}
	void calculateCalories(Integer bread,Float jam,Float butter)
	{
		calories = (bread * 74)+(jam * 26)+(butter * 102);
	}
	float returnCalories()
	{
		return calories;
	}
	float calculateEnergy()
	{
		return energy = (float) (calories * 4.1868);
	}
}


