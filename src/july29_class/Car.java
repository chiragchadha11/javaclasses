package july29_class;

public class Car
{
    private String brand_name;
    private String engine_type;
    private String colour;

    public void setBrand_name(String brand_name)
    {
        this.brand_name=brand_name;
    }
    public void setEngine_type(String engine_type)
    {
        this.engine_type=engine_type;
    }
    public void setColour(String colour)
    {
        this.colour=colour;
    }

    public String getBrand_name()
    {
        return brand_name;
    }
    public String getEngine_type()
    {
        return engine_type;
    }
    public String getColour()
    {
        return colour;
    }
}
