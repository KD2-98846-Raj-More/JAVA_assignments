package tester;

enum TrafficLight
{
    RED(60),
    GREEN(45),
    YELLOW(10);

    private int duration;

    TrafficLight(int duration)
    {
        this.duration = duration;
    }

    public int getDuration()
    {
        return duration;
    }
}

public class TrafficLightTester
{
    public static void main(String[] args)
    {
        for(TrafficLight light : TrafficLight.values())
        {
            System.out.println(light + " : " + light.getDuration() + " seconds");
        }
    }
}